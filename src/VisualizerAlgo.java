import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class VisualizerAlgo {
    private static int iterationCtr = 0;
    Scanner input = new Scanner(System.in);


    /**
     * Fills a 2D string array with '*' characters in place of null elements, and spaces for non-null elements.
     *
     * @param gridArray the input 2D string array to be filled.
     * @return the input array after being filled with '*' and space characters.
     */
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

    /**
     * Finds the largest integer in an input array of integers.
     *
     * @param array the input integer array.
     * @throws IllegalArgumentException if the input array is null or has zero length.
     * @return the largest integer in the array.
     */
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

    /**
     * Prints a 2D string array in a grid format, with columns neatly aligned.
     *
     * @param array the input 2D string array to be printed.
     */
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

    /**
     * Finds the maximum string length in a 2D string array.
     *
     * @param array the input 2D string array.
     * @return the maximum string length among all elements in the array.
     */
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

    /**
     * Prints a visual representation of an integer array, using '*' characters to represent the integers.
     *
     * @param array the input integer array to be visually represented.
     */
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

    /**
     * Creates and returns an integer array of random length (between 50 and 100), filled with random integers.
     *
     * @return the randomly generated integer array.
     */
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

    /**
     * Prints an integer array as a comma-separated list.
     *
     * @param arr the integer array to be printed.
     */
    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
    }

    /**
     * Creates and returns a copy of an integer array.
     *
     * @param array the integer array to be copied.
     * @return the copy of the input integer array.
     */
    public int[] copyArray(int[] array) {
        int[] arr = Arrays.copyOf(array, array.length);
        return arr;
    }

    /**
     * Creates and returns a custom integer array.
     *
     * @return custom array user made.
     */
    public int[] fillCustomArray(){
        ArrayList<Integer> arraylist = new ArrayList<>();
        int value;
        String selection;
        System.out.println("Enter values separated by ENTER \nPress S to stop");
        while(true){
            selection = input.next();
            if(selection.equals("s") || selection.equals("S")){
                break;
            }
            else{
                try{
                    value = Integer.parseInt(selection);
                    arraylist.add(value);
                }
                catch (NumberFormatException e){
                    System.out.println("Your value was invalid; may have contained a letter or symbol");
                }
            }
        }
        //Copys arraylist to array
        int[] custom = new int[arraylist.size()];
        for(int i = 0; i < arraylist.size(); i++){
            custom[i] = arraylist.get(i);
        }
        return custom;
    }

}



