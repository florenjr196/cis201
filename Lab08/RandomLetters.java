import java.util.*;

public class RandomLetters {

    public static void main (String [] args)  {
        for (int i = 1; i <= 10; i++) {
            //System.out.println(randomLetter());
	    System.out.println(randomLetterStream());
	}
    }

    // put randomLetter() here
    public static char randomLetter() {
	Random number = new Random();
	int num = number.nextInt(2);
	if (num == 0) {
	char letter = (char)((number.nextInt(26)) + (int)('a'));
	return letter;
	} 
	char letter = (char)((number.nextInt(26)) + (int)('A'));
	return letter;
    } 
    // put randomLetterStream() here

    public static String randomLetterStream() {
	Random number = new Random();
	
	char letter;
	String stream = "";
	for (int i = 1; i <= number.nextInt(9) + 4; i++) {
	    int num = number.nextInt(2);
	    if (num == 0) {
		letter = (char)((number.nextInt(26)) + (int)('a'));
		
	    } else {
		letter = (char)((number.nextInt(26)) + (int)('A'));
		
	    }
	    stream += letter;
	}
	return stream;
	
    }
}
