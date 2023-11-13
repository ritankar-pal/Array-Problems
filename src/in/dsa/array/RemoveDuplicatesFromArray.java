package in.dsa.array;
import java.util.ArrayList;


public class RemoveDuplicatesFromArray {
	
	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		// Write your code here.
		int count = 1;
		int elem = arr.get(0);

		for(int i = 1; i < n; i++){
			int temp = arr.get(i); 

			if(temp != elem){
				count++;
				elem = temp;
			}
		}

		return count;

	}
}
