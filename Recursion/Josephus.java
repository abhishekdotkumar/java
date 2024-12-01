public class Josephus {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int k = 2;
        josephus(arr, k, k, arr.length, 0);

    }

    public static void josephus(int[] arr, int ok, int mk, int counter, int currentIndex) {
        if (counter == 1) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    System.out.println("Person who was standing at " + (i + 1) + " is alive");
                    return;
                }
            }
        }
        while (arr[currentIndex % arr.length] == 1) {
            currentIndex = currentIndex % arr.length + 1;
        }

        if (mk == 1) {
            counter--;
            mk = ok;
            arr[currentIndex % arr.length] = 1;
            System.out.println("Eliminating person: " + ((currentIndex % arr.length) + 1));
            josephus(arr, ok, ok, counter, currentIndex % arr.length + 1);

        } else {
            josephus(arr, ok, mk - 1, counter, currentIndex % arr.length + 1);
        }

    }
}
