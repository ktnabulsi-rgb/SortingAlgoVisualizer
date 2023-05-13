import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Press the corresponding number to see the visualization of the selected sorting algorithm. \n1.Merge Sort\n2.Bubble Sort\n0.Exit");
            int selection = input.nextInt();
            if(selection == 0){
                break;
            }
            else if(selection == 1){
                //Run merge sort
            }
            else if(selection == 2){
                //Run bubble sort
            }
        }
        System.out.println("Have a good day!");
    }

    /* Prints the array */
    public void printArray(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n; ++i) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
    }
    
}