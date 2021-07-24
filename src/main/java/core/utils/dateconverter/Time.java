package core.utils.dateconverter;

/**
 * Gets how many and what type of time units will add or rest.
 */
public class Time {
    private String unity;
    private int amount;

    public Time(String unity, int amount) {
        this.unity = unity;
        this.amount = amount;
    }

    public Time() {
    }

    public String getUnity() {
        return unity;
    }

    public void setUnity(String unity) {
        this.unity = unity;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
