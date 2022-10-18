import java.util.Scanner;

public class Assignment1B {
    public static void main(String[] args){


    double lab;
    double assignment;
    double mid;
    double finalEx;
    double lab2;
    double assignment2;
    double mid2;
    double finalEx2;
    double grade;

    Scanner myObj = new Scanner(System.in);
    System.out.print("Enter your average lab grade: ");
    lab = myObj.nextDouble();

    System.out.print("Enter your average assignment grade: ");
    assignment = myObj.nextDouble();


    System.out.print("Enter your midterm exam grade: ");
    mid = myObj.nextDouble();

    System.out.print("Enter your midterm exam grade: ");
    finalEx = myObj.nextDouble();

    lab2 = (lab /10);
    assignment2 = (assignment * 0.40);
    mid2 = (mid * 0.20);
    finalEx2 = (finalEx * 0.30);

    grade = lab2 + assignment2 + mid2 + finalEx2;

        double roundedLab = Math.round(lab2 *10)/10;
        double roundedAssignment = Math.round(assignment2 *1000)/1000.0;
        double roundedMid = Math.round(mid2 *1000)/1000.0;
        double roundedfinalEx = Math.round(finalEx2 *1000)/1000.0;
        double roundedGrade = Math.round(grade *1000)/1000.0;
    System.out.println("Your weighted lab average is " + lab2 + "." + "\n" + "Your weighted assignment average is " + roundedAssignment + "."  + "\n" + "Your weighted midterm exam average is " + roundedMid + "." + "\n" + "Your weighted final exam average is " + roundedfinalEx + "."  + "\n" + "Adding numbers..." + "\n" + "Your final grade in CSE 1321L is " + roundedGrade + ".");
    }
}
