// Single Java file: EncapsulationDemo.java

public class EncapsulationDemo {

    public static void main(String[] args) {

        // Object creation
        OopsConceptDemo obj = new OopsConceptDemo();

        // Setting values
        obj.setAge(34);
        obj.setName("Manoj");
        obj.setSerialNum(12345);

        // Getting values
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
        System.out.println("Serial Number: " + obj.getSerialNum());

        // toString output
        System.out.println(obj);
    }
}

// Supporting class
class OopsConceptDemo {

    // Private data members (Encapsulation)
    private int serialNum;
    private String name;
    private int age;

    // Getters and Setters
    public int getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // toString method for object representation
    @Override
    public String toString() {
        return "OopsConceptDemo [serialNum=" + serialNum +
               ", name=" + name +
               ", age=" + age + "]";
    }
}
