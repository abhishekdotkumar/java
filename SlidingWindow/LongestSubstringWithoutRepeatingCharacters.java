import java.util.Arrays;
import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {

  public static void main(String[] args) {
    String str = "pwwkew";
    int max = 0;
    int i = 0;
    int[] ans = new int[2];
    HashMap<Character, Integer> map = new HashMap<>();
    for (int j = 0; j < str.length(); j++) {
      if (map.containsKey(str.charAt(j)) && map.get(str.charAt(j)) > 0) {
        map.replace(
          str.charAt(j),
          map.get(str.charAt(j)),
          map.get(str.charAt(j)) + 1
        );
      } else {
        map.put(str.charAt(j), 1);
      }
      if (map.size() < (j - i + 1)) {
        while (map.size() < (j - i + 1)) {
          if (map.containsKey(str.charAt(i)) && map.get(str.charAt(i)) == 1) {
            map.remove(str.charAt(i));
          } else {
            map.replace(
              str.charAt(i),
              map.get(str.charAt(i)),
              map.get(str.charAt(i)) - 1
            );
          }
          i++;
        }
      }

      if (map.size() == (j - i + 1)) {
        if (max < (j - i + 1)) {
          max = j - i + 1;
          ans[0] = i;
          ans[1] = j;
        }
      }
    }
    System.out.println(Arrays.toString(ans));
  }
}
