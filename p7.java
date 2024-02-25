public class p7 {
    private double height;
    private double width;

    public p7(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double calculateArea() {
        return height * width;
    }

    public static void main(String[] args) {
        p7 myRectangle = new p7(5.0, 10.0);

        System.out.println("Height of the rectangle: " + myRectangle.height);
        System.out.println("Width of the rectangle: " + myRectangle.width);
        System.out.println("Area of the rectangle: " + myRectangle.calculateArea());
    }
}
