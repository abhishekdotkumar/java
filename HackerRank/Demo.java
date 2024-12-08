package HackerRank;

public class Demo {
    public static void main(String[] args) {
        int n = 9;

        System.out.println(Long.toBinaryString(~n & 0xFFFFFFFFL));
    }
}