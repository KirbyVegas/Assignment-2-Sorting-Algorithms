import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.List;

public class Performance {

    public static String info;
    public static String txt;

    public static void main(String[] args) {

        //array with the number of iterations
        int[] itArray = {100, 500, 1000, 2000,5000, 10000, 20000, 75000, 150000 };
        try {
            File performanceFile = new File("performance.txt");
            if (performanceFile.createNewFile()) {
                System.out.println("File created: " + performanceFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException ex) {
            System.out.println("An error occurred.");
            ex.printStackTrace();
        }



        //new list to contain all the algorithms
        LinkedList<SortingAlgorithm> algos = new LinkedList<>();
        SortingAlgorithm a = new BubbleSort();
        SortingAlgorithm b = new InsertionSort();
        SortingAlgorithm c = new NewMergeSort();
        SortingAlgorithm d = new QuickSort();
        SortingAlgorithm e = new SelectionSort();
        SortingAlgorithm f = new ShellSort();
        algos.add(a);
        algos.add(b);
        algos.add(c);
        algos.add(d);
        algos.add(e);
        algos.add(f);



        //for each loop to iterate through the algorithms
        for (SortingAlgorithm theAlg : algos) {
            System.out.println("Sorting Algorithm: " + theAlg.toString());
            String name = "Sorting Algorithm: " + theAlg.toString();
            txt = txt + "\n"+ name + "\n";
            for (int i = 0; i < itArray.length; i++) {
                Tester t1 = new Tester(theAlg);
                info = t1.test(2, itArray[i]);
                System.out.println(info);
                //print info to txt file
                txt = txt+"\n" + info + "\n";
            }

            //create a new file writer
            try {
                FileWriter myWriter = new FileWriter("performance.txt");
                myWriter.write(txt);
                myWriter.close();

            } catch (IOException ex) {
                System.out.println("An error occurred.");
                ex.printStackTrace();
            }
        }
        //atttempt to use ksorting to go through each algorithm
        //has an issue regarding the kArray being given a random number of elements to sort, instead of random array of numbers
//        for (SortingAlgorithm theAlg : algos) {
//            System.out.println("K Sorted Sorting Algorithm: " + theAlg.toString());
//            for (int i = 0; i < itArray.length; i++) {
//                Tester t1 = new Tester(theAlg);
//                //generate an array of k sorted numbers of size i
//                int[] kArray = t1.generateKSortedArray(i);
//                info = t1.test(20, kArray[i]);
//                System.out.println(info);
//
//            }
        }
    }

