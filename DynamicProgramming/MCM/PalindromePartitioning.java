package DynamicProgramming.MCM;

public class PalindromePartitioning {
    public static void main(String[] args) {
        String str = "ababbbabbababa";
        int n = str.length();

        int t[][] = new int[n + 1][n + 1];

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                t[i][j] = -1;
            }
        }

        System.out.printf("Cost is: ");
        System.out.println(palindromePartitioning(str, 0, str.length() - 1, t));

        // For Preety printing 2D array

        // for (int[] row : t) {
        // System.out.print("[ ");
        // for (int value : row) {
        // System.out.printf("%-3d", value); // Align values to 3 spaces
        // }
        // System.out.println("]");
        // }

    }

    public static boolean isPalindrome(String str, int i, int j) {

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;

    }

    public static int palindromePartitioning(String str, int i, int j, int[][] t) {
        if (i >= j) {
            return 0;
        }

        if (isPalindrome(str, i, j)) {
            return 0;
        }

        if (t[i][j] != -1) {
            return t[i][j];
        }

        int min = Integer.MAX_VALUE;
        for (int k = i; k <= j - 1; k++) {
            int c1;
            int c2;
            if (t[i][k] != -1) {
                c1 = t[i][k];
            } else {
                t[i][k] = palindromePartitioning(str, i, k, t);
                c1 = t[i][k];

            }
            if (t[k + 1][j] != -1) {
                c2 = t[k + 1][j];
            } else {
                t[k + 1][j] = palindromePartitioning(str, k + 1, j, t);
                c2 = t[k + 1][j];

            }
            int temp = c1 + c2 + 1;
            if (min > temp) {
                min = temp;
            }
        }
        return t[i][j] = min;
    }
}
