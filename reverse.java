Given an array/list 'ARR' of integers and a position ‘M’. You have to reverse the array after that position.



import java.util.ArrayList;

public class Solution 
{
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        int i=m+1,j=arr.size()-1,temp;
        while(i<j){
            if(i<j){
            temp=arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
            }
        }
    }
}
