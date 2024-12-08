package DynamicProgramming.LCS;

public class LongestRepeatingSubSeq {
    public static void main(String[] args) {
        String x = "AABEBCDD";

        // take copy of first string
        String y = x;

        int m = x.length();
        int n = y.length();

        int[][] t = new int[m + 1][n + 1];

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                if (i == 0 || j == 0) {
                    t[i][j] = 0;
                }
            }
        }

        for (int i = 1; i < t.length; i++) {
            for (int j = 1; j < t[i].length; j++) {

                if (x.charAt(i - 1) == y.charAt(j - 1) && i != j) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
                }

            }
        }

        // For Preety printing 2D array

        for (int[] row : t) {
        System.out.print("[ ");
        for (int value : row) {
        System.out.printf("%-3d", value); // Align values to 3 spaces
        }
        System.out.println("]");
        }

        System.out.println("Longest repeating subseq: " + t[m][n]);
    }
}
