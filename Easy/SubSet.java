package Easy;

public class SubSet {
    public static void main(String args[]) {

        String str = "abc";
        getSubset("", str);
    }

    public static void getSubset(String p, String up) {

        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        getSubset(p + up.charAt(0), up.substring(1));
        getSubset(p, up.substring(1));

    }
}
