package in.dsa.array;

import java.util.ArrayList;

public class RotateArrayByKPlace {
	
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        int n = arr.size();
        ArrayList<Integer> list = new ArrayList<>(arr);

        k = k % arr.size();

        for(int i = 0; i < n; i++){
            list.set((n+i-k)%n, arr.get(i));
        }

        return list; 
    }
}