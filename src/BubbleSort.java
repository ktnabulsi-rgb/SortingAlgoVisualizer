public class BubbleSort {

    /**
     * The bubbleSort method sorts an array of integers in ascending order using the Bubble Sort algorithm.
     * The method also visualizes the sorting process by calling the printVis method from VisualizerAlgo class.
     *
     * @param arr the input integer array that needs to be sorted. It can be of any size.
     *            Each element of the array represents an integer.
     *
     * The method does not return any value. Instead, it directly modifies the input array.
     * After the execution of the method, the input array will be sorted in ascending order.
     */

    public void bubbleSort(int[] arr) {
        VisualizerAlgo va = new VisualizerAlgo();
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    va.printVis(arr);
                }
            }
        }
    }
}