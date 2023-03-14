
/*Write a class Student having following properties and methods:
Property: rollNumber, name, course, marks1, marks2, marks3
Methods: calculateTotal(), calculateAverage(), calculateGrade()
Create getter and setter methods.
Create class StudentTest with main method for calling Student class.
StudentTest should contain atleast 5 student objects with different grades.
Implement toString method to display details of each student.
Also display grades of each student.
Store the student file in a package student;
import student.Student;

public class StudentTest {

    public static void main(String args[]) {

    }

}*/

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import student.*;

public class StudentTest {
    public static void main(String[] args) {

        Student S1 = new Student();
        S1.setter(101, 70, 68, 75, "Sneha", "MCA");
        S1.CalculateTotal();
        S1.CalculateAverage();
        S1.CalculateGrade();

        System.out.println(S1);

        S1.setter(102, 80, 77, 67, "Aayushi", "MCA");
        S1.CalculateTotal();
        S1.CalculateAverage();
        S1.CalculateGrade();

        System.out.println(S1);

        S1.setter(103, 80, 86, 87, "Khushi", "MBA");
        S1.CalculateTotal();
        S1.CalculateAverage();
        S1.CalculateGrade();

        System.out.println(S1);

        S1.setter(104, 70, 76, 87, "Kanika", "MCA");
        S1.CalculateTotal();
        S1.CalculateAverage();
        S1.CalculateGrade();

        System.out.println(S1);
    }
}
