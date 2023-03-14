
package student;

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

}
