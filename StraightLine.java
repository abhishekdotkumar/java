public class StraightLine {

  public static void main(String[] args) {
    int[][] arr = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 4, 5 } };

    System.out.println(checkStraightLine(arr));
  }

  public static boolean checkStraightLine(int[][] coordinates) {
    int[] currentArr = coordinates[0];
    int[] nextArr = coordinates[1];
    int[] ans = new int[] {
      nextArr[0] - currentArr[0],
      nextArr[1] - currentArr[1],
    };

    for (int i = 1; i < coordinates.length - 1; i++) {
      currentArr = coordinates[i];
      nextArr = coordinates[i + 1];
      if (
        (nextArr[0] - currentArr[0]) != ans[0] ||
        (nextArr[1] - currentArr[1]) != ans[1]
      ) {
        return false;
      }
    }
    return true;
  }
}
