public class SimulationAndSequence {
    /**
     * How to interpret the sequencial flow of the program and scope of variables
     */
    int x = 10;
    public static void main(String[] args) {
        // Will not print first
        SimulationAndSequence test = new SimulationAndSequence();  
        // Like an anonymous function
        {int x = 1;}
        {int x = 2;}
        // 
        int x=3;
        System.out.println(x); // 3
        // Prints instance variable 10
        System.out.println(test.x); 
    }
    // Will print this first
    public SimulationAndSequence(){
        System.out.println("Sequence of simulation is: ");
        int x = 100;
        System.out.println(x); // 100
    }
     
}
