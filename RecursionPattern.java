import java.util.Arrays;

public class RecursionPattern {

  public static void main(String[] args) {
    int[] arr = { 1,1,1,1 };
    // leftTriangle(10, 0);
    if (arr.length > 1) {
      bubbleSort(arr, 0, 1, arr.length);
    }
    System.out.println(Arrays.toString(arr));
  }

  public static void leftTriangle(int r, int c) {
    if (r == 0 && c == 0) {
      return;
    }
    if (c == r) {
      System.out.println("");
      leftTriangle(r - 1, 0);
    } else {
      System.out.print("* ");
      leftTriangle(r, ++c);
    }
  }

  public static void bubbleSort(int[] arr, int i, int j, int length) {
    if (arr[i] > arr[j]) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
    if (length == 1) {
      return;
    }
    if (j >= length - 1) {
      bubbleSort(arr, 0, 1, --length);
    } else {
      bubbleSort(arr, ++i, ++j, length);
    }
  }
}
