public class Fibbonaci_no_With_Recursion {
    public static void main(String[] args) {
       int ans =  Fibonacci_no(6);
       System.out.println(ans);
    }
    static int Fibonacci_no(int n){
        if(n==0){
            return n;
        }
        else if(n==1){
            return n;
        }else{
            return Fibonacci_no(n-1)+Fibonacci_no(n-2);
        }
    }
}
