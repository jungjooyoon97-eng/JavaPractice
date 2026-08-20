package exam;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("가나디", 88));
        students.add(new Student("헐랭이", 77));
        students.add(new Student("쫄랑이", 95));

        int totalScore = 0;
        int totalStudents = 0;
        for (int i = 0; i < students.size(); i++){
            System.out.println(students.get(i));
            totalScore += students.get(i).getScore();
            totalStudents++;
        }

        int average = totalScore/totalStudents;
        
        System.out.println("평균 점수: " + average);
    }
}
