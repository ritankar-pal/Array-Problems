package in.dsa.array;

public class Sort0s1sAnd2s {
	public void sortColors(int[] arr) {

        int low = 0; 
        int mid = 0; 
        int high = arr.length - 1; 

        while(mid <= high){
            if(arr[mid] == 0){
                //swap with low:: 
                int temp = arr[mid]; 
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++; 
                low++;
            }
            else if(arr[mid] == 1) mid++;
            else{
                //swap mid with high::
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }

    }
}
