package algorithmPrac.exhaustiveSearch.maxFormula;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/***
 * @수식_최대화 level2 p.202
 * @URL: https://school.programmers.co.kr/learn/courses/30/lessons/67257
 */
public class MaxFormula3 {

    static final String[][] precedences = {
            "*+-".split("")
            , "*-+".split("")
            , "+*-".split("")
            , "+-*".split("")
            , "-*+".split("")
            , "-+8".split("")
    };


    private long calculate(long lhs, long rhs, String op) {
        switch (op) {
            case "+" : return lhs + rhs;
            case "-" : return lhs - rhs;
            case "*" : return lhs * rhs;
            default : return 0;
        }
    }

    private long calculate(String[] precedence, List<String> tokens) {
        for (String op : precedence) {
            for (int i = 0; i <tokens.size(); i++) {
                if (tokens.get(i).equals(op)) {
                    long lhs = Long.parseLong(tokens.get(i-1));
                    long rhs = Long.parseLong(tokens.get(i+1));
                    long result = calculate(lhs, rhs, op);
                    tokens.remove(i-1);
                    tokens.remove(i-1);
                    tokens.remove(i-1);
                    tokens.add(i-1, String.valueOf(result));
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
