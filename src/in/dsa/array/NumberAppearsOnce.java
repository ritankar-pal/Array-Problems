package in.dsa.array;

public class NumberAppearsOnce {
	public static int getSingleElement(int []arr){
        // Write your code here.
        int elem = 0;
        for(int i = 0; i < arr.length; i++){
            elem = elem ^ arr[i];
        }
        return elem;
    }
}
