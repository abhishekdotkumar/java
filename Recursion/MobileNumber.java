import java.util.ArrayList;
import java.util.List;

public class MobileNumber {
    public static void main(String[] args) {
        String[] arr = { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        String input = "23";
        List<String> list = new ArrayList<>();
        List<String> output = combination(list, arr, input, "");
        for (int i = 0; i < output.size(); i++) {
            System.out.println(output.get(i));
        }

    }

    public static List<String> combination(List<String> list, String[] arr, String ip, String op) {

        if (ip.length() == 0) {
            list.add(op);
            return list;
        }

        int num = Integer.parseInt(ip.substring(0, 1));

        String values = arr[num - 2];

        for (int i = 0; i < values.length(); i++) {
            char ch = values.charAt(i);
            combination(list, arr, ip.substring(1), op + ch);
        }
        return list;
    }

}
