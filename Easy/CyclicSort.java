package Easy;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String args[]) {
    int[] arr = { 3, 5, 2, 2, 1, 4, 6 };

    // Cyclic Sort
    int i = 0;
    while (i < arr.length) {
      if (arr[i] != i + 1) {
        swap(arr, i, arr[i] - 1);
      } else {
        i++;
      }
    }

    System.out.println(Arrays.toString(arr));
  }

  public static void swap(int[] arr, int s, int e) {
    int temp = arr[s];
    arr[s] = arr[e];
    arr[e] = temp;
  }
}
