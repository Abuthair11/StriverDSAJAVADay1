package basic_problems;

import java.util.Scanner;

/**
 * @author abuthair on 17/08/23.
 * 3:14 pm
 * @project Day1
 */
public class armStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(findArmStrong(a) == true){
            System.out.println("Its armStrongNumber");
        }
        else{
            System.out.println("Its not armStrongNumber");
        }
    }
    public static boolean findArmStrong(int n){
        int orginalNum= n;
        int temp = n;
        int count=0;
        while(temp !=0){
            count++;
            temp/=10;
        }
//        String n2= Integer.toString(n);
//        int count =n2.length();
        int totalSum=0;
        while(n!= 0){
            int digit = n % 10;
            totalSum= (int) (totalSum+Math.pow(digit,count));
            n=n/10;
        }
        return (orginalNum ==totalSum);
    }
}
