import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 6, 7 };
    int target = 3;

    System.out.println(Arrays.toString(twoSum(arr, target)));
  }

  public static int[] twoSum(int[] arr, int t) {
    HashMap<Integer, Integer> hash = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      int complement = t - arr[i];
      if (hash.containsKey(complement)) {
        return new int[] { hash.get(complement), i };
      } else {
        hash.put(arr[i], i);
      }
    }

    return new int[] { -1, -1 };
  }
}
