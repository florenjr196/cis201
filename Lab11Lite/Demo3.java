import java.util.*;
import java.io.*;

public class Demo3 {

    public static void main (String [] args) throws FileNotFoundException{
	Scanner sc = new Scanner(new File("data.txt"));
        // get the number of values
	int size = sc.nextInt();
	double [] a = readArray(sc, size);
	double average = average(a);
	System.out.println("Average = " + average);
	System.out.println("The largest value in the data set is: " +
				   max(a));
    }

    // put readArray() here and modify it as required
    public static double []  readArray(Scanner sc, int size) {
	double [] numbers = new double[size];
	for (int i = 0; i < size; i++) {
	    numbers[i] = sc.nextDouble();
	}
	return numbers;
    }
    
    // write average() here
    public static double average(double [] a) {
	double sum = 0;
	for (int i = 0; i < a.length; i++) {
	    sum += a [i];
	}
	return sum/a.length;
    }

    // write max() here
    public static double max(double[] a) {
	double maximum = 0;
	for (int i = 0; i < a.length; i++) {
	    if (a [i] > maximum) {
		maximum = a [i];
	    }
	}
	return maximum;
    }
}
