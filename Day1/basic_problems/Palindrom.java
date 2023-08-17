/**
 * @author abuthair on 17/08/23.
 * 1:58 pm
 * @project Day1
 */
public class Palindrom {
    public static void main(String[] args) {
        int n= 121;
        System.out.println(checkPalindrom(n));
    }
    public static  String checkPalindrom(int n){
        int rev= 0;
        int y = n;
        while(y != 0){
            int dig = y % 10;
            rev = rev*10+dig;
            y=y/10;
        }
        if(n == rev){
            return "its palindrom";
        }
        else{
            return "its  not palindrom";
        }
    }
}
