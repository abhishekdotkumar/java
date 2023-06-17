public class HappyNumber {

  public static void main(String[] args) {
    System.out.println(isHappy(10));
  }

  public static boolean isHappy(int n) {
    int slow = n;
    int fast = n;
    do {
      slow = Square(slow);
      fast = Square(Square(fast));
    } while (fast != slow);

    if (slow == fast) {
      return false;
    }

    return true;
  }

  public static int Square(int n) {
    int ans = 0;
    while (n > 0) {
      ans += (n % 10) * (n % 10);
      n /= 10;
    }
    return ans;
  }
}
