public class SelectionSort implements SortingAlgorithm {


    public int[] sorty(int[] nums) {

        for(int i = 0; i<nums.length; i++) {
            int indexSmallest = i;
            for(int j = i+1; j < nums.length; j++) {
                //if the number at index j is smaller, make it the new smallest value
                if(nums[j] < nums[indexSmallest]) {
                    indexSmallest = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[indexSmallest];
            nums[indexSmallest] = temp;
            //System.out.println(nums);
        }



        return nums;
    }

    @Override
    public String toString() {
        return "SelectionSort";
    }
}
