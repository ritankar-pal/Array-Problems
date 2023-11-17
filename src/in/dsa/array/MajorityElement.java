package in.dsa.array;


//Majority ELement is one that appears in the Array > n/2 times where n == length of the array::
public class MajorityElement {
	
	public static int majorityElement(int []arr) {
        // Write your code here
        int elem = arr[0]; 
        int count = 0; 

        for(int i = 0; i < arr.length; i++){
            if(count == 0){
                count++; 
                elem = arr[i];
            }
            else if(arr[i] == elem){
                count++; 
            }
            else{
                count--;
            }
        }

        return elem;

    }
}
