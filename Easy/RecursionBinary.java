package Easy;

public class RecursionBinary {
    public static void main(String args[]) {

        int[] arr = { 1, 2, 3, 4, 5, 7 };
        int ans = binary(arr, 0, arr.length, 99);
        System.out.println(ans);
    }

    public static int binary(int[] arr, int s, int e, int t) {
        int m = s + (e - s) / 2;

        if (s >= e) {
            return -1;
        }

        if (arr[m] == t) {
            return m;
        }

        if (arr[m] > t) {
            return binary(arr, s, m, t);
        } else {
            return binary(arr, m + 1, e, t);
        }

    }
}
