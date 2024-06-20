package javaPrac.stream;

import java.util.ArrayList;
import java.util.List;

public class StudentFilterSample {
    public static void main(String[] args) {
        StudentFilterSample sample = new StudentFilterSample();

        List<StudentDTO> students = new ArrayList<>();
        students. add(new StudentDTO("요다",43, 20, 40));
        students. add(new StudentDTO("건빵",50, 80, 75));
        students. add(new StudentDTO("만두",23, 60, 100));

        sample.filterWithScore(students, 75);
    }

    private void filterWithScore(List<StudentDTO> students, int scoreCut) {
        students.stream()
                .filter(student -> student.getScoreEnglish() > scoreCut)
                .map(student -> student.getName())
                .forEach(System.out::println);
    }


}
