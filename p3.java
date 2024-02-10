import java.util.Scanner;

public class p3 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to reverse: ");
        int number = sc.nextInt();

        int revnum = 0;

        while (number != 0) {
            int digit = number % 10;
            revnum = revnum * 10 + digit;
            number /= 10;
        }

        System.out.println("Reversed number: " + revnum);
    }
}
