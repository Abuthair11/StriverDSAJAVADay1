package EasyArrayProblem;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author abuthair on 17/08/23.
 * 4:37 pm
 * @project Day1
 */
public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int target  = sc.nextInt();
       int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans =findLinearS(arr,target);
        System.out.println(ans);
    }
    public static int findLinearS(int arr[],int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
