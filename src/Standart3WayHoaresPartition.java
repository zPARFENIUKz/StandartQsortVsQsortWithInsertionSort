public class Standart3WayHoaresPartition extends PivotIndexGenerator {
    protected static int[] partition(final int[] arr, final int lowIndex, final int highIndex){
        final int pivotIndex = generatePivotIndex(lowIndex, highIndex);
        final int pivot = arr[pivotIndex];
        if (pivotIndex != lowIndex){
            swap(arr, lowIndex, pivotIndex);
        }

        int leftPtr = lowIndex, rightPtr = highIndex;
        for (int i = lowIndex + 1; i <= rightPtr; ++i){
            if (arr[i] < pivot) {
                swap(arr, i, leftPtr);
                ++leftPtr;
            } else if (arr[i] > pivot) {
                swap(arr, i, rightPtr);
                --rightPtr;
                --i;
            }
        }
        return new int[] {leftPtr, rightPtr};
    }
}
