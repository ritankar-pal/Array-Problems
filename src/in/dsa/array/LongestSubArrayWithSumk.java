package in.dsa.array;


//Only +ve and 0 elements in Array::
public class LongestSubArrayWithSumk {
	 public static int longestSubarrayWithSumK(int []arr, long k) {
	        // Write your code here
	        int left = 0, right = 0; 
	        long sum = arr[0]; 
	        int maxLength = 0; 

	        while(right < arr.length){

	            while(left <= right && sum > k){
	                sum = sum-arr[left]; 
	                left++;
	            }

	            if(sum == k) maxLength = Math.max(maxLength, right-left+1);

	            right++; 
	            if(right < arr.length) sum = sum + arr[right];
	        }

	        return maxLength;


	    }
}
