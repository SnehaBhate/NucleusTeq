
/*Create an abstract class Shape having no properties and two abstract method perimeter() and area().
Create two concrete class Circle and Rectangle which extends abstract class Shape and override the abstract method Perimeter() and area().
Display perimeter and area of circle and rectangle.*/

abstract class Shape {

    abstract void perimeter();

    abstract void area();

}

class Circle extends Shape {

    void area() {
        System.out.println("area - ");
    }

    void perimeter() {
        System.out.println("perimeter circle");
    }

}

class Rectangle extends Shape {

    void perimeter() {
        System.out.println("perimeter");
    }

    void area() {
        System.out.println("area rectangle");
    }

}

public class AbClass {

    public static void main(String args[]) {

        Circle obj = new Circle();
        obj.area();
        obj.perimeter();

        Rectangle obj1 = new Rectangle();
        obj1.area();
        obj1.perimeter();

    }
}
