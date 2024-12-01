package Easy;

public class Ceiling {

  public static void main(String[] args) {
    int target = 7655;
    int[] arr = { 1, 2, 56, 94 };

    int ans = ceiling(arr, target);

    System.out.println(ans);
  }

  public static int ceiling(int arr[], int target) {
    if(target > arr[arr.length-1]){
        return -1;
    }
    int s = 0;
    int e = arr.length - 1;

    while (e >= s) {
    int m = s + (e - s) / 2;
      if (arr[m] == target) {
        return m;
      }

      if (arr[m] > target) {
        e = m - 1;
      }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         

      if (arr[m] < target) {
        s = m + 1;
      }
    }

    return s;
  }
}
