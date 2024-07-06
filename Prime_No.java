import java.util.Scanner;

public class Prime_No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        if (n == 1 ) {
            System.out.println("Number is invalid");
        }else if (n == 2) {
            System.out.println("Number is Prime");
        }else{
                int c = 2;
                while(n>c){
                    int prime = n%c;
                    if(prime==0){
                         System.out.println("Number is Not Prime ");
                         return;
                    }
                    c++;
                }
                System.out.println("Number is Prime");
        }
    }
}
