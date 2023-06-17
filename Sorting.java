import java.util.Arrays;

class Sorting {

  public static void main(String[] args) {
    int[] arr = { 44, 1, 67, 10, 12 };
    SelectionSort(arr);
  }

  public static void SelectionSort(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      swap(arr, max(arr, 0, arr.length - i), arr.length - i - 1);
    }
    print(arr);
  }

  public static int max(int arr[], int start, int end) {
    int max = start;
    for (int j = start; j < end; j++) {
      if (arr[max] < arr[j]) {
        max = j;
      }
    }
    return max;
  }

  public static void InsertionSort(int arr[]) {
    for (int i = 1; i < arr.length; i++) {
      for (int j = i; j > 0; j--) {
        if (arr[j] < arr[j - 1]) {
          swap(arr, j, j - 1);
        }
      }
    }
    print(arr);
  }

  public static void CyclicSort(int arr[]) {
    int i = 0;
    while (i < arr.length) {
      if (arr[arr[i] - 1] == arr[i]) {
        i++;
      } else {
        swap(arr, i, arr[i] - 1);
      }
    }
    print(arr);
  }

  public static void BubbleSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          swap(arr, j, j + 1);
        }
      }
    }
    print(arr);
  }

  public static void swap(int[] arr, int index1, int index2) {
    int temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;
  }

  public static void print(int[] arr) {
    System.out.println(Arrays.toString(arr));
  }
}
