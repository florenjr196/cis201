import java.util.*;

public class CoinToss {

    public static void main (String [] args) {
        coinToss();
    }    

    // put coinToss() here
    public static void coinToss() {
	Random rand = new Random();
	int num = rand.nextInt(2);
	int count = 0;
	while (count != 3) {
	    
	    if (num == 1) {
		System.out.print("H ");
		count++;
	    } else {
		System.out.print("T ");
		count = 0;
	    }
	    num = rand.nextInt(2);
	}
	System.out.println();
	
    }
}
