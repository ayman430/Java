import java.util.Scanner;

public class shapesTask {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        triangleArea();



    }

    static void circleArea() {
        System.out.println("Enter circle radius : ");
        double r = sc.nextDouble();
        System.out.println("Circle Area  = " + (r * r * Math.PI));
    }
    static void triangleArea() {
        System.out.println("Enter triangle base :  ");
        double base = sc.nextDouble();
        System.out.println("Enter triangle height :  ");
        double height = sc.nextDouble();
        System.out.println(" Triangle Area = " + (base/2 * height));
    }

    static void circlePerimeter() {
        System.out.println("Enter circle radius : ");
        double r = sc.nextDouble();
        System.out.println("Circle Perimeter  = " + (2 * r * Math.PI));
    }


    static void trianglePerimeter() {
        System.out.println("Enter side 1: ");
        double s1 = sc.nextDouble();
        System.out.println("Enter side 2: ");
        double s2 = sc.nextDouble();
        System.out.println("Enter side 3: ");
        double s3 = sc.nextDouble();
        System.out.println("Triangle Perimeter = " + (s1 + s2 + s3));
    }



}
