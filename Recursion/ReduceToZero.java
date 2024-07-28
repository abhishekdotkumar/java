public class ReduceToZero {

  // Conditions
  // If number is even divide by 2
  // If number is odd subtract by 1
  public static void main(String[] args) {
    int noOfSteps = reduce(14, 0);
    System.out.println(noOfSteps);
  }

  public static int reduce(int n, int count) {
    if (n == 0) {
      return count;
    } else if (n % 2 == 0) {
      return reduce(n / 2, ++count);
    } else {
      return reduce(n - 1, ++count);
    }
  }
}
