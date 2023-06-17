public class RemoveCharUsingRecursion {

  public static void main(String[] args) {
    String str = "acbbchd";
    char[] newStr = str.toCharArray();
    StringBuilder ans = new StringBuilder("");
    char remove = 'a';
    System.out.println(removeChar(newStr, 0, ans, remove));
    System.out.println(skipApple("dasappleMango"));
  }

  public static StringBuilder removeChar(
    char[] str,
    int index,
    StringBuilder ans,
    char remove
  ) {
    if (index == str.length) {
      return ans;
    } else {
      if (str[index] != remove) {
        ans.append(str[index]);
      }
      index++;
      return removeChar(str, index, ans, remove);
    }
  }

  public static String skipApple(String up) {
    if (up.isEmpty()) {
      return "";
    }
    char ch = up.charAt(0);
    if (up.startsWith("apple")) {
      return skipApple(up.substring(5));
    }
    return ch + skipApple(up.substring(1));
  }
}
