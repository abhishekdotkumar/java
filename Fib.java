public class Fib {

  public static void main(String[] args) {
    int a = 0;
    int count = 2;
    int b = 1;
    System.out.print(a + ", " + b);
    fibonacci(a, b, count);
  }

  public static void fibonacci(int a, int b, int count) {
    count++;
    if (count > 14) {
      return;
    } else {
      System.out.print(", ");
      System.out.print(a + b);
      fibonacci(b, a + b, count);
    }
  }
}
