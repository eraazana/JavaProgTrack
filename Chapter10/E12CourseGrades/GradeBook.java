package Chapter10.E12CourseGrades;

import java.util.Random;

public class GradeBook {
    int[][] grades = new int [12][5];

    public GradeBook(int [][] grades) {
        this.grades = grades;
    }

    public int[] getGrades(int studentIndex){
        if(studentIndex==0)
            throw new IllegalArgumentException("Please input only 1 to 12...");
        return this.grades[studentIndex-1];
    }
    public void showGrades() {
        for(int i=0; i<grades.length; i++) {
            System.out.println("\n"+"Student #:"+(i+1));

            for(int j=0; j<grades[i].length; j++) {
                System.out.print(grades[i][j] + " ");
            }
        }
    }
    public double studentAvg(int studentIndex) {
        if(studentIndex<=0 || studentIndex > grades.length)
            throw new IllegalArgumentException("Please input only 1 to 12...");
        
        int sum=0;
        for(int i=0; i< this.grades[studentIndex-1].length; i++) {
            sum+=this.grades[studentIndex-1][i];
        }

        return sum / this.grades[studentIndex-1].length;
    }
    public double testAvg(int studentIndex){
        
        if(studentIndex<=0 || studentIndex > grades[studentIndex].length)
            throw new IllegalArgumentException("Please input only 1 to 5...");
        
        int sum=0;
        for(int i=0; i< this.grades.length; i++) {
            sum+=this.grades[i][studentIndex-1];
        }

        return sum / this.grades.length;
    }

    // Create a CourseGrades application that simulates a grade book for a class with 12 students that each have
    // 5 test scores. The CourseGrades application should use a GradeBook class that has member variables
    // grades, which is a two-dimensional array or integers, and methods 
    // getGrades() for prompting the user for the test grades for each student, 
    // showGrades() that displays the grades for the class,
    // studentAvg() that has a student number parameter and then returns the average grade for that student, and 
    // testAvg() that has a test number parameter and then returns the average grade for that test.

}