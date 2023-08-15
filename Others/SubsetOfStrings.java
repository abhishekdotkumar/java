public class SubsetOfStrings {

  public static void main(String[] args) {
    String str = "abc";

    mapSubstring("", str);
  }

  public static void mapSubstring(String p, String up) {
    if (up.isEmpty()) {
      System.out.println(p);
      return;
    }
    char ch = up.charAt(0);
    mapSubstring(p + ch, up.substring(1));
    mapSubstring(p, up.substring(1));
  }
}
