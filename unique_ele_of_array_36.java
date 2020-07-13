package set2;
import java.awt.List;
import java.util.ArrayList;
public class unique_ele_of_array_36 
{public static void main(String[] args) {
        int[] arr1 = new int[] { 10,5,20,15,25,30};
        int[] arr2 = new int[] {50,12,5,30,15,70};
        boolean contains = false;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    contains = true;
                    break;
                }    
            }
            if(!contains){
                list.add(arr1[i]);
            }
            else{
                contains = false;
            }
        }
   //2nd comp;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[j] == arr2[i]) {
                    contains = true;
                    break;
                }    
            }
            if(!contains){
                list.add(arr2[i]);
                }
            else{
                contains = false;
            }
        }
       
        for(int i1:list)
        {
        	System.out.print(i1 + " ");
        }
}
}
