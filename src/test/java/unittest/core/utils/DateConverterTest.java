/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package unittest.core.utils;

import core.utils.dateconverter.DateConverter;
import core.utils.dateconverter.Time;
import core.utils.dateconverter.TimeUnity;
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
    public void testTransformDatePhraseToPastDate() throws ParseException {
        String timePhrase = "5 months ago";
        Date date = DateConverter.transform(timePhrase);
        Date expectedDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, -5);
        expectedDate = calendar.getTime();
        Assert.assertEquals(date, expectedDate, "the date did not transform correctly");
    }

    @Test
    public void testTransformDatePhraseToFutureDate() throws ParseException {
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

    @Test(expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "Time Phrase can not be null")
    public void testNullValidation() throws ParseException {
        String timePhrase = null;
        DateConverter.transform(timePhrase);
    }

    @Test(expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "Time Phrase can not be empty or blank")
    public void testEmptyValidation() throws ParseException {
        String timePhrase = "";
        DateConverter.transform(timePhrase);
    }

    @Test(expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "Time word is not valid")
    public void testNonExistentWordValidation() throws ParseException {
        String timePhrase = "tonight";
        DateConverter.transform(timePhrase);
    }

    @Test(expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "Time word is not valid")
    public void testBadFormatDateValidation() throws ParseException {
        String timePhrase = "12.26.2020";
        DateConverter.transform(timePhrase);
    }

    @Test(expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "No enum constant core.utils.dateconverter.Daily.years")
    public void testBadFormatTimePhraseValidation() throws ParseException {
        String timePhrase = "5 years years";
        DateConverter.transform(timePhrase);
    }

    @Test(expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "Time phrase does not have the correct format")
    public void testTooLargeTimePhraseValidation() throws ParseException {
        String timePhrase = "5 years years from now";
        DateConverter.transform(timePhrase);
    }
}
