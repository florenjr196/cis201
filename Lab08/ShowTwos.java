import java.util.*;

public class ShowTwos {

    public static void main (String [] args)  {
	Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        showTwos(number);
    }

    // put showTwos() here
    public static void showTwos(int number) {
	System.out.print(number + " = ");
	while(number % 2 == 0 && number != 2) {
	    System.out.print("2 * ");
	    number = number / 2;
	}
	System.out.println(number);
    }

}
