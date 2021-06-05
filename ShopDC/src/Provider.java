public final class Provider {

    private int numberOfPots;
    private final int potPrice;

    public Provider(int potPrice, int numberOfPots) {
        this.numberOfPots = numberOfPots;
        this.potPrice = potPrice;
    }

    public int getNumberOfPots() {
        return numberOfPots;
    }

    public int getPotPrice() {
        return potPrice;
    }

    public void minusNumberOfPots() {
        this.numberOfPots--;
    }

}
