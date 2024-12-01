public class ReverseStack {
    public static int size = 0;
    public static int mid = size / 2;

    public static void main(String[] args) {
        int[] arr = new int[10];
        push(arr, 5);
        push(arr, 12);
        push(arr, 8);
        push(arr, 6);
        push(arr, 4);
        print(arr);
        reverse(arr);
        print(arr);

    }

    public static void pop(int[] arr) {
        arr[size - 1] = 0;
        size--;
    }

    public static void push(int[] arr, int value) {
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

    public static void reverse(int[] arr) {
        if (size == 0) {
            return;
        }

        int temp = top(arr);
        pop(arr);

        reverse(arr);

        insert_at_bottom(arr, temp);

    }

    public static void insert_at_bottom(int[] arr, int value) {
        if (size == 0) {
            push(arr, value);
            return;
        }
        int temp = top(arr);
        pop(arr);
        insert_at_bottom(arr, value);
        push(arr, temp);

    }

}
