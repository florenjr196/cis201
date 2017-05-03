import java.util.*;
import java.io.*;

public class Demo5{

    public static void main (String [] args) throws FileNotFoundException{
	Scanner sc = new Scanner(new File("data2.txt"));
        int [] numbers = readArray(sc);
	int [] frequency   = getCounts(numbers, 20, 30);
	for (int i = 0; i < frequency.length; i++) {
	    System.out.println((i + 20) + ": " + frequency[i]);
	}
    }

    public static int [] readArray(Scanner sc) {
        int [] data = new int [1000];
        for (int i = 0; i < data.length; i++) {
            data [i] = sc.nextInt();
	}
	return data;
    }

    // write getCounts() here
    public static int[] getCounts(int [] numbers, int min, int max) {
	int [] newArray = new int[11];
	for(int i = 0; i < 11; i++) {
	    for (int j = 0; j < numbers.length; j++) {
		if (numbers [j] == min + i) {
		    newArray [i]++;
		}
	    }
	}
	return newArray;
    }

}
