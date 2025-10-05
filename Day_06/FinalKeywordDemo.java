public class FinalKeywordDemo {
    public static void main(String[] args) {
        System.out.println("---- Final Class Demo ----");
        FinalClass f1 = new FinalClass();
        f1.show();

        System.out.println("\n---- Final Method Class Demo ----");
        FinalMethodClassTest obj = new FinalMethodClassTest();
        obj.show();

        System.out.println("\n---- Final Variables Demo ----");
        Finalvariables fv = new Finalvariables();
        System.out.println(fv);
    }
}

// ----------- Final Class (Cannot be Inherited) -----------
final class FinalClass {
    void show() {
        System.out.println("Final class cannot be inherited");
    }
}

// This class will cause a compile-time error if uncommented
// because FinalClass is final and cannot be extended.
// class Demo extends FinalClass { }

// ----------- Final Method Class -----------
class FinalMethodClass {
    final int a = 50;

    public FinalMethodClass() {
        System.out.println("This is a default constructor");
    }

    // final method cannot be overridden
    final void show() {
        System.out.println("Value of a: " + a);
    }
}

// ----------- Test Class for FinalMethodClass -----------
class FinalMethodClassTest extends FinalMethodClass {
    // Can't override final method; if you uncomment below, it will cause error
    // @Override
    // void show() {
    //     System.out.println("Trying to override final method");
    // }
}

// ----------- Final Variables Demo -----------
class Finalvariables {
    final int x = 100;          // Must be initialized
    final static int y;         // Static blank final must be initialized in static block
    final static int z = 10;    // Initialized at declaration

    static {
        y = 20;
        System.out.println("Value of Y initialized in static block: " + y);
    }

    void change() {
        // x = 30;  // Error: cannot assign a value to final variable
        // z = 100; // Error: final variable
        // y = 23;  // Error: final variable
    }

    @Override
    public String toString() {
        return "Finalvariables [x=" + x + ", y=" + y + "]";
    }
}
