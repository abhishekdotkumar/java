package DynamicProgramming.LCS;

public class LongestCommonSubstring {
    public static void main(String[] args) {
        String x = "abcde";
        String y = "abfce";
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
        int max = Integer.MIN_VALUE;

        for (int i = 1; i < t.length; i++) {
            for (int j = 1; j < t[i].length; j++) {
                if (x.charAt(i - 1) == y.charAt(j - 1)) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t[i][j] = 0;
                }
                if (t[i][j] > max) {
                    max = t[i][j];
                }
            }
        }

        // for (int[] row : t) {
        // System.out.print("[ ");
        // for (int value : row) {
        // System.out.printf("%-3d", value); // Align values to 3 spaces
        // }
        // System.out.println("]");
        // }

        System.out.println(max);

    }
}
