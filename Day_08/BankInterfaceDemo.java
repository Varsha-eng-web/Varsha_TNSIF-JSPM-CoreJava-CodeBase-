public class BankInterfaceDemo {
    public static void main(String[] args) {
        SavingAccount s1 = new SavingAccount("Shweta", "Pune", 12345, 37000f);

        s1.deposit(26000); // Invalid (over limit)
        System.out.println(s1);

        s1.withdraw(25000); // Valid
        System.out.println(s1);

        s1.withdraw(9000);  // Valid
        System.out.println(s1);

        s1.withdraw(5000);  // Invalid (not enough to maintain MINBAL)
        System.out.println(s1);
    }
}

// ----------- Interface -----------
interface Bank {
    float MINBAL = 5000;
    float Deposit_Limit = 25000;

    void deposit(float amount);
    void withdraw(float amount);
}

// ----------- Entity Class (Customer) -----------
class Customer {
    private String name;
    private String city;

    public Customer() {
    }

    public Customer(String name, String city) {
        this.name = name;
        this.city = city;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

// ----------- Business Class (SavingsAccount) -----------
class SavingAccount extends Customer implements Bank {
    private int accNo;
    private float balance;

    public SavingAccount(String name, String city, int accNo, float balance) {
        super(name, city);
        this.accNo = accNo;
        this.balance = balance;
    }

    // Getters and Setters
    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(float amount) {
        if (amount <= 0 || amount > Deposit_Limit) {
            System.out.println("Please deposit a valid amount (<= " + Deposit_Limit + ")");
        } else {
            balance += amount;
            System.out.println("Rs " + amount + " deposited successfully.");
        }
    }

    @Override
    public void withdraw(float amount) {
        if (amount <= (balance - MINBAL)) {
            balance -= amount;
            System.out.println("Rs " + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance. Cannot maintain minimum balance of Rs " + MINBAL);
        }
    }

    @Override
    public String toString() {
        return "SavingAccount [accNo=" + accNo +
                ", balance=" + balance +
                ", name=" + getName() +
                ", city=" + getCity() + "]";
    }
}

