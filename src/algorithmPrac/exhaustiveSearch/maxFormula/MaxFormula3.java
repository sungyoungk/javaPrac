package algorithmPrac.exhaustiveSearch.maxFormula;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/***
 * @수식_최대화 level2 p.202
 * @URL: https://school.programmers.co.kr/learn/courses/30/lessons/67257
 */
public class MaxFormula3 {



    private static final String[][] precedences = {
            "+-*".split(""),
            "+*-".split(""),
            "-*+".split(""),
            "-+*".split(""),
            "*+-".split(""),
            "*-+".split(""),
    };

    private long calculate(String op, long rhs, long lhs) {
        switch (op) {
            case "+" : return rhs + lhs;
            case "-" : return rhs - lhs;
            case "*" : return rhs * lhs;
            default : return 0;
        }
    }

    private long calculate(String[] precedence, List<String> tokens) {
        for (String op : precedence) {
            for ( int i = 0; i < tokens.size(); i++) {
                if (op.equals(tokens.get(i))) {
                    long rhs = Long.parseLong(tokens.get(i - 1));
                    long lhs = Long.parseLong(tokens.get(i + 1));
                    long value = calculate(op, rhs, lhs);
                    tokens.remove(i - 1);
                    tokens.remove(i - 1);
                    tokens.remove(i - 1);
                    tokens.add(i-1, String.valueOf(value));
                    i -= 2;
                }
            }
        }
        return Long.parseLong(tokens.get(0));
    }

    public long solution(String expression) {
        StringTokenizer tokenizer = new StringTokenizer(expression, "+-*", true);
        List<String> tokens = new ArrayList<>();

        while (tokenizer.hasMoreTokens()) {
            tokens.add(tokenizer.nextToken());
        }

        long max = 0;
        for (String[] precedence : precedences) {
                long value = Math.abs(calculate(precedence, new ArrayList<>(tokens)));
                if (value > max) {
                    max = value;
                }
        }
        return max;
    }
}
