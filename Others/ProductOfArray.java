import java.util.Arrays;

public class ProductOfArray {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4 };
    System.out.println(Arrays.toString(productExceptSelf(arr)));
  }

  public static int[] productExceptSelf(int[] nums) {
    if (nums.length < 2) {
      return nums;
    }
    int product = 1;
    int countOfZeros = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0) {
        countOfZeros++;
      } else {
        product = product * nums[i];
      }
    }
    if (countOfZeros > 1) {
      for (int i = 0; i < nums.length; i++) {
        nums[i] = 0;
      }
      return nums;
    }
    if (countOfZeros == 1) {
      for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 0) {
          nums[i] = product;
        } else {
          nums[i] = 0;
        }
      }
      return nums;
    }
    for (int i = 0; i < nums.length; i++) {
      nums[i] = product / nums[i];
    }
    return nums;
  }
}
