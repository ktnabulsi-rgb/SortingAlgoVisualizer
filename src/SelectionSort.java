public class SelectionSort {

    /**
     * The selectionSort method sorts an array of integers in ascending order using the Selection Sort algorithm.
     * The method also visualizes the sorting process by calling the printVis method from the VisualizerAlgo class.
     *
     * @param array the input integer array that needs to be sorted. It can be of any size.
     *              Each element of the array represents an integer.
     *
     * The method does not return any value. Instead, it directly modifies the input array.
     * After the execution of the method, the input array will be sorted in ascending order.
     */
    public void selectionSort(int[] array) {
        VisualizerAlgo va = new VisualizerAlgo();
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            // Find the index of the minimum element in the unsorted part of the array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
                va.printVis(array);
            }

            // Swap the minimum element with the first element of the unsorted part
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
