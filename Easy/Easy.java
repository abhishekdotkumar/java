package Easy;

public class Easy {

  public static void main(String args[]) {

    String str = "abc";
    permutation("", str);
  }

  public static void permutation(String p, String up) {

    if (up.isEmpty()) {
      System.out.println(p);
      return;
    }

    char ch = up.charAt(0);
    for (int i = 0; i < up.length(); i++) {
      
      permutation(p + ch, up.substring(i));
    }
  }

}
