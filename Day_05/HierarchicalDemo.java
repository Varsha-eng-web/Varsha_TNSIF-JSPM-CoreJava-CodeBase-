

// Base class
class Person {
    private String name;
    private String city;

    // Default constructor
    public Person() {
        System.out.println("Person class default constructor ");
        name = "Amit";
        city = "Pune";
    }

    // Parameterized constructor
    public Person(String name, String city) {
        this.name = name;
        this.city = city;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", city=" + city + "]";
    }
}

// Derived class 1
class Employee extends Person {
    private int empid;
    private float salary;
    private String dept;

    public Employee() {
        System.out.println("Employee class default constructor ");
        empid = 101;
        salary = 50000f;
        dept = "IT";
    }

    public Employee(String name, String city, int empid, float salary, String dept) {
        super(name, city);
        this.empid = empid;
        this.salary = salary;
        this.dept = dept;
    }

    // Getters & Setters
    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee [empid=" + empid + ", salary=" + salary + ", dept=" + dept +
               ", getName()=" + getName() + ", getCity()=" + getCity() + "]";
    }
}

// Derived class 2
class Student extends Person {
    private String year;
    private float marks;

    public Student() {
        System.out.println("Student class default constructor ");
        year = "FY";
        marks = 0.0f;
    }

    public Student(String name, String city, String year, float marks) {
        super(name, city);
        this.year = year;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student [year=" + year + ", marks=" + marks +
               ", getName()=" + getName() + ", getCity()=" + getCity() + "]";
    }
}

// Demo class with main method
public class HierarchicalDemo {
    public static void main(String[] args) {
        // Base class object
        Person p1 = new Person();
        System.out.println(p1);

        // Person reference with Person object
        Person p = new Person("Shubham", "Pune");
        System.out.println(p);

        // Person reference with Employee object
        p = new Employee("Nikita", "Nashik", 1002, 23456, "QA");
        System.out.println(p);

        // Person reference with Student object
        p = new Student("Aditya", "Mumbai", "TY", 12345f);
        System.out.println(p);
    }
}
