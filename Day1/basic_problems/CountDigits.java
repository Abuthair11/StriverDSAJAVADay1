/**
 * @project Day1
 * @author abuthair on 17/08/23.
 *11:51 am
 */public class CountDigits {
    public static void main(String[] args) {
        int n = 12345;
        int ans = digits(n);
        System.out.println(ans);
        System.out.println(FindDigits(n));
    }
    // Approch 1TC  O(N) S(1)
    public  static  int digits(int n){
        int count =0 ;
        int x = n ;
        while(x != 0){
            x= x/10;
            count++;
        }

        return count;
    }

    // Approch 2 TC 0(1) S(1)

    public static int FindDigits(int n){
        String n2 = Integer.toString(n);
        return n2.length();
    }
}
