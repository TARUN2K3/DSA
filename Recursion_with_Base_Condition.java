public class Recursion_with_Base_Condition {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        if(n==5){
            System.out.println(n);
            return;
        }else{
            System.out.println(n);
            print(n+1);
        }
    }
}
