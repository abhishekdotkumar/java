package Easy;

public class CyclicSortDuplicate {
    public static void main(String args[]) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };

        int i = 0;

        while (i < arr.length) {

            if (arr[i] == arr[arr[i] - 1]) {
                i++;
            } else if (arr[i] != i + 1) {
                swap(arr, i, arr[i] - 1);
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                System.out.println(arr[j]);
            }
        }
    }

    public static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}
