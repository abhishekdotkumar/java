package Easy;

public class AgnosticBinarySearch {

  public static void main(String args[]) {
    int[] swap = { 12, 12, 12, 11, 9 };
    String order = "asc";

    if (swap[swap.length - 1] < swap[0]) {
      order = "desc";
    }

    int ans = binarysearch(swap, 12, order);
    System.out.println(ans);
  }

  public static int binarysearch(int[] arr, int target, String ord) {
    if (ord == "desc") {
      int s = arr.length - 1;
      int e = 0;
      while (s >= e) {
        int m = e + (s - e) / 2;
        if (arr[m] == target) {
          return m;
        }
        if (arr[m] > target) {
          e = m + 1;
        }
        if (arr[m] < target) {
          s = m - 1;
        }
      }
      return -1;
    }

    int s = 0;
    int e = arr.length - 1;

    while (e >= s) {
      int m = s + (e - s) / 2;
      if (arr[m] == target) {
        return m;
      }
      if (arr[m] > target) {
        e = m - 1;
      }
      if (arr[m] < target) {
        s = m + 1;
      }
    }

    return -1;
  }
}
