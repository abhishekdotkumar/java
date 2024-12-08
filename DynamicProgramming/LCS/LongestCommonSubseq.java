package DynamicProgramming.LCS;

public class LongestCommonSubseq {
    public static void main(String[] args) {
        String x = "abcdgh";
        String y = "abedfhr";

        int m = x.length();
        int n = y.length();

        int[][] t = new int[m + 1][n + 1];
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                t[i][j] = -1;
            }
        }

        // For Preety printing 2D array

        // for (int[] row : t) {
        // System.out.print("[ ");
        // for (int value : row) {
        // System.out.printf("%-3d", value); // Align values to 3 spaces
        // }
        // System.out.println("]");
        // }

        System.out.println(lcs(x, y, m, n, t));
    }

    public static int lcs(String x, String y, int m, int n, int[][] t) {
        if (m == 0 || n == 0) {
            return 0;
        }
        if (t[m][n] != -1) {
            return t[m][n];
        }

        if (x.charAt(m - 1) == y.charAt(n - 1)) {
            return t[m][n] = 1 + lcs(x, y, m - 1, n - 1, t);
        }
        return t[m][n] = Math.max(lcs(x, y, m - 1, n, t), lcs(x, y, m, n - 1, t));

    }
}
