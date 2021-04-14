public class UsingvalueOf {
    /**
     * valueOf()
     * - A method that is available to Derived Data Types (Pointers, Arrays, Structures and Unions)
     * - Use to convert Primitive Data Type into another data tyoe
     */
    public static void main(String[] args) {
        
        String value = "5";
        Integer.valueOf(value);
        System.out.println(value);

        double x = 4.0;
        String.valueOf(x);
        System.out.println(x);
    }
}
