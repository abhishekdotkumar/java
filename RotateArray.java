import java.util.Arrays;

public class RotateArray {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
    int rotate = 4;
    rotate(arr, rotate);
    System.out.println(Arrays.toString(arr));
  }

  public static void rotate(int[] nums, int k) {
    k %= nums.length;
    int[] newArr = new int[k];
    for (int i = 0; i < newArr.length; i++) {
      newArr[i] = nums[nums.length - k + i];
    }

    for (int i = nums.length - 1 - k; i >= 0; i--) {
      nums[i + k] = nums[i];
    }
    for (int i = 0; i < k; i++) {
      nums[i] = newArr[i];
    }
  }
}
