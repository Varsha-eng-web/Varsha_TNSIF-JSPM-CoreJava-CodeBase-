public class SLInheritanceDemo {

    public static void main(String[] args) {
        Student s = new Student("Alina", "12345678", "Pune", 9876543210L, 1001, "JSPMW");
        System.out.println(s);
    }
}

class Citizen {
    private String name;
    private String adharNo;
    private String address;
    private long phone;

    // Non-parameterized constructor
    public Citizen() {
        System.out.println("Citizen object created");
    }

    // Parameterized constructor
    public Citizen(String name, String adharNo, String address, long phone) {
        this.name = name;
        this.adharNo = adharNo;
        this.address = address;
        this.phone = phone;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdharNo() {
        return adharNo;
    }

    public void setAdharNo(String adharNo) {
        this.adharNo = adharNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Citizen [name=" + name + ", adharNo=" + adharNo + ", address=" + address + ", phone=" + phone + "]";
    }
}

class Student extends Citizen {
    private int rollNo;
    private String collegename;

    // Non-parameterized constructor
    public Student() {
        super();
    }

    // Parameterized constructor
    public Student(String name, String adharNo, String address, long phone, int rollNo, String collegename) {
        super(name, adharNo, address, phone);
        this.rollNo = rollNo;
        this.collegename = collegename;
    }

    // Getters and Setters
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getCollegename() {
        return collegename;
    }

    public void setCollegename(String collegename) {
        this.collegename = collegename;
    }

    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", collegename=" + collegename +
                ", getName()=" + getName() + ", getAdharNo()=" + getAdharNo() +
                ", getAddress()=" + getAddress() + ", getPhone()=" + getPhone() + "]";
    }
}
