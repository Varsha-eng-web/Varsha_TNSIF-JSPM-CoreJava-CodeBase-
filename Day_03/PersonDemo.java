// Single Java file: PersonDemo.java

import java.util.Scanner;

// Model class
class Person {

    // Data members
    private String name;
    private int income;
    private String gender;
    private int age;
    private int tax;

    // Getter and Setter methods
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getIncome() {
        return income;
    }
    public void setIncome(int income) {
        this.income = income;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getTax() {
        return tax;
    }
    public void setTax(int tax) {
        this.tax = tax;
    }

    // ToString method for printing object
    @Override
    public String toString() {
        return "Person [name=" + name + ", income=" + income +
                ", gender=" + gender + ", age=" + age + ", tax=" + tax + "]";
    }
}

// Tax calculation logic
class TaxCalculation {

    public void calculateTax(Person person) {
        if (person.getAge() > 65 || person.getGender().equalsIgnoreCase("female")) {
            person.setTax(0);
            System.out.println("Tax not applicable");
        } else {
            int income = person.getIncome();
            if (income <= 160000) {
                person.setTax(0);
            } else if (income <= 500000) {
                person.setTax((income - 160000) * 10 / 100);
            } else if (income <= 800000) {
                person.setTax((income - 500000) * 20 / 100 + 34000);
            } else {
                person.setTax((income - 800000) * 30 / 100 + 94000);
            }
        }
    }
}

// Main class
public class PersonDemo {

    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);

        // Input details
        System.out.print("Enter Person Name: ");
        String name = ob.next();

        System.out.print("Enter Age: ");
        int age = ob.nextInt();

        System.out.print("Enter Gender: ");
        String gender = ob.next();

        System.out.print("Enter Income: ");
        int income = ob.nextInt();

        // Create and set person object
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        person.setGender(gender);
        person.setIncome(income);

        // Before tax calculation
        System.out.println("\nBefore Tax Calculation:");
        System.out.println(person);

        // Tax calculation
        TaxCalculation calc = new TaxCalculation();
        calc.calculateTax(person);

        // After tax calculation
        System.out.println("\nAfter Tax Calculation:");
        System.out.println(person);

        ob.close();
    }
}
