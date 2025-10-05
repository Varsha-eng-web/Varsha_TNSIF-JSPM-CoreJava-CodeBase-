public class base {

    // declare the variables
    int varDefault = 10;
    public int varPublic = 20;
    private int varPrivate = 30;
    protected int varProtected = 40;

    // methods declarations
    void methodDefault() {
        System.out.println("default access base class");
        System.out.println("default variable : " + varDefault);
    }

    public void methodPublic() {
        System.out.println("public access base class");
        System.out.println("public variable : " + varPublic);
    }

    private void methodPrivate() {
        System.out.println("private access base class");
        System.out.println("private variable : " + varPrivate);
    }

    protected void methodProtected() {
        System.out.println("protected access base class");
        System.out.println("protected variable : " + varProtected);
    }

    // main method to run the program
    public static void main(String[] args) {
        base obj = new base();

        // calling methods
        obj.methodDefault();
        obj.methodPublic();
        obj.methodProtected();

        // accessing variables
        System.out.println("Default variable: " + obj.varDefault);
        System.out.println("Public variable: " + obj.varPublic);
        System.out.println("Protected variable: " + obj.varProtected);

        // private variable can't be accessed here
    }
}
