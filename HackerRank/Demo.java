package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        System.out.println(birthday(new ArrayList<Integer>(Arrays.asList(1, 2, 1, 3, 2)), 3, 2));
    }

    public static int birthday(List<Integer> s, int d, int m) {
        int count = 0;

        for (int i = m - 1; i < s.size(); i++) {
            int j = i - m + 1;
            int sum = 0;

            while (j <= i) {
                sum += s.get(j);
                j++;
            }

            if (sum == d) {
                count += 1;
            }

        }

        return count;

    }
}