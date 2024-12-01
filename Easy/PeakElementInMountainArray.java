package Easy;

public class PeakElementInMountainArray {

  public static void main(String args[]) {
    int[] arr = { 1, 2, 3 };

    int ans = peak(arr);

    System.out.println(ans);
  }

  public static int peak(int[] arr) {
    if (arr.length == 1) {
      return 0;
    }

    int s = 0;
    int e = arr.length - 1;

    while (e > s) {
      int m = s + (e - s) / 2;

      if (arr[m] > arr[m + 1]) {
        e = m;
      } else {
        s = m + 1;
      }
    }
    return s;
  }
}
