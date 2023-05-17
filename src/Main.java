import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] arr = makeArray();
        MergeSort ms = new MergeSort();
        BubbleSort bs = new BubbleSort();
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Press the corresponding number to see the visualization of the selected sorting algorithm. \n1.Merge Sort\n2.Bubble Sort\n0.Exit");
            System.out.println("Here is the randomly generated array that will be sorted: ");
            printArray(arr);
            int selection = input.nextInt();
            if(selection == 0){
                break;
            }
            else if(selection == 1){
                ms.mergeSort(arr);
                System.out.println("This took " + VisualizerAlgo.getIterationCtr() + " iterations to sort successfully");
            }
            else if(selection == 2){
                bs.bubbleSort(arr);
                System.out.println("This took " + VisualizerAlgo.getIterationCtr() + " iterations to sort successfully");
            }
        }
        System.out.println("Have a good day!");

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
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
    }
}