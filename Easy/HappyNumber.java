package Easy;

import java.util.HashSet;

public class HappyNumber {
    public static void main(String[] args) {

        int num = 12;
        System.out.println(happy(num));

    }

    public static boolean happy(int n) {
        HashSet<Integer> hash = new HashSet<>();
        while (n != 1) {
            hash.add(n);
            n = getSquare(n);
            if (!hash.contains(n)) {
                hash.add(n);
            } else {
                return false;
            }
        }
        return true;
    }

    public static int getSquare(int n) {
        int result = 0;
        while (n != 0) {
            result += (n % 10) * (n % 10);
            n = n / 10;
        }
        return result;
    }

}
