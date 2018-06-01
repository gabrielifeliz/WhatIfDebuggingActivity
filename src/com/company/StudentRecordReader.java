package com.company;

/* StudentRecordReader.java
 * This program has some errors please fix it so that it runs properly.
 */

// Remove the extra lowercase s at the end of "Scanner" word
import java.util.Scanner;

public class StudentRecordReader {

    // In main method parameter, swap position of brackets to []
    public static void main(String[] args) {
        String fname, lname;
        // GPA is an average so change variable datatype from int to double
        double gpa;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Student's First Name? ");
        fname = keyboard.next();

        System.out.print("Student's Last Name? ");
        lname = keyboard.next();

        System.out.print("Student's GPA? ");
        gpa = keyboard.nextDouble();

        System.out.println();
        System.out.println("Student Name : " + fname + " " + lname);
        System.out.println("Student GPA : " + gpa);
        if (gpa >= 3) {
            System.out.println("This student is in good standing.");
        }
        /* To fix invalid condition for if-statement, change to a condition that returns
            a boolean value */
        else if (gpa >= 1) {
            System.out.println("This student is on academic probation.");
        } else {
            // To display on console, change "in" in System.in. to "out"
            System.out.println("This student has been expelled.");
        }

        keyboard.close();
    }
}
