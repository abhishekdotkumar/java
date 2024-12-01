package Easy;

public class RecusionFibonacci {
    public static void main(String args[]) {

        int ans = fib(8);
        System.out.println(ans);
      }
    
      public static int fib(int n) {
        if (n == 1) {
          return 1;
        }
        if (n == 0) {
          return 0;
        }
        int a = fib(n - 1) + fib(n - 2);
        return a;
      }
}
