public class DealingWithLocalVariables {
    public static void main(String[] args) {
        int x = 10;
        // Loop 9 times
        System.out.println("Printing loop...");
        for(int i=1; i<10; i++){
            compute(x); // Prints 11 from local compute(int x)
        }
        System.out.println("Value of main x is: " +x); // x = 10
    }
    public static void compute(int x){
        x++; // 10 + 1
        System.out.println(x); // 11
    }
}
