public class QuickSort implements SortingAlgorithm {
    public int partition(int[] nums, int low, int high) {
        int mid = (low + high)/2;
        int pivot = nums[mid];

        boolean done = false;
        while(done != true) {
            while(nums[low] < pivot) {
                low++;
            }
            while(nums[high] > pivot) {
                high--;
            }
            if(low >= high) {
                done = true;
            }
            else {
                //swap numbers at low and high indexes
                int temp = nums[low];
                nums[low] = nums[high];
                nums[high] = temp;

                //bring low and high indexes closer to each other
                low++;
                high--;
            }
        }
        return high;

    }

       public int[] quick(int[] nums, int startIndex, int endIndex) {

           // Only attempt to sort the array segment if there are
           // at least 2 elements
           if (endIndex <= startIndex) {
               return nums;
           }

           // Partition the array segment
           int high = partition(nums, startIndex, endIndex);

           // Recursively sort the left segment
           quick(nums, startIndex, high);

           // Recursively sort the right segment
           quick(nums, high + 1, endIndex);

           return nums;
       }

       public int[] sorty(int[] nums) {
        int startIndex = 0;
        int endIndex = nums.length-1;
        int[] result = quick(nums, startIndex, endIndex);
        return result;

       }




               //(int[] nums) {
//            //in the case that nums is already sorted
//            int low = 0;
//            int high = nums.length-1;
//            if(low >= high) {
//                return nums;
//            }
//            int lowEndIndex = partition(nums, low, high);
//
//            //recursively sort the high and low parts
//            //sorty(nums, low, lowEndIndex);
//            //sorty(nums, lowEndIndex, high);
//            sorty(nums);
//
//
//            return nums;



    @Override
    public String toString() {
        return "QuickSort";
    }
}
