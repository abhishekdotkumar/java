public class BSusingRecursion {

  public static void main(String[] args) {
    int[] arr = { 1, 3, 23, 45, 67, 99 };
    int ans = search(arr, 99, 0, arr.length - 1);
    System.out.println(ans);
  }

  public static int search(int[] arr, int target, int start, int end) {
    if (start > end) {
      return -1;
    }
    int mid = (start + end) / 2;
    if (arr[mid] == target) {
      return mid;
    }
    if (arr[mid] < target) {
      return search(arr, target, mid + 1, end);
    }
    return search(arr, target, start, mid - 1);
  }
}
