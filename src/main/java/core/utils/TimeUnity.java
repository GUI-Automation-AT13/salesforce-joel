package core.utils;

/**
 * Gets default values to help ta manage Calendar add method.
 */
public enum TimeUnity {
    seconds(13),
    second(13),
    minutes(12),
    minute(12),
    hours(10),
    hour(10),
    days(5),
    day(5),
    months(2),
    month(2),
    years(1),
    year(1);
    private int value;

    TimeUnity(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
