public class D2_casting {
    public static void main(String[] args) {
        byte b = 10;
        int i = b;

        float f = 22f;
        double d = f;
        System.out.println(d);

        char ch = 'A';
        int n = ch;
        System.out.println(i);

        //narrowing or //explicit type casting
        double f2 = 10.45f;
        int ll = (int)f2;
        System.out.println(ll);

        long t = 2849084939789l;
        int m = (int)t;
        System.out.println(m);

    }
}