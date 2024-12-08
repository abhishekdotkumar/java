package DynamicProgramming.Unbounded;

public class CoinChange {
    public static void main(String[] args) {
        int[] coin = { 1, 2, 3 };
        int sum = 5;

        int[][] t = new int[coin.length + 1][sum + 1];

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                if (i == 0) {
                    t[i][j] = 0;
                }
                if (j == 0) {
                    t[i][j] = 1;
                }
            }
        }

        for (int i = 1; i < t.length; i++) {
            for (int j = 1; j < t[i].length; j++) {
                if (coin[i - 1] <= j) {
                    t[i][j] = t[i][j - coin[i - 1]] + t[i - 1][j];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }

        System.out.print("Ans for iteration is: ");
        System.out.println(t[coin.length][sum]);
    }
}
