import java.util.Arrays;

public class VisualizerAlgo {
    private static int iterationCtr = 0;

    public String[][] fillStars(String[][] gridArray) {
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

    public int findLargestNumber(int[] array) {
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

    public void print2DArrayGrid(String[][] array) {
        int columns = array[0].length;
        //long milliseconds = (long)0.75;

        // Determine the maximum length of strings in the array
        int maxLength = getMaxStringLength(array);

        // Print the array in a grid format
        for (String[] row : array) {
            for (int j = 0; j < columns; j++) {
//                try {
//                    Thread.sleep(milliseconds); // Pause the thread for 2000 milliseconds (2 seconds)
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                System.out.printf("%-" + (maxLength + 1) + "s", row[j]);
            }
            System.out.println();
        }
    }

    public int getMaxStringLength(String[][] array) {
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

    public void printVis(int[] array){
        int largestNumberInArray = findLargestNumber(array);
        String[][] gridArray = new String[largestNumberInArray][array.length];
        int dashLength = array.length * 2;

        for (int c = 0; c < gridArray[0].length; c++) {
            int numberOfSpaces = largestNumberInArray - array[c];
            for (int r = 0; r < numberOfSpaces; r++) {
                gridArray[r][c] = "5"; //5 values mean space in this case
            }
        }
        fillStars(gridArray);
        print2DArrayGrid(gridArray);

        iterationCtr++;
        //write dashes to text file
        for(int i = 0; i < dashLength; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public int getIterationCtr() {
        return iterationCtr;
    }
    public void setIterationCtr(int num) {
        iterationCtr = num;
    }
    public int[] makeArray(){
        int length =(int) (Math.random() * (100 - 50 + 1)) + 50;
        int rand;
        int[] arr = new int[length];
        for(int i = 0; i < arr.length; i++){
            rand = (int) (Math.random() * (101));
            arr[i] = rand;
        }
        return arr;
    }

    /* Prints the array */
    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
    }

    public int[] copyArray(int[] array) {
        int[] arr = Arrays.copyOf(array, array.length);
        return arr;
    }

}



