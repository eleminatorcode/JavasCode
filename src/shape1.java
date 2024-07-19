import java.util.Scanner;

final class Shape1 {
    Shape1() {
    }

    public static void main(String[] args) {
        System.out.println("Enter the dimension:");
        Scanner sc = new Scanner(System.in);
        double dimension = sc.nextDouble();
        Square a = new Square(dimension);
        a.perimeter();
        a.area();
        Circles b = new Circles(dimension);
        b.area();
        b.circumference();
    }

    static class Square extends Shape {
        double area;
        double perimeter;

        Square(double dimension) {
            super(dimension);
        }

        void area() {
            this.area = this.dimension * this.dimension;
            System.out.println("Area of the square is: " + this.area);
        }

        void perimeter() {
            this.perimeter = 4.0 * this.dimension;
            System.out.println("Perimeter of the square is: " + this.perimeter);
        }
    }

    static class Circles extends Shape {
        double area;
        double circumference;

        Circles(double dimension) {
            super(dimension);
        }

        void area() {
            this.area = Math.PI * this.dimension * this.dimension;
            System.out.println("Area of the circle is: " + this.area);
        }

        void circumference() {
            this.circumference = 2 * Math.PI * this.dimension;
            System.out.println("Circumference of the circle is: " + this.circumference);
        }
    }

    static class Shape {
        double dimension;

        Shape(double dimension) {
            this.dimension = dimension;
        }
    }
}
