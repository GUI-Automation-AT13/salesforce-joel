package core.utils;

/**
 * Gets us predefined values of different time units.
 */
public enum Daily {
    today("day", 0),
    yesterday("day", -1),
    tomorrow("day", 1),
    ago("ago", -1),
    from("from", 1);
    String daily;
    private int value;

    Daily(String daily, int value) {
        this.daily = daily;
        this.value = value;
    }

    public String getDaily() {
        return daily;
    }

    public int getValue() {
        return value;
    }
}
