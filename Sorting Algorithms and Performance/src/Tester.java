import java.util.Random;
public class Tester {
    public static SortingAlgorithm sortAl;
    public static long startTime;
    public static long endTime;
    private static int[] kArray;

    public Tester (SortingAlgorithm sa){
        sortAl = sa;
    }

    public static double singleTest(int size){
        //fill array of given size with random numbers
        Random rand = new Random();
        int[] randomArray = new int[size];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = rand.nextInt(100);
        }

        //code to run the tests with k-sorted data
        //KSorting k = new KSorting();
        //kArray = k.generateKSorted(randomArray);

        //timer for each method call
        startTime = System.nanoTime();
        sortAl.sorty(kArray);
        endTime = System.nanoTime();
        //System.out.println("Sorted " + size + " elements in " + (endTime - startTime) + " milliseconds");
        return endTime-startTime;
    }
    public String test (int iterations, int size){
        //should run the single test method as many times as # of iterations provided
        //print the average time it takes to sort an array of given size
        double count = 0;
        for(int i = 0; i < iterations; i++) {
            double testResult = singleTest(size);
            count = count + testResult;
        }
        return "Sorted " + size + " elements in " + ((count/iterations)/100) + " milliseconds";
    }
}