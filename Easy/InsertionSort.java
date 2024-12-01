package Easy;

import java.util.Arrays;

public class InsertionSort {

  public static void main(String args[]) {
    int[] arr = { 10, 9, 14, 24, 89, 4, 6 };

    for (int k = 1; k < arr.length; k++) {
      int i = 0;
      int j = k;
      while (j > i) {
        if (arr[j - 1] > arr[j]) {
          int temp = arr[j];
          arr[j] = arr[j - 1];
          arr[j - 1] = temp;
        } else {
          break;
        }
        j--;
      }
    }

    System.out.println(Arrays.toString(arr));
  }
}
