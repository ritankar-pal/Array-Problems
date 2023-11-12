package in.dsa.array;

public class CheckIfArrayIsSorted {
    public static int isSorted(int n, int []arr) {
        // Write your code here:
    	
    	if(n == 1) return 1;
    	
        for(int i = 0; i < n-1; i++){
            if(arr[i+1] < arr[i]) return 0;
        }

        return 1; 
    }
}