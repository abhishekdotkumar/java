import java.util.ArrayList;
import java.util.List;

public class SubsetOfNumbers {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3 };
    List<List<Integer>> outer = new ArrayList<>();
    outer.add(new ArrayList<>());
    System.out.println(outer.size());
    for (int i = 0; i < arr.length; i++) {
      int n = outer.size();
      for (int j = 0; j < n; j++) {
        List<Integer> innerList = new ArrayList<Integer>();

      }
    }
  }
}
