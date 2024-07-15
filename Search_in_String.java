public class Search_in_String {
    public static void main(String[] args) {
        String name = "Tarun";
        char c = 'T';
        boolean ans = search(name, c);
        System.out.println(ans);
    }
    static boolean search(String str, char a){
        if(str.length()==0){
            return false;
        }else{
            for(int i = 0; str.length()>i;i++){
                if(a==str.charAt(i)){
                    return true;
                }
            }
            return false;
        }
    }
}
