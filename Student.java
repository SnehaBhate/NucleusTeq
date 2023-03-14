
/*package student;

public class Student {
    private int roll_no;
    private String name;
    String course;
    int marks1, marks2, marks3;

    public void calculateTotal() {
    }

    public void calculateAverage() {
    }

    public void calculateGrade() {
    }

    // getter method for name
    public String getName() {
        return name;
    }

    // setter method for name
    public void setName(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

}*/

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

public class Student {
    private int roll_no, marks1, marks2, marks3;
    private String name, course;
    int total, avg;
    String grade;

    public void setter(int roll_no, int marks1, int marks2, int marks3, String name, String course) {
        this.roll_no = roll_no;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        this.name = name;
        this.course = course;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public int getMarks1() {
        return marks1;
    }

    public int getMarks2() {
        return marks2;
    }

    public int getMarks3() {
        return marks3;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public void CalculateTotal() {
        total = marks1 + marks2 + marks3;
    }

    public void CalculateAverage() {
        avg = total / 3;
    }

    public void CalculateGrade() {
        if (avg >= 80 && avg <= 100) {
            grade = "A";
        }
        if (avg >= 70 && avg < 80) {
            grade = "B";
        } else if (avg >= 60 && avg < 70) {
            grade = "C";
        } else if (avg >= 50 && avg < 60) {
            grade = "D";
        }
    }

    public String toString() {
        return "name=" + name + " course=" + course + " avg=" + avg + " total=" + total + " grade=" + grade;
    }

}
