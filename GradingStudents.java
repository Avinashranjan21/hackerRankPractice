import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudents {
    public static void main(String[] args) {
        System.out.println(gradingStudents(Arrays.asList(73, 67, 38, 33)));
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> newGrades = new ArrayList<>();
        for (int grade : grades) {
            int divideBy5 = grade / 5;
            int nextMultipleOf5 = (divideBy5 + 1) * 5;
            int diffWithNext5 = nextMultipleOf5 - grade;
            if (diffWithNext5 >= 3 || nextMultipleOf5 < 40) {
                newGrades.add(grade);
            } else {
                newGrades.add(nextMultipleOf5);
            }
        }
        return newGrades;
    }
}
