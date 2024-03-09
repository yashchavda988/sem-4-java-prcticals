public class p13 {
    public static void main(String[] args) {
        String str1 = "Hello World!";


        System.out.println("Use CharAt Function :- " + str1.charAt(2));

        System.out.println("Using contins Function :- " + str1.contains("Hell"));
        System.out.println("Using contins Function :- " + str1.contains("Heli"));

        String str2 = String.format("My answer is %.8f", 47.65734);
        String str3 = String.format("My answer is %15.8f", 47.65734);
        System.out.println(str2 + "\n" + str3);

        System.out.println("Using Length Functoin :- " + str1.length());

        String[] split = str1.split(" ");
        for (String num : split) {
            System.out.println(num);            
        } 
    }
}
