public class InsertionSort implements SortingAlgorithm{

    public int[] sorty(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            //nums[i] is the index of the first unsorted element
            //j keeps track of the index of the current element being
            //put into the sorted part
            //i is incremented once the current element is put in the correct location
            int key = nums[i];
            int j = i-1;
            while((j>=0) && nums[j] > key) {
                //compares the nums at different positions
                //if the current element is less than the next element
                //then the values are swapped
                nums[j + 1] = nums[j];
                j = j - 1;
            }
                // int temp = nums[j];
                //nums[j] = nums[j-1];
                //nums[j-1] = temp;
                //the index can only go to 0 because then its the first element
                nums[j+1] = key;
        }
        return nums;
        }

    @Override
    public String toString() {
        return "Insertion Sort";
    }

}
