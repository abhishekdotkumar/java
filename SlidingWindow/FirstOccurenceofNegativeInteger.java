import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FirstOccurenceofNegativeInteger {

  public static void main(String[] args) {
    int[] arr = { 12, -1, 7, 8, -15, 30, 16, -2 };

    int k = 3;
    int i = 0;
    int[] res = new int[arr.length - 2];
    Queue<Integer> queue = new LinkedList<>();
    for (int j = 0; j < arr.length; j++) {
      if (arr[j] < 0) {
        queue.add(arr[j]);
      }
      if (j >= k - 1) {
        if (queue.isEmpty()) {
          res[j - k + 1] = 0;
        } else {
          res[j - k + 1] = queue.peek();
        }
        if (queue.peek() != null && arr[j + 1 - k] == queue.peek()) {
          queue.poll();
        }
        i++;
      }
    }
    System.out.println(Arrays.toString(res));
  }
}
