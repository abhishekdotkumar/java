public class Permutation {
    public static void main(String[] args) {
        String str = "abc";
        permutation(str, "");

    }

    public static void permutation(String ip, String op) {

        if (ip.length() == 0) {
            System.out.println(op);
            return;
        }

        for (int i = 0; i < ip.length(); i++) {
            char ch = ip.charAt(i);
            String first = ip.substring(0, i);
            String last = ip.substring(i + 1, ip.length());
            permutation(first + last, op + ch);
        }

    }

}
