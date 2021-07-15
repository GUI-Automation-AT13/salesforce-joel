package unittest.core.utils;

import core.utils.DateConverter;
import core.utils.Time;
import core.utils.TimeUnity;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DateConverterTest {

    @Test
    public void testCountCorrectWordsInPhrase() {
        String phrase = "How many words are there?";
        int wordAmount = DateConverter.countWords(phrase);
        int expectedWordAmount = 5;
        Assert.assertEquals(expectedWordAmount, wordAmount, "Number of words are not correct");
    }

    @Test
    public void testExistDailyTimeUnitInArray() {
        String dailyUnity = "today";
        boolean exist = DateConverter.exist(dailyUnity);
        Assert.assertTrue(exist, "That word does not exist in array");
    }

    @Test
    public void testNotExistAnyWordInArray() {
        String dailyUnity = "tonight";
        boolean exist = DateConverter.exist(dailyUnity);
        Assert.assertFalse(exist, "That word exists in array");
    }

    @Test
    public void testConvertPastDatePhraseToTimeEntity() {
        String timePhrase = "2 days ago";
        Time time = DateConverter.converter(timePhrase);
        Assert.assertEquals(time.getAmount(), -2, "The amount of units are not correct");
        Assert.assertEquals(time.getUnity(), "days", "The type of units are not correct");
    }

    @Test
    public void testConvertFutureDatePhraseToTimeEntity() {
        String timePhrase = "3 years from now";
        Time time = DateConverter.converter(timePhrase);
        Assert.assertEquals(time.getAmount(), 3, "The amount of units are not correct");
        Assert.assertEquals(time.getUnity(), "years", "The type of units are not correct");
    }

    @Test
    public void testCalculateFutureDate() {
        int timeUnityValue = TimeUnity.days.getValue();
        int timeUnityAmount = 10;
        Date date = DateConverter.calculate(timeUnityValue, timeUnityAmount);
        Date expectedDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 10);
        expectedDate = calendar.getTime();
        Assert.assertEquals(date, expectedDate, "The calculated date is not correct");
    }

    @Test
    public void testCalculatePastDate() {
        int timeUnityValue = TimeUnity.years.getValue();
        int timeUnityAmount = -3;
        Date date = DateConverter.calculate(timeUnityValue, timeUnityAmount);
        Date expectedDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, -3);
        expectedDate = calendar.getTime();
        Assert.assertEquals(date, expectedDate, "The calculated date is not correct");
    }

    @Test
    public void testTransformDatePhraseToPastDate() {
        String timePhrase = "5 months ago";
        Date date = DateConverter.transform(timePhrase);
        Date expectedDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, -5);
        expectedDate = calendar.getTime();
        Assert.assertEquals(date, expectedDate, "the date did not transform correctly");
    }

    @Test
    public void testTransformDatePhraseToFutureDate() {
        String timePhrase = "1 years from now";
        Date date = DateConverter.transform(timePhrase);
        Date expectedDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, 1);
        expectedDate = calendar.getTime();
        Assert.assertEquals(date, expectedDate, "the date did not transform correctly");
    }

    @Test
    public void testTransformDateFormatStringToDate() throws ParseException {
        String timePhrase = "7/15/2021";
        Date date = DateConverter.transform(timePhrase);
        Date expectedDate = new SimpleDateFormat("MM/dd/yyyy").parse(timePhrase);
        Assert.assertEquals(date, expectedDate, "the date did not transform correctly");
    }
}
