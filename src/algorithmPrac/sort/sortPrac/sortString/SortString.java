package algorithmPrac.sort.sortPrac.sortString;

import static java.util.stream.Collectors.joining;

/**
 * @문자열_내림차순으로_정렬하기 level1, p.251
 * @URL: https://school.programmers.co.kr/learn/courses/30/lessons/12917
 */
public class SortString {

    public String solution(String s) {
        return s.chars()
                .boxed()
                .sorted((c1, c2) -> c2 - c1)
                .collect(StringBuilder::new,  StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    public static void main(String[] args) {
        SortString sort = new SortString();
        System.out.println(sort.solution("Zbcdefg"));
    }

}
