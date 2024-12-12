package DynamicProgramming.MCM;

public class EggDropping {

    public static int[][] t;

    public static void main(String[] args) {

        int eggs = 4;
        int floors = 10;
        t = new int[eggs + 1][floors + 1];

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                t[i][j] = -1;
            }
        }

        System.out.println(solve(eggs, floors));

        for (int[] row : t) {
            System.out.print("[ ");
            for (int value : row) {
                System.out.printf("%-3d", value); // Align values to 3 spaces
            }
            System.out.println("]");
        }

    }

    public static int solve(int egg, int floor) {
        if (floor <= 1) {
            return floor;
        }
        if (egg == 1) {
            return floor;
        }

        if (t[egg][floor] != -1) {
            return t[egg][floor];
        }

        int min = Integer.MAX_VALUE;

        for (int k = 1; k <= floor; k++) {
            int temp = 1 + Math.max(solve(egg - 1, k - 1), solve(egg, floor - k));
            if (min > temp) {
                min = temp;
            }
        }
        return t[egg][floor] = min;
    }

}
