package DynamicProgramming.MCM;

import java.util.HashMap;

public class EvaluateExpression {
    public static HashMap<String, Integer> hash = new HashMap<>();

    public static void main(String[] args) {

        String str = "T|T&F^T";
        hash.clear();
        System.out.println(solve(str, 0, str.length() - 1, true));
    }

    public static int solve(String str, int i, int j, boolean isTrue) {
        if (i > j) {
            return 0;
        }

        if (i == j) {
            if (isTrue) {
                if (str.charAt(i) == 'T')
                    return 1;
                else
                    return 0;
            } else {
                if (str.charAt(i) == 'F')
                    return 1;
                else
                    return 0;
            }
        }

        String tempStr = i + "_" + j + "_" + isTrue;

        if (hash.containsKey(tempStr)) {
            return hash.get(tempStr);
        }

        int ans = 0;
        for (int k = i + 1; k <= j - 1; k = k + 2) {

            int leftTrue = solve(str, i, k - 1, true);
            int leftFalse = solve(str, i, k - 1, false);
            int rightTrue = solve(str, k + 1, j, true);
            int rightFalse = solve(str, k + 1, j, false);

            if (str.charAt(k) == '&') {
                if (isTrue) {
                    ans = ans + (leftTrue * rightTrue);
                } else {
                    ans = ans + (leftTrue * rightFalse) + (rightTrue * leftFalse) + (leftFalse * rightFalse);
                }
            }

            if (str.charAt(k) == '|') {
                if (isTrue) {
                    ans = ans + (leftTrue * rightFalse) + (rightTrue * leftFalse) + (leftTrue * rightTrue);
                } else {
                    ans = ans + (rightFalse * leftFalse);
                }
            }
            if (str.charAt(k) == '^') {
                if (isTrue) {
                    ans = ans + (leftTrue * rightFalse) + (rightTrue * leftFalse);
                } else {
                    ans = ans + (rightFalse * leftFalse) + (leftTrue * rightTrue);
                }
            }
        }
        hash.put(tempStr, ans);
        return ans;
    }
}
