class p7 {
    double height;
    double width;

    public p7(double h, double w) {
        height = h;
        width = w;
    }

    public double calculateArea() {
        return height * width;
    }

    public double calculatePerimeter() {
        return 2 * (height + width);
    }

    public static void main(String[] args) {
        p7 rect = new p7(5, 10);

        System.out.println("Rectangle Area: " + rect.calculateArea());
        System.out.println("Rectangle Perimeter: " + rect.calculatePerimeter());
    }
}
