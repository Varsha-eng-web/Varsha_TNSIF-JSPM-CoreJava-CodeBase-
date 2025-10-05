public class StaticBlockMethodDemo {
    public static void main(String[] args) {
        System.out.println("---- Employee Demo ----");
        Employee e1;

        e1 = new Employee("Shubham", 1001);
        System.out.println(e1);

        e1 = new Employee("Aditya", 1002);
        System.out.println(e1);

        e1 = new Employee("Abhi", 1003);
        System.out.println(e1);

        System.out.println("\n---- MyClass Demo ----");

        MyClass.display();
        System.out.println();

        MyClass o1 = new MyClass();
        System.out.println(o1);
        MyClass.display();

        System.out.println();

        MyClass o2 = new MyClass();
        System.out.println(o2);
        MyClass.display();

        System.out.println();

        MyClass o3 = new MyClass();
        System.out.println(o3);
        MyClass.display();
    }
}

// ----------- Employee Class -----------
class Employee {
    private String name;
    private int id;

    // Static variable shared by all instances
    static String companyName = "TNS";

    // Parameterized constructor
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", Company=" + companyName + "]";
    }
}

// ----------- MyClass Class -----------
class MyClass {
    private int section; // instance variable
    private static int srNo; // static variable

    // Static block
    static {
        System.out.println("----- Within static block -----");
        srNo = 1000;
    }

    // Constructor
    MyClass() {
        System.out.println("------ Within Default constructor -----");
        srNo++;     // increment static variable
        section = 2000; // initializing section for each object
    }

    @Override
    public String toString() {
        return "MyClass [Serial No = " + srNo + ", Section = " + section + "]";
    }

    // Static method
    static void display() {
        System.out.println("Serial No: " + srNo);
    }
}
