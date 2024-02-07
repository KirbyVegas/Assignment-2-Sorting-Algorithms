import java.util.Arrays;
import java.util.LinkedList;

public class KSorting {

    public int[] generateKSorted(int[] nums) {

        //sorting algorithm to generate an array of k sorted integers

        int k = 10;
        for(int gap = k; gap>0;gap = gap/2) {
            for(int i =0; i+gap<nums.length; i++) {
                if(nums[i]>nums[i+gap]) {
                   int temp = nums[i];
                   nums[i] = nums[i+gap];
                   nums[i+gap] = temp;

                }
            }
        }
        return nums;
    }

}
