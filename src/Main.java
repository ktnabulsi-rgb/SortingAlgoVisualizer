import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        VisualizerAlgo va = new VisualizerAlgo();
        MergeSort ms = new MergeSort();
        BubbleSort bs = new BubbleSort();
        Scanner input = new Scanner(System.in);
        int[] arr = va.makeArray();
        boolean consoleIsRunning = true;
        while(consoleIsRunning) {
            System.out.println("Press the corresponding number to see the visualization of the selected sorting algorithm. \n1.Merge Sort\n2.Bubble Sort\n0.Exit");
            System.out.println("Here is the randomly generated array that will be sorted: ");
            va.printArray(arr);
            System.out.println();
            int selection = input.nextInt();
            if(selection == 0){
                consoleIsRunning = false;
            }
            else if(selection == 1){
                ms.mergeSort(arr);
                System.out.println("This took " + va.getIterationCtr() + " iterations to sort successfully");
            }
            else if(selection == 2){
                bs.bubbleSort(arr);
                System.out.println("This took " + va.getIterationCtr() + " iterations to sort successfully");
            }
        }
        System.out.println("Have a good day!");

    }

}