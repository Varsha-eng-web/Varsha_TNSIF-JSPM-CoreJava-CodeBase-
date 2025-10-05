
import java.util.Arrays;

// Main class for array operations
public class ArrayClassDemo {

    public static void main(String[] args) {

        // ======= Primitive Array Operations =======
        int intArr[] = {69, 20, 12, 40, 35};

        // Print original array
        System.out.println("Original array: " + Arrays.toString(intArr));
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + " ");
        }
        System.out.println();

        // Sort array
        Arrays.sort(intArr);
        System.out.println("Sorted array: " + Arrays.toString(intArr));

        // Binary search
        System.out.println("Binary search 13: " + Arrays.binarySearch(intArr, 13));
        System.out.println("Binary search (range 2-3, 69): " + Arrays.binarySearch(intArr, 2, 3, 69));

        // Second array for comparison
        int intArr1[] = {69, 20, 12, 40, 35};
        Arrays.sort(intArr1);
        System.out.println("Second sorted array: " + Arrays.toString(intArr1));

        if (Arrays.compare(intArr, intArr1) == 0) {
            System.out.println("Both arrays match.");
        } else {
            System.out.println("Arrays do not match.");
        }

        // Copy arrays
        int intArr2[] = Arrays.copyOf(intArr1, 2);
        System.out.println("Copied first 2 elements: " + Arrays.toString(intArr2));

        int intArr3[] = Arrays.copyOfRange(intArr, 1, 4);
        System.out.println("Copied range (1 to 4): " + Arrays.toString(intArr3));

        // Fill array
        Arrays.fill(intArr3, 7);
        System.out.println("Array after fill: " + Arrays.toString(intArr3));

        // ======= Object Array Operations =======
        System.out.println("\n======= Student Array =======");

        Student[] arr = new Student[5];
        arr[0] = new Student(1, "Shubham");
        arr[1] = new Student(2, "Heti");
        arr[2] = new Student(3, "Aditya");
        arr[3] = new Student(4, "Zeel");
        arr[4] = new Student(5, "Simran");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at " + i + ": " +
                    arr[i].getRollNo() + " " + arr[i].getName());
        }
    }
}

// Student class used in ArrayObjDemo
class Student {

    private int rollNo;
    private String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

