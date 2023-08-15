import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

  public static void main(String[] args) {
    int[][] arr = { 
     { 1, 2 }, 
     { 4, 5}, 
     { 7, 8 },
     { 7, 8 },
     { 7, 8 } };

    spiralOrder(arr);
  }

  public static List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> result = new ArrayList<Integer>();
    int top = 0;
    int bottom = matrix.length - 1;
    int right = matrix[0].length - 1;
    int left = 0;
    while (right >= left && top <= bottom) {
      if (left <= right && top <= bottom) {
        for (int i = left; i <= right; i++) {
          result.add(matrix[top][i]);
        }
        top++;
      }
      if (left <= right && top <= bottom) {
        for (int i = top; i <= bottom; i++) {
          result.add(matrix[i][right]);
        }
        right--;
      }
      if (left <= right && top <= bottom) {
        for (int i = right; i >= left; i--) {
          result.add(matrix[bottom][i]);
        }
        bottom--;
      }
      if (left <= right && top <= bottom) {
        for (int i = bottom; i >= top; i--) {
          result.add(matrix[i][left]);
        }
        left++;
      }
    }
    System.out.println(result);
    return result;
  }
}
