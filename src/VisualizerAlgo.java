public class VisualizerAlgo {
    public static void main(String[] args) {

        int[] array = {7, 5, 2, 10, 9};
        int largestNumberInArray = findLargestNumber(array);
        String[][] gridArray = new String[largestNumberInArray][array.length];

        for (int c = 0; c < gridArray[0].length; c++) {
            int numberOfSpaces = largestNumberInArray - array[c];
            for (int r = 0; r < numberOfSpaces; r++) {
                gridArray[r][c] = "5"; //5 values mean space in this case
            }
        }

        fillStars(gridArray);
        print2DArray(gridArray);

    }


    public static String[][] fillStars(String[][] gridArray) {
        for (int r = 0; r < gridArray.length; r++) {
            for (int c = 0; c < gridArray[r].length; c++) {
                if(gridArray[r][c] == null) {
                    gridArray[r][c] = "*";
                }
                else {
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
    public static void print2DArray(String[][] gridArray) {
        for (int r = 0; r < gridArray.length; r++) {
            for (int c = 0; c < gridArray[r].length; c++) {
                System.out.print(gridArray[r][c]);
                System.out.println();
            }
        }
    }
    public static void printGen(String[][] gridArray) {
//        System.out.print(" " + " " + " ");
//
//        for(int c = 1; c <= 20; c++) {
//
//            System.out.print(c % 10);
//        }
        System.out.println();

        for (int r = 1; r <= gridArray.length - 2; r++)
        {

            System.out.printf("%-3s", r);

            for (int c = 1; c < gridArray[r].length - 1; c++)
            {

                if (gridArray[r][c] == null) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        System.out.println();

    }


}
