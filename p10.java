public class p10 {

    public static final double PI = 3.141592653589793;
    private final String name;

    public final void finalMethod() {
        System.out.println("This is a final method.");
    }

    public p10(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        System.out.println("Value of PI: " + p10.PI);

        p10 example = new p10("John");

        System.out.println("Name: " + example.getName());

        example.finalMethod();
    }
}
