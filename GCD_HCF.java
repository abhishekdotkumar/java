public class GCD_HCF {

  public static void main(String[] args) {
    int a = 2;
    int b = 7;

    int ans = GCD(a, b);
    System.out.println(ans);
    System.out.println(LCM(a, b, ans));
  }

  public static int GCD(int a, int b) {
    if (a == 0) {
      return b;
    }
    return GCD(b % a, a);
  }

  public static int LCM(int a, int b, int gcd) {
    return (a * b) / gcd;
  }
}
