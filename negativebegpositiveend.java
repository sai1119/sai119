You are given an array 'ARR' consisting of 'N' integers. You need to rearrange the array elements such that all negative numbers appear before all positive numbers.
  
  
  import java.util.*;
public class Solution {
    public static ArrayList<Integer> separateNegativeAndPositive(ArrayList<Integer> nums) {
        int j=0;
        int temp;
        for(int i=0;i<nums.size();i++){
            if(nums.get(i)<0){
                if(i!=j){
                    temp=nums.get(i);
                    nums.set(i,nums.get(j));
                    nums.set(j,temp);
                }
                j++;
            }
        }
        return nums;
    }
}
