package Interview_Questions.Array_Based;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findDuplicates {
       public static List <Integer> findDuplicates (int[] nums){
        List<Integer> res = new ArrayList<>();
        for (int n: nums){
            if(nums[Math.abs(n) - 1] < 0){
                res.add(Math.abs(n));
            }else{
                nums[Math.abs(n) - 1] = -nums[Math.abs(n) - 1];
            }
        }
        return res;
       }
    
    public static void main(String[] args) {
        int[] arr = { 3, 1, 3, 4, 2, 2, 5 };
        System.out.println("Duplicate elements: " + findDuplicates(arr)); 
    }
}