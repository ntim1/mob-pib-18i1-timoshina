public class CountDebCred {
    public String number;
    public String name;
    public double quantity;
    public double balance;

    public CountDebCred(String number, String name, double quantity, double balance){
        this.number = number;
        this.name = name;
        this.quantity = quantity;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String toString() {
        return "Number - " + getNumber() +
                "; Name - " + getName() +
                "; Quantity - " + getQuantity() +
                "; Balance - " + getBalance();
    }
}
