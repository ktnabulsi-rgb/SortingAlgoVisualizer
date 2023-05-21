public class HeapSort {
    public void heapSort(int[] array) {
        VisualizerAlgo va = new VisualizerAlgo();
        int n = array.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
            va.printVis(array);
        }

        // One by one extract an element from the heap
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to the end
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // call max heapify on the reduced heap
            heapify(array, i, 0);
            va.printVis(array);
        }
    }

    private void heapify(int[] array, int n, int i) {
        int largest = i;  // Initialize largest as root
        int leftChild = 2 * i + 1;  // Left child
        int rightChild = 2 * i + 2; // Right child

        // If left child is larger than root
        if (leftChild < n && array[leftChild] > array[largest])
            largest = leftChild;

        // If right child is larger than largest so far
        if (rightChild < n && array[rightChild] > array[largest])
            largest = rightChild;

        // If largest is not root
        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(array, n, largest);
        }
    }
}
