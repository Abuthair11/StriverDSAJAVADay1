import java.util.Scanner;

/**
 * @author abuthair on 17/08/23.
 * 2:20 pm
 * @project Day1
 */
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = checkGcd(a,b);
        System.out.println(ans);
        int ans1 = alterGcd(a,b);
        System.out.println(ans1);
    }
    public static int checkGcd(int a ,int b){
        int ans= 1;
        for(int i = 1; i <=Math.min(a,b);i++){
            if(a % i == 0 && b % i ==0 ){
                ans = i;
            }

        }
        return ans;
    }
    public static int alterGcd(int a,int b){
        if(b == 0){
            return a;
        }
        return alterGcd(b,a%b);
    }
}
