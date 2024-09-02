public class Recursion {
    public static void main(String[] args) {
        print1(1);
    }

    static int print1(int n) {
        System.out.println(1);
        return print2(2);
    }

    static int print2(int n) {
        System.out.println(2);
        return print3(3);
    }

    static int print3(int n) {
        System.out.println(3);
        return print4(4);
    }

    static int print4(int n) {
        System.out.println(4);
        return print5(5);
    }

    static int print5(int n) {
        System.out.println(5);
        return n; 
    }
}
