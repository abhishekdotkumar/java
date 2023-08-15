import java.util.Arrays;

public class CopyArrayMergeSort {

  public static void main(String[] args) {
    int[] arr = { 8, 9, 11, 2, 3, 4 };

    System.out.println(Arrays.toString(sort(arr)));
  }

  public static int[] divide(int[] arr, int s, int e) {
    if (s == e) {
      return arr;
    }
    return divide(arr, (e - s), e / 2);
  }

  public static int[] sort(int[] arr) {
    if (arr.length == 1) {
      return arr;
    }
    int mid = arr.length / 2;
    int[] a = sort(Arrays.copyOfRange(arr, 0, mid));
    int[] b = sort(Arrays.copyOfRange(arr, mid, arr.length));
    return merge(a, b);
  }

  public static int[] merge(int[] arr1, int[] arr2) {
    int[] res = new int[arr1.length + arr2.length];
    int i = 0;
    int j = 0;
    int k = 0;
    while (i < arr1.length && j < arr2.length) {
      if (arr1[i] > arr2[j]) {
        res[k] = arr2[j];
        j++;
      } else {
        res[k] = arr1[i];
        i++;
      }
      k++;
    }
    if (i == arr1.length) {
      for (int p = i + j; p < res.length; p++) {
        res[p] = arr2[j];
        j++;
      }
    } else {
      for (int p = i + j; p < res.length; p++) {
        res[p] = arr1[i];
        i++;
      }
    }

    return res;
  }
}
