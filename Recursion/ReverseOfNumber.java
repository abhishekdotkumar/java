public class ReverseOfNumber {

  public static void main(String[] args) {
    int ans = rev(231412, 0);
    System.out.println(ans);
  }

  public static int rev(int n, int ans) {
    if (n % 10 == n) {
      return ans * 10 + (n % 10);
    } else {
      return rev(n / 10, ans * 10 + (n % 10));
    }
  }
}
