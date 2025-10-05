public class NestedInterfaceDemo implements OuterInterface, OuterInterface.Innerinterface {

    @Override
    public void calArea() {
        System.out.println("calArea() method from OuterInterface implemented.");
    }

    @Override
    public void print() {
        System.out.println("print() method from Innerinterface implemented. ID: " + id);
    }

    public static void main(String[] args) {
        NestedInterfaceDemo obj = new NestedInterfaceDemo();
        obj.calArea();
        obj.print();
    }
}

// ----------- Outer Interface with Nested Interface -----------
interface OuterInterface {

    void calArea();  // Abstract method

    // Nested interface
    interface Innerinterface {
        int id = 20;

        void print();
    }
}
