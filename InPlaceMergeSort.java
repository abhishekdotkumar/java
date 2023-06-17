import java.util.Arrays;

public class InPlaceMergeSort {

  public static void main(String[] args) {
    int[] arr = { 2, 6, 11, 89, 45, 21, 7 };

    sort(Arrays.copyOfRange(arr, 0, 3), Arrays.copyOfRange(arr, 4, 6));
  }

  public static void sort(int[] a, int[] b) {}
}
