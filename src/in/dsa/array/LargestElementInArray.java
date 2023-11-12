package in.dsa.array;

public class LargestElementInArray {

	public static int largestElement(int[] arr, int n) {
        // Write your code here.
        int elem = arr[0]; 

        for(int i = 1; i < n; i++){
            if(arr[i] > elem) elem = arr[i];
        }

        return elem;
    }

}
