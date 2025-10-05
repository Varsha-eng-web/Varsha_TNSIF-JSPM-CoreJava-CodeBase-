public class ShapeDemo {
    public static void main(String[] args) {
        Shape s;
        s = new Square(5.0f);  // fixed typo: Sqaure -> Square
        s.calArea();
        s.show();

        s = new Rectangular(5, 4);
        s.calArea();
        s.show();
    }
}

// ----------- Abstract Class -----------
abstract class Shape {
    protected float area;

    // Abstract method to be implemented by child classes
    public abstract void calArea();

    // Concrete method
    public void show() {
        System.out.println("Area of the shape is " + area);
    }
}

// ----------- Square Class -----------
class Square extends Shape {
    private float side;

    public Square() {
        side = 2.0f;
    }

    public Square(float side) {
        this.side = side;
    }

    @Override
    public void calArea() {
        this.area = side * side;
    }
}

// ----------- Rectangular Class -----------
class Rectangular extends Shape {
    private float width;
    private float height;

    public Rectangular() {
        width = 3.2f;
        height = 3.2f;
    }

    public Rectangular(float width, float height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void calArea() {
        this.area = width * height;
    }
}
 
