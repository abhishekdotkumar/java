import java.util.HashMap;

public class Anagram {

  public static void main(String[] args) {
    String input = "foxfoxfox";
    String pattern = "fox";
    int k = pattern.length();
    HashMap<Character, Integer> map = new HashMap<>();
    int count = 0;
    int i = 0;
    int ans = 0;

    for (int j = 0; j < pattern.length(); j++) {
      if (!map.containsKey(pattern.charAt(j))) {
        map.put(pattern.charAt(j), 1);
      } else {
        map.replace(pattern.charAt(j), map.get(pattern.charAt(j)) + 1);
      }
    }
    count = map.size();
    for (int j = 0; j < input.length(); j++) {
      if (j >= k) {
        i++;
        if (map.containsKey(input.charAt(i - 1))) {
          if (map.get(input.charAt(i - 1)) == 0) {
            count++;
          }
          map.replace(input.charAt(i - 1), map.get(input.charAt(i - 1)) + 1);
        }
      }
      if (map.containsKey(input.charAt(j)) && map.get(input.charAt(j)) > 0) {
        map.replace(input.charAt(j), map.get(input.charAt(j)) - 1);
        if (map.get(input.charAt(j)) == 0) {
          count--;
          if (count == 0) {
            ans++;
          }
        }
      }
    }
    System.out.println(ans);
  }
}
