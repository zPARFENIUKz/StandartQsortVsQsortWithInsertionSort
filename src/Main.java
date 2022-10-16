import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        final int[] arr = new int[100000000];
        for (int i = 0; i < arr.length; ++i){
            arr[i] = (int) (Math.random() * arr.length / 2);
        }
        //final int[] arrClone = arr.clone();
        final long startTime = System.currentTimeMillis();
        //StandartQuickSort.quickSort(arr);
        QSortWithInsertionSort.quickSort(arr);
        //Arrays.sort(arr);
        final long endTime = System.currentTimeMillis();
        //Arrays.sort(arrClone);
        //System.out.println(Arrays.equals(arr, arrClone));
        System.out.println("Executing time: " + (endTime - startTime));
    }
}
