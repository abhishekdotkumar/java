import java.util.HashMap;

public class MinimumWindowSubstring {

  public static void main(String[] args) {
    String s = "totttxtnotxf";
    String t = "totx";
    int[] ans = new int[2];
    if (t.length() > s.length()) {
      System.out.println("");
    }
    HashMap<Character, Integer> map = new HashMap<>();
    int count = 0;
    int i = 0;
    int min = 2147483641;
    StringBuilder res = new StringBuilder();
    for (int k = 0; k < t.length(); k++) {
      if (map.containsKey(t.charAt(k))) {
        map.replace(
          t.charAt(k),
          map.get(t.charAt(k)),
          map.get(t.charAt(k)) + 1
        );
      } else {
        map.put(t.charAt(k), 1);
        count++;
      }
    }

    for (int j = 0; j < s.length(); j++) {
      if (map.containsKey(s.charAt(j))) {
        if (map.get(s.charAt(j)) == 1) {
          count--;
        }
        map.replace(
          s.charAt(j),
          map.get(s.charAt(j)),
          map.get(s.charAt(j)) - 1
        );
        if (count == 0) {
          while (count == 0) {
            if (min > (j - i + 1)) {
              min = j - i + 1;
              ans[0] = i;
              ans[1] = j;
              res = new StringBuilder(s.substring(i, j + 1));
            }
            if (map.containsKey(s.charAt(i))) {
              if (map.get(s.charAt(i)) == 0) {
                count++;
              }
              map.replace(
                s.charAt(i),
                map.get(s.charAt(i)),
                map.get(s.charAt(i)) + 1
              );
            }
            i++;
          }
        }
      }
    }
    System.out.println(res);
  }
}
