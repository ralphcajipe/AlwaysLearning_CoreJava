public class UsingFormatting {
    public static void main(String[] args) {
        double gravityOfEarth = 9.8066598799999999;

        System.out.printf("\n9 decimal places: %.9f", gravityOfEarth); // 9.806659880
        System.out.printf("\n0 decimal places: %.0f", gravityOfEarth); // round off to 10
        /**
         * "%5.2f" means "I want a number that has at LEAST 5 spaces TOTAL, 
         * TWO of which I want to go toward its value after the decimal point."
         */
        System.out.printf("\n5 spaces with 2 decimal places: %5.2f", gravityOfEarth); 
        System.out.printf("\n20 characters included: %20f", gravityOfEarth);                                  
        System.out.printf("\n"+gravityOfEarth); // 9.80665988 double value
        
    }
}
