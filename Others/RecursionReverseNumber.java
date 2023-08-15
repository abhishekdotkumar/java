public class RecursionReverseNumber {

  public static void main(String[] args) {
    int ans = 0;
    int n = 1155;
    int res = reverse(n, ans);
    palindrome(n, res);
  }

  public static int reverse(int n, int ans) {
    if (n == 0) {
      return ans;
    }
    return reverse(n / 10, (ans * 10) + (n % 10));
  }

  public static void palindrome(int initialValue, int reverseValue) {
    System.out.println(initialValue);
    System.out.println("Reverse of above number is: " + reverseValue);
    if (initialValue == reverseValue) {
      System.out.println("Number is Palidrome");
    } else {
      System.out.println("Number is not Palindrome");
    }
  }
}
