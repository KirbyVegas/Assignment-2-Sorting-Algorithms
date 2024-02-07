public class BubbleSort implements SortingAlgorithm{
    //uses 2 loops, only swaps adjacent elements
    //best and worst runtime is O(N^2)


    public int[] sorty(int[] nums) {
        for(int i = 0; i <nums.length-1; i++) {
            for(int j = 0; j <nums.length-i-1; j++) {
                if(nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }

    @Override
    public String toString() {
        return "BubbleSort";
    }
}
