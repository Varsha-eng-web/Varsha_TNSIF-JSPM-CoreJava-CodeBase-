public class OverridingDemo {
    public static void main(String[] args) {

        System.out.println("---- Covariant Return Type Demo ----");
        Colour c = new Colour();
        System.out.println("Colour class returns: " + c.getColour().getClass().getSimpleName());

        Yellow y = new Yellow();
        System.out.println("Yellow class returns: " + y.getColour().getClass().getSimpleName());

        System.out.println("\n---- Method Overriding with Dynamic Binding ----");

        RBI rbi;

        rbi = new RBI();
        System.out.println("RBI Rate of Interest: " + rbi.getRateofInterest());

        rbi = new SBI();
        System.out.println("SBI Rate of Interest: " + rbi.getRateofInterest());

        rbi = new ICICI();
        System.out.println("ICICI Rate of Interest: " + rbi.getRateofInterest());

        rbi = new HDFC();
        System.out.println("HDFC Rate of Interest: " + rbi.getRateofInterest());
    }
}

// ----------- Covariant Return Type Example -----------

class Colour {
    protected Colour getColour() {
        return new Colour();
    }
}

class Yellow extends Colour {
    @Override
    protected Yellow getColour() {
        return new Yellow();
    }
}

// ----------- Method Overriding Example (Bank) -----------

class RBI {
    public float getRateofInterest() {
        return 6.0f;
    }
}

class SBI extends RBI {
    @Override
    public float getRateofInterest() {
        return 6.2f;
    }
}

class ICICI extends RBI {
    @Override
    public float getRateofInterest() {
        return 7.4f;
    }
}

class HDFC extends RBI {
    @Override
    public float getRateofInterest() {
        return 6.9f;
    }
}
