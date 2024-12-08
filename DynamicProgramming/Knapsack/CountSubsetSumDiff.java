package DynamicProgramming.Knapsack;

public class CountSubsetSumDiff {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3 };
        int diff = 1;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int res = (sum + diff) / 2;

        sum = res;

        int[][] t = new int[arr.length + 1][sum + 1];

        for (int i = 0; i < arr.length + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                if (i == 0) {
                    t[i][j] = 0;
                }
                if (j == 0) {
                    t[i][j] = 1;
                }
            }
        }

        for (int i = 1; i < arr.length + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (arr[i - 1] <= j) {
                    t[i][j] = t[i - 1][j - arr[i - 1]] + t[i - 1][j];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }

        System.out.print("Ans for iteration is: ");
        System.out.println(t[arr.length][sum]);
    }
}
