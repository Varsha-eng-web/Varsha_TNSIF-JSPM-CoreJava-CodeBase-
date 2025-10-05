// Base class
class Base {

    // declare the variables
    int varDefault = 10;
    public int varPublic = 20;
    private int varPrivate = 30;
    protected int varProtected = 40;

    // methods declarations
    void methodDefault() {
        System.out.println("default access Base class");
        System.out.println("default variable : " + varDefault);
    }

    public void methodPublic() {
        System.out.println("public access Base class");
        System.out.println("public variable : " + varPublic);
    }

    private void methodPrivate() {
        System.out.println("private access Base class");
        System.out.println("private variable : " + varPrivate);
    }

    protected void methodProtected() {
        System.out.println("protected access Base class");
        System.out.println("protected variable : " + varProtected);
    }
}

// Executor class with main method
public class Executor {
    public static void main(String[] args) {
        // accessing same package (here same file) class
        Base b1 = new Base();

        b1.methodDefault();     // default method
        b1.methodProtected();   // protected method
        b1.methodPublic();      // public method

        b1.varDefault = 11;     // update default variable
        b1.methodDefault();

        // private members access NOT allowed
        // b1.methodPrivate(); ❌
        // b1.varPrivate = 50; ❌

        b1.varProtected = 21;   // update protected variable
        b1.methodProtected();

        b1.varPublic = 41;      // update public variable
        b1.methodPublic();
    }
}
