public class DeleteMiddleElementStack {
    public static int size = 0;
    public static int mid = size / 2;

    public static void main(String[] args) {
        int[] arr = new int[10];
        insert(arr, 5);
        insert(arr, 12);
        insert(arr, 8);
        insert(arr, 6);
        insert(arr, 4);
        print(arr);
        deleteMiddle(arr, size / 2);
        print(arr);

    }

    public static void pop(int[] arr) {
        arr[size - 1] = 0;
        size--;
    }

    public static void insert(int[] arr, int value) {
        arr[size] = value;
        size++;
    }

    public static void print(int[] arr) {
        for (int i = size - 1; i >= 0; i--) {
            System.out.println("| " + arr[i] + " |");
        }
        System.out.println("___");
    }

    public static int top(int[] arr) {
        return arr[size - 1];
    }

    public static void deleteMiddle(int[] arr, int mid) {
        if (mid == size - 1) {
            pop(arr);
            return;
        }
        int temp = top(arr);
        pop(arr);
        System.out.println("Top of Stack: " + top(arr));
        deleteMiddle(arr, mid);
        insert(arr, temp);
    }

}
