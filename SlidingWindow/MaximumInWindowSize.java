import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MaximumInWindowSize {

  public static void main(String[] args) {
    int[] arr = { 1, 3, -1, -1, 2, -3, 6, 7 };

    int k = 3;
    int i = 0;
    int max = -999;
    int[] res = new int[arr.length - 2];
    Queue<Integer> queue = new LinkedList<>();
    for (int j = 0; j < arr.length; j++) {
      if (arr[j] > max) {
        max = arr[j];
      }
      if (queue.isEmpty()) {
        queue.add(max);
      }
      if (!queue.isEmpty() && queue.peek() < max) {
        queue.clear();
        queue.add(max);
      }
      if (!queue.isEmpty() && queue.peek() > arr[j]) {
        queue.add(arr[j]);
      }
      if (j >= k - 1) {
        res[j - k + 1] = queue.peek();
        if (queue.peek() == arr[i]) {
          queue.poll();
          max = queue.peek();
        }
        i++;
      }
    }
    System.out.println(Arrays.toString(res));
  }
}
