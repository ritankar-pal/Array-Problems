package in.dsa.array;

public class SecondLargestAndSecondSmallest {
	
    public static int[] getSecondOrderElements(int n, int []arr) {
        // Write your code here.
        int largest = arr[0]; 
        int secondLargest = Integer.MIN_VALUE; 

        int smallest = arr[0]; 
        int secondSmallest = Integer.MAX_VALUE;

        for(int i = 1; i < n; i++){

            //largest::
            if(arr[i] > largest){
               int temp = largest;
               largest = arr[i];
               secondLargest = temp; 
            }

            if(arr[i] < largest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }


            //smallest::
            if(arr[i] < smallest){
                int temp = smallest;
                smallest = arr[i];
                secondSmallest = temp;
            }

            if(arr[i] > smallest && arr[i] < secondSmallest){
                secondSmallest = arr[i];
            }

        }    

        return new int[]{secondLargest, secondSmallest};    

    }
}