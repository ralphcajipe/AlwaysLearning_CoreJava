public class PreandPostIncrementDecrement {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int z = 0;

        //    6 + 10 = 16
        z = ++x + y--; 
        System.out.println("First value of z: " +z);
        // y is now 9 because of post decrement
        // 9-1 = 8

        //    6 + 8 = 14
        z = x++ + --y; 
        System.out.println("Second value of z: " +z);
    }    
}
