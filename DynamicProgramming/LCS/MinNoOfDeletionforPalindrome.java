package DynamicProgramming.LCS;

public class MinNoOfDeletionforPalindrome {
    public static void main(String[] args) {
        String x = "aebcbda";
        // reverse the string x to get other string
        String y = "";
        for (int i = 0; i < x.length(); i++) {
            y = y + x.charAt(x.length() - 1 - i) + "";
        }

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

        System.out.println("Min No if deletion to make it palindrome: " + (x.length() - t[m][n]));
        // Same way we can get min no of insertion, because if we just add the the
        // characters we deleted
        // we can make it palindrome
        System.out.println("Min No if insertion to make it palindrome: " + (x.length() - t[m][n]));
    }
}
