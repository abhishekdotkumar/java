public class Operators {

  public static void main(String[] args) {
    // int[] arr = { 2, 6, 5, 8, 2 };
    // int ans = unique(arr);
    // System.out.println(ans);
    // ANDOperation(45);
    // findIthBit(10, 2);
    // setIthBit(10, 2);
    resetIthBit(11, 1);
  }

  public static int unique(int[] arr) {
    int res = 0;
    for (int i = 0; i < arr.length; i++) {
      res = res ^ arr[i];
    }
    return res;
  }

  public static void ANDOperation(int n) {
    System.out.println(n & 1);
  }

  public static void findIthBit(int n, int i) {
    int mask = 1 << i;
    if ((n & mask) != 0) {
      System.out.println((int) ((n & mask) / Math.pow(2, i)));
    } else {
      System.out.println(n & mask);
    }
  }

  public static void setIthBit(int n, int i) {
    int mask = 1 << i;

    System.out.println(n | mask);
  }

  public static void resetIthBit(int n, int i) {
    int mask = 1 << i;
    mask = ~mask;
    System.out.println(n & mask);
  }
}
