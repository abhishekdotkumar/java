package DynamicProgramming.Unbounded;

public class CoinChange2 {
    public static void main(String[] args) {
        int[] coin = { 2, 2, 3 };
        int sum = 5;

        int[][] t = new int[coin.length + 1][sum + 1];

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                if (j == 0) {
                    t[i][j] = 0;
                }
                if (i == 0) {
                    t[i][j] = Integer.MAX_VALUE - 1;
                }
            }
        }

        for (int j = 1; j < t[1].length; j++) {
            if (j % coin[0] == 0) { // here we need to consider 1st item of coin array
                t[1][j] = j / coin[0];
            } else {
                t[1][j] = Integer.MAX_VALUE - 1;
            }

        }

        // for (int[] row : t) {
        // System.out.print("[ ");
        // for (int value : row) {
        // System.out.printf("%-3d", value); // Align values to 3 spaces
        // }
        // System.out.println("]");
        // }

        for (int i = 2; i < t.length; i++) {
            for (int j = 1; j < t[i].length; j++) {
                if (coin[i - 1] <= j) {
                    t[i][j] = Math.min(t[i][j - coin[i - 1]] + 1, t[i - 1][j]);
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }

        System.out.print("Ans for iteration is: ");
        System.out.println(t[coin.length][sum]);
    }
}
