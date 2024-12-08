package DynamicProgramming.LCS;

public class SeqPatternMatching {
    public static void main(String[] args) {
        String x = "AXY";
        String y = "ADXCPY";

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

                if (x.charAt(i - 1) == y.charAt(j - 1)) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
                }

            }
        }

        if (t[m][n] == Math.min(x.length(), y.length())) {
            System.out.println("Yes matched");
            return;
        }
        System.out.println("Not matched");

    }
}
