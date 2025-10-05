public class OverloadingDemo {
    public static void main(String[] args) {
        System.out.println("--- Constructor Overloading ---");

        Point p = new Point(2.3f, 34.56f);
        System.out.println(p);

        System.out.println("\n--- Method Overloading ---");
        System.out.println("Addition of two integers: " + MethodOverloadingDemo.addition(5, 100));
        System.out.println("Addition of three integers: " + MethodOverloadingDemo.addition(2, 2, 2));
        System.out.println("Addition of two floats: " + MethodOverloadingDemo.addition(3.5f, 6.5f));
        System.out.println("Addition of two strings: " + MethodOverloadingDemo.addition("Shubham ", "Dhangar"));
    }
}

// ----------- Method Overloading Demo -----------
class MethodOverloadingDemo {

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int addition(int a, int b, int c) {
        return a + b + c;
    }

    public static float addition(float a, float b) {
        return a + b;
    }

    public static String addition(String a, String b) {
        return a + b;
    }
}

// ----------- Constructor Overloading Demo (Point Class) -----------
class Point {
    private float x;
    private float y;

    // 1. Default constructor
    public Point() {
        x = 0.0f;
        y = 0.0f;
    }

    // 2. One-parameter constructor
    public Point(float x) {
        this.x = x;
        this.y = x;
    }

    // 3. Two-parameter constructor
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }
}
