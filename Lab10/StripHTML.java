import java.io.*;
import java.util.*;

public class StripHTML {

    public static void main (String [] args) throws FileNotFoundException {
        Scanner fileInput = openFile();
        // finish the program here
	
	while (fileInput.hasNextLine()) {
	  String line = fileInput.nextLine();  
	  Scanner lineScanner = new Scanner(line);
	  while (lineScanner.hasNext()){
	      String token = lineScanner.next();
	      if (token.charAt(0) == '<') {
		  continue;
	      } else {
		  System.out.print(token + " ");
	      }
	  }
	  System.out.println();
	  
	    
	    
	    
	}

    }

    public static Scanner openFile() throws FileNotFoundException {
        System.out.print("Enter file name: ");
        Scanner input = new Scanner(System.in);
        String fileName = input.nextLine(); 
        File inFile = new File(fileName);
        while (!inFile.exists()) {
           System.out.println(fileName + " not found.");
           System.out.print("Enter file name: ");           
           fileName = input.nextLine();
           inFile = new File(fileName);
	}
        return new Scanner(inFile);
    }

}
