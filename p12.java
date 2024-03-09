class Calculate {
    int a;
    int b;
    String message;

    // Empty Constuctor
    public Calculate() {
        int a = 12;
        int b = 34;
        System.out.println("A + B = " + (a + b));
    }

    // Two Perameter Constructor
    public Calculate(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("A + B = " + (a + b));
    }

    // Three Perameter with String Constructor
    public Calculate(int a, int b, String message){
        this.a = a;
        this.b = b;
        this.message = message;
        System.out.println("A + B = "+ (a+b));
        System.out.print(message);
    }
}

public class p12 {
    public static void main(String[] args){
        Calculate obj1 = new Calculate();
        Calculate obj2 = new Calculate(4, 2);
        Calculate obj3 = new Calculate(4, 6, "This is Sum of A and B");
    }
}
