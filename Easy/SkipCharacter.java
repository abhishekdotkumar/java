package Easy;

public class SkipCharacter {
    public static void main(String args[]) {

        String str = "abccbaa";
        getValue(str, "");
      }
    
      public static void getValue(String p, String up) {
    
        if (p.isEmpty()) {
          System.out.println(up);
          return;
        }
    
        char out = p.charAt(0);
        if (out != 'a') {
          up = up + out;
        }
    
        getValue(p.substring(1), up);
    
      }
    
}
