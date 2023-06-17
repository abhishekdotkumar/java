import java.util.*;

public class finddissappearedNumbers {

  // public List<Integer> findDisappearedNumbers(int[] nums) {

  public static void main(String[] args) {
    int[] arr = { 1 };
    int ans = firstMissingPositive(arr);
    System.out.print(ans);
  }

  public static int firstMissingPositive(int[] nums) {
    CyclicSort(nums);
    System.out.println(Arrays.toString(nums));
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != i + 1) {
        return i + 1;
      }
    }

    return nums.length + 1;
  }

  public static void CyclicSort(int arr[]) {
    int i = 0;
    while (i < arr.length) {
      if (arr[i] < arr.length && arr[i] > 0 && arr[arr[i] - 1] != arr[i]) {
        swap(arr, i, arr[i] - 1);
      } else {
        i++;
      }
    }
  }

  public static void swap(int[] arr, int index1, int index2) {
    int temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;
  }
}
