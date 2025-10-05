import java.util.Scanner;

// Main class to test constructors
public class ConstructorDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name, city;
        int id;

        // First Customer - using default constructor and setters
        System.out.println("Enter customer id:");
        id = sc.nextInt();

        sc.nextLine(); // Consume newline
        System.out.println("Enter Customer name:");
        name = sc.nextLine();

        System.out.println("Enter Customer City:");
        city = sc.nextLine();

        System.out.println("\nUsing Default Constructor and Setters:");
        Customer c1 = new Customer(); // default constructor
        c1.setCustomerId(id);
        c1.setCustomername(name);
        c1.setCustomerCity(city);
        System.out.println(c1);

        // Second Customer - using parameterized constructor
        System.out.println("\nEnter customer id:");
        id = sc.nextInt();

        sc.nextLine(); // Consume newline
        System.out.println("Enter Customer name:");
        name = sc.nextLine();

        System.out.println("Enter Customer City:");
        city = sc.nextLine();

        System.out.println("\nUsing Parameterized Constructor:");
        Customer c2 = new Customer(name, id, city);
        System.out.println(c2);

        sc.close();
    }
}

// Supporting Customer class (same file)
class Customer {

    // Data members
    private String customername;
    private int customerId;
    private String customerCity;

    // Default Constructor
    public Customer() {
        System.out.println("Default Constructor Called");
    }

    // Parameterized Constructor
    public Customer(String customername, int customerId, String customerCity) {
        this.customername = customername;
        this.customerId = customerId;
        this.customerCity = customerCity;
    }

    // Getters and Setters
    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    // toString method
    @Override
    public String toString() {
        return "Customer [Name=" + customername +
                ", ID=" + customerId +
                ", City=" + customerCity + "]";
    }
}
