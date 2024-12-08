package DynamicProgramming.Unbounded;

public class RodCutting {
    public static void main(String[] args) {
        int[] length = { 1, 2, 3, 4 };
        int[] price = { 5, 6, 7, 8 };
        int n = 9;

        int[][] t = new int[price.length + 1][n + 1];

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                if (i == 0 || j == 0) {
                    t[i][j] = 0;
                }
            }
        }

        for (int i = 1; i < t.length; i++) {
            for (int j = 1; j < t[i].length; j++) {
                if (length[i - 1] <= j) {
                    t[i][j] = Math.max(price[i - 1] + t[i][j - length[i - 1]], t[i - 1][j]);
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }

        System.out.print("Ans for iteration is: ");
        System.out.println(t[price.length][n]);
    }
}
