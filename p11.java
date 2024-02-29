import java.util.Scanner;

class Shape {
    public float area(float radius) {
        return (float) (Math.PI * radius * radius);
    }

    public float area(float length, float width) {
        return length * width;
    }
}

public class p11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Shape shape = new Shape();

        System.out.print("Enter the radius of the circle: ");
        float cr = sc.nextFloat();
        System.out.print("Enter the length of the rectangle: ");
        float rl = sc.nextFloat();
        System.out.print("Enter the width of the rectangle: ");
        float rw = sc.nextFloat();

        float ca = shape.area(cr);

        System.out.println("Area of the circle: " + ca);

        float ra = shape.area(rl, rw);

        System.out.println("Area of the rectangle: " + ra);
    }
}
