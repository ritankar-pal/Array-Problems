package in.dsa.array;
import java.util.Arrays;


public class TwoSumBoolean {
	
	public static String read(int n, int []arr, int target){
        // Write your code here.

        //sorting the array:: 
        Arrays.sort(arr);

        int start = 0; 
        int end = n-1;

        while(start < end){

            if(arr[start] + arr[end] < target) start++; 
            else if(arr[start] + arr[end] > target) end--; 
            else return "YES";
        }

        return "NO";
    }
	
}
