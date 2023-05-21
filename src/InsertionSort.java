public class InsertionSort {


    /**
     * The insertionSort method sorts an array of integers in ascending order using the Insertion Sort algorithm.
     * The method also visualizes the sorting process by calling the printVis method from the VisualizerAlgo class.
     *
     * @param array the input integer array that needs to be sorted. It can be of any size.
     *              Each element of the array represents an integer.
     *
     * The method does not return any value. Instead, it directly modifies the input array.
     * After the execution of the method, the input array will be sorted in ascending order.
     */
    public void insertionSort(int[] array) {
        VisualizerAlgo va = new VisualizerAlgo();
        int n = array.length;

        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
                va.printVis(array);
            }

            array[j + 1] = key;
        }
    }
}
