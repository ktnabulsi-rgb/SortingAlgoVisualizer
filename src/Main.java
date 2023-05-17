import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] arr = makeArray();
        MergeSort ms = new MergeSort();
        BubbleSort bs = new BubbleSort();
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Press the corresponding number to see the visualization of the selected sorting algorithm. \n1.Merge Sort\n2.Bubble Sort\n0.Exit");
            int selection = input.nextInt();
            if(selection == 0){
                break;
            }
            else if(selection == 1){
                ms.mergeSort(arr);
            }
            else if(selection == 2){
                bs.bubbleSort(arr);
            }
        }
        System.out.println("Have a good day!");


        //tester:
        VisualizerAlgo va = new VisualizerAlgo();

        int[] array = {7, 5, 2, 10, 9};
        int largestNumberInArray = VisualizerAlgo.findLargestNumber(array);
        String[][] gridArray = new String[largestNumberInArray][array.length];

        for (int c = 0; c < gridArray[0].length; c++) {
            int numberOfSpaces = largestNumberInArray - array[c];
            for (int r = 0; r < numberOfSpaces; r++) {
                gridArray[r][c] = "5"; //5 values mean space in this case
            }
        }

        VisualizerAlgo.fillStars(gridArray);
        VisualizerAlgo.print2DArrayGrid(gridArray);
    }
    public static int[] makeArray(){
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
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                for(int starCtr = 0; starCtr < arr[i]; starCtr++) {
                    System.out.println("*");
                }
                //System.out.print(arr[i] + " ");
            }
            //find highest index in array


            System.out.println();
    }
}