package core.utils;


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
    public static Date transform(String phrase) {
        Time time = converter(phrase);
        int valueUnity = TimeUnity.valueOf(time.getUnity()).getValue();
        return calculate(valueUnity, time.getAmount());
    }

    /**
     * Calculates a date given time units amount and type.
     *
     * @param election is an integer that represents type.
     * @param value is an integer that represents amount.
     * @return a date entity.
     */
    public static Date calculate(int election, int value) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(election, value);
        return date = calendar.getTime();
    }

    /**
     * Counts how many words has a phrase.
     *
     * @param phrase anyone we want to count.
     * @return an integer.
     */
    public static int countWords(String phrase) {
        StringTokenizer stringTokenizer = new StringTokenizer(phrase);
        int amount = stringTokenizer.countTokens();
        return amount;
    }

    /**
     * Verifies if a daily time unity exists in the array.
     *
     * @param timeUnity is a string.
     * @return a boolean.
     */
    public static boolean exist(String timeUnity) {
        String[] days = {"today", "yesterday", "tomorrow"};
        boolean val = ArrayUtils.contains(days, timeUnity);
        return val;
    }

    /**
     * Converts a time phrase to time entity.
     *
     * @param daily is a string.
     * @return a time entity.
     */
    public static Time converter(String daily) {
        Time time;
        if (countWords(daily) == 1) {
            daily = daily.toLowerCase().trim();
            if (exist(daily)) {
                return time = new Time(Daily.valueOf(daily).getDaily(), Daily.valueOf(daily).getValue());
            }
        } else {
            daily = daily.toLowerCase().trim();
            String[] dateList = daily.split(" ");
            return time = new Time(dateList[1], Daily.valueOf(dateList[2]).getValue()
                    * Integer.parseInt(dateList[0]));
        }
        return new Time();
    }
}
