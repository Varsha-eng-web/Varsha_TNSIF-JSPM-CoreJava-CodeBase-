public class MarkerInterfaceDemo {
    public static void main(String[] args) {
        // Functional + Extended Interface Demo
        Demo demo = new Demo();
        demo.show();
        demo.print();

        System.out.println();

        // Marker Interface Demo
        Student shreya = new Student();

        // Check if the object implements the marker interface
        if (shreya instanceof IsRegistered) {
            shreya.isRegistered();
        } else {
            System.out.println("Student is not registered.");
        }
    }
}

// ----------- Functional Interface -----------
@FunctionalInterface
interface InterfaceDemo {
    void show();
}

// ----------- Interface Extending Another Interface -----------
interface ExtendedInterface extends InterfaceDemo {
    void print();
}

// ----------- Implementation of Extended Interface -----------
class Demo implements ExtendedInterface {
    @Override
    public void show() {
        System.out.println("Functional Interface method: show()");
    }

    @Override
    public void print() {
        System.out.println("Extended Interface method: print()");
    }
}

// ----------- Marker Interface -----------
interface IsRegistered {
    // No methods – marker interface
}

// ----------- Class implementing marker interface -----------
class Student implements IsRegistered {
    public void isRegistered() {
        System.out.println("Yes... Student has visited the website "
                + "so the object is created from the student name reference.");
    }
}
