import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TemporaryFile {

  public static void main(String[] args) {
    String s = "barfoofoobarthefoobarman";
    String[] t = new String[] { "bar", "foo", "the" };
    System.out.println(findSubstring(s, t));
  }

  public static List<Integer> findSubstring(String s, String[] words) {
    List<Integer> ans = new ArrayList<>();
    String t = "";
    for (int p = 0; p < words.length; p++) {
      t = t + words[p];
    }
    if (t.length() > s.length()) {
      return ans;
    }
    HashMap<Character, Integer> map = new HashMap<>();
    int count = 0;
    int i = 0;

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
            if (t.length() == (j - i + 1)) {
              ans.add(j - t.length() + 1);
            } else {
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
            }
            i++;
          }
        }
      } else {
        i++;
      }
    }
    return ans;
  }
}
