public class QSortWithInsertionSort extends Standart3WayHoaresPartition{

    private static int minCountToQuickSort = 10;

    public static void quickSort(final int[] arr){
        if (arr == null) return;
        quickSort(arr, 0, arr.length - 1);
    }


    private static void quickSort(final int[] arr, final int lowIndex, final int highIndex){
        if (lowIndex < highIndex){
            final int[] pivotInterval = partition(arr, lowIndex, highIndex);
            if (pivotInterval[0] - 1 - lowIndex > minCountToQuickSort)
                quickSort(arr, lowIndex, pivotInterval[0] - 1);
            else {
                InsertionSort.insertionSort(arr, lowIndex, pivotInterval[0] - 1);
            }
            if (highIndex - pivotInterval[1] + 1 > minCountToQuickSort)
                quickSort(arr, pivotInterval[1] + 1, highIndex);
            else {
                InsertionSort.insertionSort(arr, pivotInterval[1] + 1, highIndex);
            }
        }
    }

}
