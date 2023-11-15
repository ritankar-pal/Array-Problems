package in.dsa.array;
import java.util.ArrayList;
import java.util.List;

public class Merge2SortedArrays{
	
	public static List< Integer > sortedArray(int []a, int []b) {
        // Write your code here
       List<Integer> list = new ArrayList<>(); 
       int i = 0; 
       int j = 0; 
       int helper = Integer.MIN_VALUE;

       while(i < a.length && j < b.length){

        if(a[i] < b[j]){
            if(a[i] != helper){
                helper = a[i];
                list.add(a[i]);
            }
            i++;
        } 
        else if(b[j] < a[i]){
            if(b[j] != helper){
                helper = b[j];
                list.add(b[j]);
            }
            j++;
        }
        else{
            if(a[i] != helper){
                helper = a[i];
                list.add(a[i]);
            }
            i++; 
            j++;
        }

       }
       
       	//left over a::
        while(i < a.length){
            if(a[i] != helper){
                helper = a[i];
                list.add(a[i]);
            }
            i++;
        }

        //left over b::
        while(j < b.length){
            if(b[j] != helper){
                helper = b[j];
                list.add(b[j]);
            }
            j++;
        }

        return list;

    }

}
