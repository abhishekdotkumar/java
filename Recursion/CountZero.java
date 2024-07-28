public class CountZero {

  public static void main(String[] args) {
    int ans = count( 31000, 0);
    System.out.println(ans);
  }

  public static int count(long n, int count) {
    if (n % 10 == n) {
      if (n % 10 == 0) {
        return ++count;
      }
      return count;
    }
    if (n % 10 == 0) {
      count++;
    }
    return count(n / 10, count);
  }
}
