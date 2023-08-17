package EasyArrayProblem;

import java.util.Scanner;

/**
 * @author abuthair on 17/08/23.
 * 4:27 pm
 * @project Day1
 */
public class CheckIfTheArrayIsSortedOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        for (int i = 0 ; i <= arr.length-1;i++){
            arr[i] = sc.nextInt();
        }
        boolean ans  = SortedOrNot(arr);
        System.out.println(ans);
    }
    public static boolean SortedOrNot(int arr[]) {
        for(int i = 1 ; i < arr.length;i++){
            if(arr[i] > arr[i-1]){
                return true;
            }
        }
        return false;
    }
}
