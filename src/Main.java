public class Main {
    public static void main(String[] args) {
        System.out.println("test");
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