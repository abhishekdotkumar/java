package DynamicProgramming.MCM;

public class MCM {
    public static void main(String[] args) {

        int[] arr = { 2, 1, 3, 4 };
        int[][] t = new int[arr.length + 1][arr.length + 1];

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                t[i][j] = -1;
            }
        }

        System.out.println(solve(arr, 1, arr.length - 1, t));
    }

    public static int solve(int[] arr, int i, int j, int[][] t) {
        if (i >= j) {
            return 0;
        }
        if (t[i][j] != -1) {
            return t[i][j];
        }

        // Calculate the middle cost = arr[i-1] * arr[k] * arr[j]

        int minCost = Integer.MAX_VALUE;                                                  
        for (int k = i; k <= j - 1; k++) {
            int middleCost = arr[i - 1] * arr[k] * arr[j];

            int tempAns = solve(arr, i, k, t) + middleCost + solve(arr, k + 1, j, t);
            if (minCost > tempAns) {
                minCost = tempAns;
            }
        }
        return t[i][j] = minCost;
    }

}
