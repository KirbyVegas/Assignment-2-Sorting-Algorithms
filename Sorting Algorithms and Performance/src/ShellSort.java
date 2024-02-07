public class ShellSort implements SortingAlgorithm {

    //has a worst case of O(n^2) 

    public int[] sorty(int[] nums) {
        int n = nums.length;
        //first for loop is O(m), 2nd is O(N)
        for(int gap = n/2; gap > 0; gap /= 2) {
            for(int i = gap; i<n; i++) {
                int temp = nums[i];
                int j = i;
                while (j >= gap && nums[j - gap] > temp) {
                    nums[j] = nums[j - gap];
                    j = j- gap;
                }
                nums[j] = temp;

            }
        }
        return nums;
    }

    @Override
    public String toString() {
        return "ShellSort";
    }
}
