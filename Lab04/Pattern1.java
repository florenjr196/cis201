public class Pattern1 {

    public static void main (String [] args) {
        printPattern();
    }
    
    public static void printPattern() {
        for (int row = 1; row <= 4; row++) {
            for (int i = 1; i <= /*something in terms of the row*/; i++) {
                System.out.print("\\");
            }

            for (int i = 1; i <= /*something in terms of the row*/; i++) {
                System.out.print("!");
            }

            for (int i = 1; i <= /*something in terms of the row*/; i++) {
                System.out.print("/");
            }
            
            System.out.println(); // end of this row

        } // end outer for loop

    } // end method

} // end class
