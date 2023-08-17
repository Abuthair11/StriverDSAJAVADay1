package EasyArrayProblem;

import java.util.Scanner;

/**
 * @author abuthair on 17/08/23.
 * 4:13 pm
 * @project Day1
 */
public class largestElementinArray {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int arr[] = new int[5];
    for(int i = 0 ; i < arr.length;i++){
         arr[i] = sc.nextInt();
    }
    int ans = findLargestNumber(arr);
    System.out.println(ans);

    }
    public static int findLargestNumber(int arr[]  ){
        int max = arr[0];
     for(int i = 0 ; i < arr.length;i++){
         if(max < arr[i]){
             max= arr[i];
         }

     }
        return max;
    }
}
