public class Factorial {

  public static void main(String[] args) {
    long ans = fact(5);
    System.out.println(ans);
  }

  public static long fact(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n * fact(n - 1);
    }
  }
}
