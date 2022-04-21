package Chapter10.E12CourseGrades;

import java.util.Random;

public class CourseGrades {
    public static void main(String[] args){
        int[][] grades = new int [12][5];
        
        Random r = new Random();
        for(int row=0; row < grades.length; row++) {
            for(int col=0; col < grades[row].length; col++) {
                grades[row][col] = r.nextInt(25) + 75;
                // System.out.println(grades[row][col]);
            }
        }
        
        GradeBook qwe = new GradeBook(grades);
        int[] studentGrades = qwe.getGrades(1);
        System.out.println("Grades for Student 1");
        for(int i=0; i< studentGrades.length; i++) {
            System.out.print(studentGrades[i]+ " ");
        }
        System.out.println();

        qwe.showGrades();
        System.out.format("\nAverage score for student %s: %s",1,qwe.studentAvg(1));
        System.out.format("\nAverage score for test # %s: %s",1,qwe.testAvg(1));
                
    }
    
}
