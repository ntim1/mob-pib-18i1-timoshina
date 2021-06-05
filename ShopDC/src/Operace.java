public class Operace {
    int number = 0;
    public CountDebCred debet;
    public CountDebCred credit;
    double money;

    public Operace(int number, CountDebCred debet, CountDebCred credit, double money)
    {
        this.number = number;
        this.debet = debet;
        this.credit = credit;
        this.money = money;

        number++;
        debet.balance += money;
        credit.balance -= money;
    }

    public CountDebCred getDebet() {
        return debet;
    }

    public void setDebet(CountDebCred debet) {
        this.debet = debet;
    }

    public CountDebCred getCredit() {
        return credit;
    }

    public void setCredit(CountDebCred credit) {
        this.credit = credit;
    }
    @Override
    public String toString() {
        return "number - " + number +
                " debet - " + debet.getNumber() +
                " credit - " + credit.getNumber() +
                " money - " + money;
    }
}
