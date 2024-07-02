/* import java.util.Scanner;

class Fibonacci_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        int first_no = 0;
        int second_no = 1;

        System.out.print("Fibonacci Series: " + first_no + " " + second_no);

        for (int i = 2; i < n; i++) {
            int next = first_no + second_no;
            System.out.print(" " + next);
            first_no = second_no;
            second_no = next;
        }
    }
} */
// Using While Loop
import java.lang.*;
import java.util.*;

public class Fibonacci_Number {
    public static void main(String[] args) {
        // 0 , 1, 1, 2, 3, 5, 8.....
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        int first_no = 0;
        int second_no = 1;
        System.out.print("Fibonacci Sequence: " + first_no + " " + second_no);
        
        int i = 2;
        while(num>i){
            int next_num = first_no + second_no;
            first_no = second_no;
            second_no = next_num;
            
            System.out.print(" " + next_num);
            i++;
        }
        
    }
}
