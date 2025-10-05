public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        GreetInterface g = new GreetDemo();
        g.greet();
    }
}

// ----------- Functional Interface -----------
@FunctionalInterface
interface GreetInterface {
    void greet();
}

// ----------- Class that Implements the Interface -----------
class GreetDemo implements GreetInterface {
    @Override
    public void greet() {
        System.out.println("Good morning ---------------");
    }
}
