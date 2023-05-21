public class MergeSort {


    /**
     * The mergeSort method sorts an array of integers in ascending order using the Merge Sort algorithm.
     * The method also visualizes the sorting process by calling the printVis method from the VisualizerAlgo class.
     *
     * @param array the input integer array that needs to be sorted. It can be of any size.
     *              Each element of the array represents an integer.
     *
     * The method does not return any value. Instead, it directly modifies the input array.
     * After the execution of the method, the input array will be sorted in ascending order.
     */
    public void mergeSort(int[] array) {
        VisualizerAlgo va = new VisualizerAlgo();
        if (array.length < 2) {
            return;
        }
        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, array.length - mid);

        mergeSort(left);
        mergeSort(right);
        merge(array, left, right);
        va.printVis(array);
    }

    /**
     * The merge method is a helper function that merges two sorted integer arrays (left and right) into the original array.
     *
     * @param array the original integer array that will store the merged result.
     * @param left  the sorted integer array on the left side.
     * @param right the sorted integer array on the right side.
     *
     * The method does not return any value. Instead, it directly modifies the original array.
     * After the execution of the method, the original array will be sorted in ascending order.
     */
    private static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            }
            else {
                array[k++] = right[j++];
            }
        }
        while (i < left.length) {
            array[k++] = left[i++];
        }
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }
}
