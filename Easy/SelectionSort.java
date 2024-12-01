package Easy;

import java.util.Arrays;

public class SelectionSort {

  public static void main(String args[]) {
    int[] arr = { 10, 9, 14, 24, 89, 4, 6 };

    for (int i = 0; i < arr.length; i++) {
      int max = 0;
      int maxlength = arr.length - i - 1;

      for (int j = 1; j < maxlength; j++) {
        if (arr[j] > arr[max]) {
          max = j;
        }
      }
      int temp = arr[maxlength];
      arr[maxlength] = arr[max];
      arr[max] = temp;
    }

    System.out.println(Arrays.toString(arr));
  }
}
