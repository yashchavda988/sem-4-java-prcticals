public class p9 {

    private static int staticVariable = 0;
    private int instanceVariable;

    public static void staticMethod() {
        System.out.println("This is a static method.");
        System.out.println("Static Variable: " + staticVariable);
    }

    public void instanceMethod() {
        System.out.println("This is an instance method.");
        System.out.println("Static Variable: " + staticVariable);
        System.out.println("Instance Variable: " + instanceVariable);
    }

    public static void main(String[] args) {
        p9.staticMethod();

        p9 instance1 = new p9();
        p9 instance2 = new p9();

        instance1.staticVariable = 10;

        instance1.instanceMethod();
        instance2.instanceMethod();
    }
}
