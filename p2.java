class p2 {
    public static void main(String[] args) {
        int a = 121;
        int b = 36;
        int c = 64;

        if (a > b && a > c) {
            System.out.println("A is Maximum");
        } else if (b > a && b > c) {
            System.out.println("B is Maximum");
        } else {
            System.out.println("C is Maximum");
        }
    }
}
