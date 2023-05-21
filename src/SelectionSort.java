public class SelectionSort {
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
