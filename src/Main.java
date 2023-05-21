import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        VisualizerAlgo va = new VisualizerAlgo();
        MergeSort ms = new MergeSort();
        BubbleSort bs = new BubbleSort();
        HeapSort hs = new HeapSort();
        SelectionSort ss = new SelectionSort();
        InsertionSort is = new InsertionSort();
        Scanner input = new Scanner(System.in);

        int[] arrUnmodified = va.makeArray();

        boolean consoleIsRunning = true;

        while(consoleIsRunning) {
            int[] arrModified = va.copyArray(arrUnmodified);
            System.out.println("Press the corresponding number to see the visualization of the selected sorting algorithm. \n1.Merge Sort\n2.Bubble Sort \n3.Heap Sort\n4.Selection Sort\n5.Insertion Sort\n6.Create a new array to sort\n0.Exit");
            System.out.println("Here is the randomly generated array that will be sorted: ");
            va.printArray(arrModified);
            System.out.println();
            int selection = input.nextInt();
            if(selection == 0){
                consoleIsRunning = false;
            }
            else if(selection == 1) {
                va.setIterationCtr(0);
                ms.mergeSort(arrModified);
                System.out.println("This took " + va.getIterationCtr() + " iterations to sort successfully");
            }
            else if(selection == 2) {
                va.setIterationCtr(0);
                bs.bubbleSort(arrModified);
                System.out.println("This took " + va.getIterationCtr() + " iterations to sort successfully");
            }
            else if(selection == 3) {
                va.setIterationCtr(0);
                hs.heapSort(arrModified);
                System.out.println("This took " + va.getIterationCtr() + " iterations to sort successfully");
            }
            else if(selection == 4) {
                va.setIterationCtr(0);
                ss.selectionSort(arrModified);
                System.out.println("This took " + va.getIterationCtr() + " iterations to sort successfully");
            }
            else if(selection == 5) {
                va.setIterationCtr(0);
                is.insertionSort(arrModified);
                System.out.println("This took " + va.getIterationCtr() + " iterations to sort successfully");
            }
            else if(selection == 6) {
                arrUnmodified = va.makeArray();
                System.out.println("New Array Made Successfully.");
            }
        }
        System.out.println("Have a good day!");

    }

}