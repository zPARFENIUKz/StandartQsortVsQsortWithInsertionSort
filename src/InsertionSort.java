public class InsertionSort {
    protected static void insertionSort(final int[] arr, final int fromIndex, final int toIndex) {
        for (int i = fromIndex + 1; i <= toIndex; ++i) {
            int j = i - 1;
            for (; j >= fromIndex && arr[j] > arr[i]; --j) ;
            ++j;
            final int buf = arr[i];
            slide(arr, j, i);
            arr[j] = buf;
        }
    }

    private static void slide(final int[] arr, final int from, int to){
        if (arr == null) return;
        for (;to > from;--to){
            arr[to] = arr[to-1];
        }
    }
}
