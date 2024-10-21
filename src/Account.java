public class Account {
    private int id;
    private Customer2 customer2;
    private double balance = 0.0;

    public Account(int id, Customer2 customer2, double balance) {
        this.id = id;
        this.customer2 = customer2;
        this.balance = balance;

    }

    public Account(int id, Customer2 customer2) {
        this(id, customer2, 0.0);
    }

    public int getId() {
        return id;
    }

    public Customer2 getCustomer2() {
        return customer2;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;

    }

    public String getCustomer2Name() {
        return customer2.getName();
    }

    public Account deposit (double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive!");
        }
        return this;
    }

    public Account withdraw(double amount) {
        if (amount > balance) {
            balance -= amount;
        } else {
            System.out.println("Withdrawal amount must be positive!");
        }
        return this;
    }

    @Override
    public String toString() {
        return String.format("%s balance=$%.2f", customer2.toString(), balance);
    }
}

