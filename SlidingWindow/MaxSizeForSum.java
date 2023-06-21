public class MaxSizeForSum {

  public static void main(String[] args) {
    int[] arr = { 4, 1, 1, 1, 2, 3, 5 };

    int max = 0;
    int i = 0;
    int sum = 0;
    int k = 5;
    for (int j = 0; j < arr.length; j++) {
      sum = sum + arr[j]; 
      if (sum > k) {
        while (sum > k) {
          sum = sum - arr[i];
          i++;
        }
      }
      if (sum == k) {
        if (max < (j - i + 1)) {
          max = j - i + 1;
        }
      }
    }
    System.out.println(max);
  }
}
