
public final class Seller {

    private int numberOfPots;
    private final int potPrice;
    private int money;

    public Seller(int potPrice, int numberOfPots, int money) {
        this.numberOfPots = numberOfPots;
        this.potPrice = potPrice;
        this.money = money;
    }

    public void setMoney(int money) {
        this.money += money;
    }

    public int getNumberOfPots() {
        return numberOfPots;
    }

    public int getPotPrice() {
        return potPrice;
    }

    public int getMoney() {
        return money;
    }

    public void plusNumberOfPots() {
        this.numberOfPots++;
    }

    public void minusNumberOfPots() {
        this.numberOfPots--;
    }

}
