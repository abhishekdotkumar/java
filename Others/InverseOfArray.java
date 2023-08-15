import java.util.Arrays;

public class InverseOfArray {

  public static void main(String[] args) {
    int[][] arr = {
      { 1, 0, 0 },
      { 1, 1, 0 },
      { 1, 0, 1 },
      { 1, 1, 1 },
      { 0, 1, 1 },
      { 1, 0, 1 },
    };
    for (int i = 0; i < arr.length; i++) {
      int[] secondArr = arr[i];
      for (int j = 0; j < (secondArr.length + 1) / 2; j++) {
        int temp = secondArr[j] ^ 1;
        secondArr[j] = secondArr[secondArr.length - 1 - j] ^ 1;
        secondArr[secondArr.length - 1 - j] = temp;
      }
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.println(Arrays.toString(arr[i]));
    }
  }
}
