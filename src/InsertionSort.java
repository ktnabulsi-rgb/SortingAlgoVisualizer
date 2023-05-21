public class InsertionSort {
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
