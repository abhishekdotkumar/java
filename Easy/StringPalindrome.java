package Easy;

public class StringPalindrome {
    public static void main(String args[]) {

        String str = "abcocba";
        for (int i = 0; i < str.length() / 2; i++) {
          char a = str.charAt(i);
          char b = str.charAt(str.length() - 1 - i);
          if (a != b) {
            System.out.println("Not Palindrome");
            return;
          }
        }
    
        System.out.println("Palindrome");
      }
}
