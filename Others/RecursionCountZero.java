public class RecursionCountZero {

  public static void main(String[] args) {
    int res = reverse(104069000, 0);
    System.out.println(res);
  }

  public static int reverse(int n, int count) {
    if (n == 0) {
      return count;
    }
    if (n % 10 == 0) {
      count++;
    }
    return reverse(n / 10, count);
  }
}
