package Easy;

public class MultiplePrimeNumber {
    public static void main(String args[]) {

        boolean[] arr = new boolean[40 + 1];
        for (int i = 0; i < arr.length; i++) {
          arr[i] = true;
        }
        int n = 40;
        int c = 2;
        while (c * c <= n) {
          for (int i = 2; i < arr.length; i++) {
            if (arr[i]) {
              if (i != c && i % c == 0) {
                arr[i] = false;
              }
            }
          }
          c++;
        }
    
        for (int i = 1; i <= arr.length; i++) {
          System.out.println(i + " -> " + arr[i]);
        }
    
      }
}
