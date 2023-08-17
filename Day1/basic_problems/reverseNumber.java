import java.util.Arrays;

/**
 * @author abuthair on 17/08/23.
 * 12:06 pm
 * @project Day1
 */
public class reverseNumber {
    public static void main(String[] args) {
        int n= 12345;
        System.out.println(revNumber(n));
    }
    public  static int revNumber(int x){
       int rev= 0;
       while(x!=0){
           int dig = x % 10;
           rev=rev*10+dig;
           x=x/10;
       }
       return rev;
    }
}
