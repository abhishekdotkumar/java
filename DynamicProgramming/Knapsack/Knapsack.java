package DynamicProgramming.Knapsack;

public class Knapsack {
    public static void main(String[] args) {
        int[] wt = { 4, 5, 1 };
        int[] val = { 1, 2, 3 };
        int n = wt.length;
        int W = 4;

        int[][] t = new int[n + 1][W + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= W; j++) {
                t[i][j] = 0;
            }
        }

        // System.out.println(recKnapsack(val, wt, W, n, t));

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < W + 1; j++) {
                if (i == 0 || j == 0) {
                    t[i][j] = 0;
                }
            }
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                if (i == 0 || j == 0) {
                    t[i][j] = 0;
                }

                if (wt[i - 1] <= j) {
                    t[i][j] = Math.max(val[i - 1] + t[i - 1][j - wt[i - 1]], t[i - 1][j]);
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }

        System.out.println(t[n][W]);
    }

    public static int recKnapsack(int[] val, int[] wt, int W, int n, int[][] t) {
        if (n == 0 || W == 0)
            return 0;

        if (t[n][W] != -1) {
            return t[n][W];
        }

        if (wt[n - 1] <= W) {
            t[n][W] = Math.max(val[n - 1] + recKnapsack(val, wt, W - wt[n - 1], n - 1, t),
                    recKnapsack(val, wt, W, n - 1, t));
            return t[n][W];
        } else {
            t[n][W] = recKnapsack(val, wt, W, n - 1, t);
            return t[n][W];
        }
    }

}
