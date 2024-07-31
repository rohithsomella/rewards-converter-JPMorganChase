

public class RewardValue {
    private double cashValue;
    private double milesValue;
    private static final double CONVERSION_RATE = 0.0035; // Conversion rate from miles to cash

    // Constructor for initializing with cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / CONVERSION_RATE;
    }

    // Constructor for initializing with miles value
    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = milesValue;
            this.cashValue = milesValue * CONVERSION_RATE;
        }
    }

    // Getter for cash value
    public double getCashValue() {
        return cashValue;
    }

    // Getter for miles value
    public double getMilesValue() {
        return milesValue;
    }
}
