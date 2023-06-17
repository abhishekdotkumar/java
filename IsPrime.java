public class IsPrime {

  public static void main(String[] args) {
    int n = 13;
    if (n < 2) {
      System.out.println("Not Prime");
    }
    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0) {
        System.out.println("Not Prime");
        return;
      }
    }
    System.out.println("Prime");
  }
}
