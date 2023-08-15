public class MagicNumber {

  public static void main(String[] args) {
    int n = 2;
    int ans = 0;
    int base = 3;

    while (n > 0) {
      int last = n & 1;
      n >>= 1;
      ans = ans + (last * base);
      base = base * base;
    }
    System.out.println(ans);
  }
}
