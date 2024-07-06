import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the NUmber : ");
        int n = sc.nextInt();
        int temp = n;
        int count = 0;
        while (temp>0) {
            temp = temp/10;
            count++;
        }
        System.out.println(count);

        int i = 0;
        int sum = 0;
        temp = n;
        while (temp>0) {
            int last_digit = temp%10;
            sum +=Math.pow(last_digit, count);
            temp = temp/10;
            i++;
        }
        System.out.println(sum);
        if (sum == n) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
    
}
