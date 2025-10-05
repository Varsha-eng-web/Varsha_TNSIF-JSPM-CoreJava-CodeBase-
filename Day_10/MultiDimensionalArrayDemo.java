public class MultiDimensionalArrayDemo {

    // --- Utility for Regular 2D Array ---
    static class MLArray {
        static void printArray(int[][] arr) {
            System.out.println("2D Array Elements:");
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    // --- Utility for Jagged Array ---
    static class JaggedArray {
        static void printArray(int[][] arr) {
            System.out.println("Jagged Array Elements:");
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    // --- Main Method ---
    public static void main(String[] args) {

        // Regular 2D Array (Matrix)
        int[][] regularArray = {
            {12, 24},
            {10, 20},
            {1, 2},
            {100, 200},
            {3, 4},
            {5, 6}
        };
        System.out.println("=== Regular 2D Array ===");
        System.out.println("Number of Rows: " + regularArray.length);
        MLArray.printArray(regularArray);

        System.out.println();

        // Jagged Array (rows with different column sizes)
        int[][] jaggedArray = {
            {10, 20, 30, 40},
            {1},
            {1, 2, 3, 4, 5, 6},
            {7, 9},
            {23, 44}
        };
        System.out.println("=== Jagged Array ===");
        System.out.println("Number of Rows: " + jaggedArray.length);
        JaggedArray.printArray(jaggedArray);
    }
}
