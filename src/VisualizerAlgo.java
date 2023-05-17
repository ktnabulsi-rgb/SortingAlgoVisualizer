public class VisualizerAlgo {

    public static String[][] fillStars(String[][] gridArray) {
        for (int r = 0; r < gridArray.length; r++) {
            for (int c = 0; c < gridArray[r].length; c++) {
                if (gridArray[r][c] == null) {
                    gridArray[r][c] = "*";
                } else {
                    gridArray[r][c] = " ";
                }

            }
        }
        return gridArray;
    }

    public static int findLargestNumber(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is empty or null.");
        }

        int largestNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largestNumber) {
                largestNumber = array[i];
            }
        }
        return largestNumber;
    }

    public static void print2DArrayGrid(String[][] array) {
        int rows = array.length;
        int columns = array[0].length;

        // Determine the maximum length of strings in the array
        int maxLength = getMaxStringLength(array);

        // Print the array in a grid format
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("%-" + (maxLength + 1) + "s", array[i][j]);
            }
            System.out.println();
        }
    }

    public static int getMaxStringLength(String[][] array) {
        int maxLength = 0;
        for (String[] row : array) {
            for (String element : row) {
                if (element.length() > maxLength) {
                    maxLength = element.length();
                }
            }
        }
        return maxLength;
    }
}



