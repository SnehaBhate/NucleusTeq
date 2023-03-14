
/*Create an abstract class Shape having no properties and two abstract method perimeter() and area().
Create two concrete class Circle and Rectangle which extends abstract class Shape and override the abstract method Perimeter() and area().
Display perimeter and area of circle and rectangle.*/

abstract class Shape {

    abstract void perimter();

    abstract void area();

}

class Circle extends Shape {

    void area() {
        System.out.println("area - ");
    }
}

class Rectangle extends Shape {

    void perimeter() {
        System.out.println("perimeter");
    }
}

public class AbClass {

    public static void main(String args[]) {

        Shape obj;

        System.out.println(obj.area());
        System.out.println(obj.perimter());

    }
}
