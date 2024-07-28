public class LinearSearch {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 15, 67 };
    int ans = search(arr, 0, arr.length-1, 90);
    System.out.println(ans);
  }

  public static int search(int[] arr, int s, int e, int target) {
    if (s > e) {
      return -1;
    }

    int mid = s + (e - s) / 2;
    if (arr[mid] == target) {
      return mid;
    } else if (target > arr[mid]) {
      return search(arr, mid + 1, arr.length-1, target);
    } else {
      return search(arr, 0, mid - 1, target);
    }
  }
}
