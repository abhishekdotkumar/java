package SlidingWindow;
public class SumOfSubArray {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
    int k = 3;
    int j = 0;
    int sum = 0;
    int max = 0;
    for (int i = 0; i < arr.length; i++) {
      if (j < k) {
        sum = sum + arr[i];
      } else {
        sum = sum - arr[i - k] + arr[j];
      }
      if (max < sum) {
        max = sum;
      }
      j++;
    }
    System.out.println(max);
  }
}
