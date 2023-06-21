import java.util.HashMap;

public class LongestSubstringWithKUniqueCharacters {

  public static void main(String[] args) {
    String str = "aabacbebebe";
    int max = 0;
    int i = 0;
    int k = 3;

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
      if (map.size() > 3) {
        while (map.size() > 3) {
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

      if (map.size() == k) {
        if (max < (j - i + 1)) {
          max = j - i + 1;
        }
      }
    }
    System.out.println(max);
  }
}
