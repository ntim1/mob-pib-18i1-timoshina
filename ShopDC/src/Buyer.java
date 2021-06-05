public final class Buyer {

    private final String name;
    private int money;
    private int numberOfPots;

    public Buyer(String name, int money) {
        this.name = name;
        this.money = money;
        this.numberOfPots = 0;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public int getNumberOfPots() {
        return numberOfPots;
    }

    public void setMoney(int money) {
        this.money += money;
    }

    public void plusNumberOfPots() {
        this.numberOfPots++;
    }
}
