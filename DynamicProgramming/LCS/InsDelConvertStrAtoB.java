package DynamicProgramming.LCS;

public class InsDelConvertStrAtoB {
    public static void main(String[] args) {
        String x = "heap";
        String y = "pea";

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


        System.out.println("No of deletions: " + (x.length() - t[m][n]));
        System.out.println("No of insertions: " + (y.length() - t[m][n]));
    }
}
