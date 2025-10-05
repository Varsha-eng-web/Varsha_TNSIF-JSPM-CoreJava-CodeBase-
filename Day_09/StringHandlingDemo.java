public class StringHandlingDemo {

    public static void main(String[] args) {

        System.out.println("====== Sample String Demo ======");
        sampleStringDemo();

        System.out.println("\n====== String Buffer Demo ======");
        stringBufferDemo();

        System.out.println("\n====== String Comparison Demo ======");
        stringComparisonDemo();

        System.out.println("\n====== String Operations Demo ======");
        stringOperationDemo();
    }

    // ========== Sample String Demo ==========
    public static void sampleStringDemo() {
        char[] c = {'I', 'n', 'd', 'i', 'a'};

        String s1 = new String(c);
        System.out.println("String from char array: " + s1);

        String s2 = new String(s1);
        System.out.println("Copied string: " + s2);

        String longStr = "This is to show " +
                         "how long sentence " +
                         "can be printed.";
        System.out.println("Concatenated long string: " + longStr);
    }

    // ========== StringBuffer Demo ==========
    public static void stringBufferDemo() {
        StringBuffer buffer = new StringBuffer("Hello");
        System.out.println("Buffer = " + buffer);
        System.out.println("Length = " + buffer.length());
        System.out.println("Capacity = " + buffer.capacity());

        int a = 42;
        buffer = new StringBuffer(40);
        String s = buffer.append("a = ").append(a).append("!").toString();
        System.out.println("Appended: " + s);

        buffer = new StringBuffer("I Java !");
        System.out.println("Original: " + buffer);

        buffer.insert(2, "like ");
        System.out.println("After insert: " + buffer);

        buffer.delete(3, 6);
        System.out.println("After delete: " + buffer);

        buffer.replace(1, 3, "AAA");
        System.out.println("After replace: " + buffer);

        buffer.reverse();
        System.out.println("After reverse: " + buffer);
    }

    // ========== String Comparison ==========
    public static void stringComparisonDemo() {
        String s1 = "A";
        String s2 = "a";

        String s3 = new String("TNSIF");
        String s4 = new String("TNSIF");

        System.out.println("Case 1 (s1 == s2): " + (s1 == s2));
        System.out.println("Case 2 (s1 == s3): " + (s1 == s3));
        System.out.println("Case 3 (s2.equals(s1)): " + s2.equals(s1));
        System.out.println("Case 4 (s2.equals(s4)): " + s2.equals(s4));
        System.out.println("Case 5 (s3 == s4): " + (s3 == s4));
        System.out.println("Case 6 (s3.equals(s4)): " + s3.equals(s4));

        System.out.println("s1.hashCode(): " + s1.hashCode());
        System.out.println("s2.hashCode(): " + s2.hashCode());
        System.out.println("s3.hashCode(): " + s3.hashCode());
        System.out.println("s4.hashCode(): " + s4.hashCode());

        System.out.println("compareTo: " + s1.compareTo(s2)); // case-sensitive
        System.out.println("compareToIgnoreCase: " + s1.compareToIgnoreCase(s2)); // case-insensitive
    }

    // ========== String Operations ==========
    public static void stringOperationDemo() {
        String s1 = new String(" Indian ");
        System.out.println("Original: '" + s1 + "'");

        String s2 = s1.toUpperCase();
        System.out.println("Uppercase: " + s2);

        System.out.println("Length: " + s1.length());

        String s3 = s1.substring(1, 7); // Note: end index is exclusive
        System.out.println("Substring(1,7): '" + s3 + "'");

        System.out.println("Trimmed: '" + s1.trim() + "'");
        System.out.println("Strip trailing: '" + s1.stripTrailing() + "'");
        System.out.println("Is empty: " + s1.isEmpty());

        // String comparison
        s2 = new String(s1);
        System.out.println("Case 1 (s1.equals(s2)): " + s1.equals(s2));
        System.out.println("Case 2 (s1 == s2): " + (s1 == s2)); // false
    }
}
