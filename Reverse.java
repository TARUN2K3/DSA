import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();

        int Reverse = 0;
        while (num>0) {
            int last_digit = num%10;
            num = num /10;
            Reverse = Reverse*10+last_digit;
        }
        System.out.println("Reverse No. : "+Reverse);
    }
}
