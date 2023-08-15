public class PowerOf2 {

  public static void main(String[] args) {
    // Formula = n & (n-1); Exception n = 0

    int n = 10;
    int last = n & 1;
    if (n == 0) {
      System.out.println(false);
      return;
    }

    int numberOfTimes = (int) ((Math.log(n) / Math.log(2)) + 1);
    for (int i = 0; i < numberOfTimes - 1; i++) {
      last = n & 1;
      n >>= 1;
      if (last == 1) {
        System.out.println(false);
        return;
      }
    }
    last = n & 1;
    System.out.println(last == 0 ? false : true);
  }
}
