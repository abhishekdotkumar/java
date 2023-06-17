public class MissingNumber {

  public static void main(String[] args) {
    int[] nums = { 0, 3 };
    int ans = missingNumber(nums);
    System.out.println(ans);
  }

  public static int missingNumber(int[] nums) {
    CyclicSort(nums);
    for (int i = 0; i < nums.length; i++) {
      if (i != nums[i]) {
        return i;
      }
    }

    return nums.length;
  }

  public static void CyclicSort(int[] nums) {
    int i = 0;
    while (i < nums.length) {
      if (nums[i] < nums.length - 1 && nums[i] != nums[nums[i]]) {
        swap(nums, i, nums[i]);
      } else {
        i++;
      }
    }
  }

  public static void swap(int[] nums, int index1, int index2) {
    int temp = nums[index1];
    nums[index1] = nums[index2];
    nums[index2] = temp;
  }
}
