package algorithmPrac.sort.sortPrac.menuRenewal;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @메뉴_리뉴얼_level_2
 * @URL: https://school.programmers.co.kr/learn/courses/30/lessons/72411
 */
public class Solution1 {

    private static class Course{
        public final String course;
        public final int occurence;

        public Course(String course, int occurence) {
            this.course = course;
            this.occurence = occurence;
        }
    }

    private void getCourses(char nextMenu, Set<String>selectedMenus,
                            List<Set<String>> orderList,
                            Map<Integer, List<Course>>courses) {
        //
        int occurences = (int) orderList.stream()
                .filter(order -> order.containsAll(selectedMenus))
                .count();
        //
        if(occurences < 2) return;
        //
        int size = selectedMenus.size();
        //
        if(courses.containsKey(size)) {
            List<Course> courseList = courses.get(size);
            Course course = new Course(selectedMenus.stream()
                                .sorted()
                                .collect(Collectors.joining("")), occurences);

        Course original = courseList.get(0);

        if(original.occurence  < occurences) {
            courseList.clear();
            courseList.add(course);
        } else if (original.occurence == occurences) courseList.add(course);
        }

        if(size >= 10) return;

        for ( char menuChar = nextMenu; menuChar <= 'Z'; menuChar++) {
            String menu = String.valueOf(menuChar);
            selectedMenus.add(menu);

            getCourses((char)(menuChar + 1), selectedMenus, orderList, courses);
            selectedMenus.remove(menu);
        }
    }

    public String[] solution(String[] orders, int[] course) {

        List<Set<String>> orderList = Arrays.stream(orders)
                .map(String::chars)
                .map(c -> c.mapToObj(menu -> String.valueOf((char)menu)).collect(Collectors.toSet()))
                .collect(Collectors.toList());

        Map<Integer, List<Course>> courses = new HashMap<>();
        for ( int length : course) {
            List<Course> list = new ArrayList<>();
            list.add(new Course("", 0));
            courses.put(length, list);
        }

        getCourses('A', new HashSet<>(), orderList, courses);

        return courses.values().stream()
                .filter(list -> list.get(0).occurence > 0 )
                .flatMap(List::stream)
                .map(c -> c.course)
                .sorted()
                .toArray(String[]::new);
}

}
/**
 * @orders ["ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"]
 * @course [2, 3, 4]
 * @result ["AC", "ACDE", "BCFG", "CDE"]
 */