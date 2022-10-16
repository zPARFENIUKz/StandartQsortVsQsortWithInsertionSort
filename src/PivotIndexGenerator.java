public class PivotIndexGenerator {
    protected static int generatePivotIndex(final int from, final int to){
        return (int) (from + Math.random() * (to - from));
    }

    protected static void swap(final int[] arr, final int index1, final int index2){
        final int buf = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = buf;
    }
}
