package DynamicProgramming.Knapsack;

public class MinSubsetSumDiff {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 7 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        boolean[][] t = new boolean[arr.length + 1][sum + 1];

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                if (i == 0) {
                    t[i][j] = false;
                }

                if (j == 0) {
                    t[i][j] = true;
                }
            }
        }

        for (int i = 1; i < t.length; i++) {
            for (int j = 1; j < t[i].length; j++) {
                if (arr[i - 1] <= j) {
                    t[i][j] = t[i - 1][j - arr[i - 1]] | t[i - 1][j];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }

        for (int i = 1; i < t[arr.length].length; i++) {
            System.out.print(t[arr.length][i] + " ");
        }
        System.out.println();

        int minValue = Integer.MAX_VALUE;

        // Formula S2-S1 where S2= Sum-S1 i.e,| (Sum-S1)-S1 | = Sum - 2S1
        // Take last row from t[][] and ignore 1st index i.e, 0 and run upto range/2
        for (int i = 1; i < (t[arr.length].length / 2) + 1; i++) {
            if (t[arr.length][i] == true) {
                minValue = Math.min(minValue, sum - (2 * i));
            }

        }

        System.out.println(minValue);
    }

}
