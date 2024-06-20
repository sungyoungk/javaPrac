package javaPrac.stream;

import java.util.ArrayList;
import java.util.List;

public class StudentForEachExample {
    public static void main(String[] args) {
        StudentForEachExample sample = new StudentForEachExample();
        List<StudentDTO> studentList = new ArrayList<>();
        studentList.add(new StudentDTO("요다", 43, 99, 10));
        studentList.add(new StudentDTO("만두", 71, 85, 85));
        studentList.add(new StudentDTO("찐빵", 32, 81, 75));
        sample.printStudentName(studentList);
    }


    public void printStudentName(List<StudentDTO> students) {
       students.stream().forEach(student -> System.out.println(student.getName()));
       students.stream().forEach(student -> System.out.println(student.getName()));
    }
}
