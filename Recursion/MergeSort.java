import java.util.Arrays;

public class MergeSort {

  public static void main(String[] args) {
    int[] arr = { 5, 226, 75, 21, 1, 6, 7 };
    //            0,   1,  2,  3, 4, 5, 6

    sort(arr, 0, arr.length - 1);
    System.out.println(Arrays.toString(arr));
  }

  public static void sort(int[] arr, int s, int e) {
    if (e - s == 1) {
      return;
    }
    int m = s + (e - s) / 2;
    sort(arr, s, m);
    sort(arr, m, e);
    merge(arr, s, m, e);
  }

  public static void merge(int[] arr, int s, int m, int e) {
    int k = 0;
    int[] mix = new int[e - s];
    while (s < m && m < e) {
      if (arr[s] < arr[m]) {
        mix[k] = arr[s+k];

      } else {
        mix[k] = arr[m+k];
      }
      k++;
    }

    while (s < m) {
      mix[k] = arr[s+k];
      s++;
      k++;
    }
    while (m < e) {
      mix[m + k] = arr[m];
      m++;
      k++;
    }

    for (int i = 0; i < mix.length; i++) {
        
    }
  }
}
