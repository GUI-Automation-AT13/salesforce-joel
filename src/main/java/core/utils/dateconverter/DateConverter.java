package core.utils.dateconverter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;
import org.apache.commons.lang3.ArrayUtils;

/**
 * Transform a time phrase to a Date entity.
 */
public class DateConverter {

    /**
     * Transform a time phrase to a date entity.
     *
     * @param phrase is a string that we want to transform.
     * @return a date entity.
     */
    public static Date transform(String phrase) throws ParseException {
        validate(phrase);
        if (isCorrect(phrase)) {
            return createDate(phrase);
        } else {
            Time time = converter(phrase);
            int valueUnity = TimeUnity.valueOf(time.getUnity()).getValue();
            return calculate(valueUnity, time.getAmount());
        }
    }

    /**
     * Validates basic requisites of time phrase.
     *
     * @param phrase is the string that we want to validate.
     */
    public static void validate(String phrase) {
        if (phrase == null) {
            throw new IllegalArgumentException("Time Phrase can not be null");
        }
        if (phrase.isBlank()) {
            throw new IllegalArgumentException("Time Phrase can not be empty or blank");
        }
    }

    /**
     * Calculates a date given time units amount and type.
     *
     * @param election is an integer that represents type.
     * @param value is an integer that represents amount.
     * @return a date entity.
     */
    public static Date calculate(int election, int value) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(election, value);
        return calendar.getTime();
    }

    /**
     * Counts how many words has a phrase.
     *
     * @param phrase anyone we want to count.
     * @return an integer.
     */
    public static int countWords(String phrase) {
        StringTokenizer stringTokenizer = new StringTokenizer(phrase);
        return stringTokenizer.countTokens();
    }

    /**
     * Verifies if a daily time unity exists in the array.
     *
     * @param timeUnity is a string.
     * @return a boolean.
     */
    private static boolean existDailyTimeUnit(String timeUnity) {
        String[] days = {"today", "yesterday", "tomorrow"};
        return ArrayUtils.contains(days, timeUnity);
    }

    /**
     * Verifies if a time unity exists in the array.
     *
     * @param timeUnity is a string.
     * @return a boolean.
     */
    private static boolean existTimeUnit(String timeUnity) {
        String[] days = {"seconds", "minutes", "hours", "days", "months", "years", "second", "minute", "hour", "day",
                         "month", "year"};
        return ArrayUtils.contains(days, timeUnity);
    }

    /**
     * Converts a time phrase to time entity.
     *
     * @param phrase is a string.
     * @return a time entity.
     */
    public static Time converter(String phrase) {
        if (countWords(phrase) == 1) {
            phrase = phrase.toLowerCase().trim();
            if (existDailyTimeUnit(phrase)) {
                return new Time(Daily.valueOf(phrase).getDaily(), Daily.valueOf(phrase).getValue());
            } else {
                throw new IllegalArgumentException("Time word is not valid");
            }
        } else if (countWords(phrase) < 5) {
            phrase = phrase.toLowerCase().trim();
            String[] dateList = phrase.split(" ");
            if (dateList[0].matches("[0-9]*") && existTimeUnit(dateList[1])) {
                return new Time(dateList[1], Daily.valueOf(dateList[2]).getValue()
                        * Integer.parseInt(dateList[0]));
            } else {
                throw new IllegalArgumentException("Time phrase does not have the correct format");
            }
        } else {
            throw new IllegalArgumentException("Time phrase does not have the correct format");
        }
    }

    /**
     * Creates a date with a string that has format.
     *
     * @param stringDate is string that represents date.
     * @return a date.
     * @throws ParseException in case date couldn't be created.
     */
    private static Date createDate(String stringDate) throws ParseException {
        stringDate.replace("-", "/");
        return new SimpleDateFormat("MM/dd/yyyy").parse(stringDate);
    }

    /**
     * Verifies a string has correct format.
     *
     * @param stringDate is string that represents date.
     * @return a boolean.
     */
    private static boolean isCorrect(String stringDate) {
        return stringDate.matches("^(0?[1-9]|1[012])[/-](0?[1-9]|[12][0-9]|3[01])[/-]((19|20)\\d\\d)$");
    }

    /**
     * Gets recent date in string format.
     *
     * @return a string.
     */
    public static String getRecentDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("d/M/yyyy");
        return sdf.format(new Date());
    }
}
