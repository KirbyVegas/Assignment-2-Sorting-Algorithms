public class NewMergeSort implements SortingAlgorithm{

    public static void merge(int[] a, int[] l, int[] r, int left, int right) {
        //merge method that takes the original array, the left partition, and the right partition
        //initialize the first index, last index, and middle
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }


    //call mergeSort with the array and the size of the array
    public int[] sorty(int[] a) {
        int size = a.length;
        if (size < 2) {
            return a;
        }

        //figure out the size of the split up partitions
        int n1 = size / 2;
        int n2 = size-n1;

        //create new arrays and set their size = to the partition
        int[] left, right;
        left = new int[n1];
        right = new int[n2];

        //copy designated portions of the original array to the n1 and n2
        System.arraycopy(a, 0, left, 0, n1);
        System.arraycopy(a, n1, right, 0, n2);

        //sort from left to middle and then from middle to right
        sorty(left);
        sorty(right);

        //combine sorted partitions
        merge(a, left, right, n1, size - n1);

        return a;
    }
    @Override
    public String toString() {
        return "MergeSort";
    }

}
