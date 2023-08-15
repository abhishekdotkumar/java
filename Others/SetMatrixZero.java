import java.util.Arrays;

public class SetMatrixZero {

  public static void main(String[] args) {
    int[][] arr = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
    setZeroes(arr);
  }

  public static void setZeroes(int[][] matrix) {
    int[] row = new int[matrix.length];
    int[] col = new int[matrix[0].length];

    for (int i = 0; i < row.length; i++) {
      row[i] = 1;
    }

    for (int i = 0; i < col.length; i++) {
      col[i] = 1;
    }

    for (int i = 0; i < row.length; i++) {
      for (int j = 0; j < col.length; j++) {
        if (matrix[i][j] == 0) {
          row[i] = 0;
          col[j] = 0;
        }
      }
    }
    for (int i = 0; i < row.length; i++) {
      for (int j = 0; j < col.length; j++) {
        if (row[i] == 0 || col[j] == 0) {
          matrix[i][j] = 0;
        }
      }
    }
    System.out.print('[');
    for (int i = 0; i < row.length; i++) {
      System.out.print(Arrays.toString(matrix[i]));
      if (i < matrix.length - 1) {
        System.out.print(',');
      }
    }
    System.out.print(']');
  }
}
