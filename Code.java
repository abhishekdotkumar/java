public class Code {

  public static void main(String[] args) {
    int[] arr = {};

    boolean res = sortedOrNot(arr, 0);
    System.out.println(res);
  }

  public static boolean sortedOrNot(int[] arr, int i) {
    if (i > arr.length - 2) {
      return true;
    }
    if (arr[i] > arr[i + 1]) {
      return false;
    }
    return sortedOrNot(arr, i + 1);
  }
}
