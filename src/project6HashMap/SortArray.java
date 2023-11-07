package project6HashMap;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {

        int[] nums = {3,6,9,12,5,8};

        for(int i = 0; i < nums.length; i++){
            int temp;
            for(int k=i+1; k < nums.length; k++){
                if(nums[i]>nums[k]){
                    temp = nums[i];
                    nums[i] = nums[k];
                    nums[k] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums)); //[3, 5, 6, 8, 9, 12]
    }
}
