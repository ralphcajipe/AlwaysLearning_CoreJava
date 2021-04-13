public class thisKeyword {
    /**
     * this
     * - represents the current class
     * - can not be used inside a static method
     * 
     * X disregard the following below X
     * - can be used in variable, method and inner class
     * - can not make a variable a class variable
     * - can not invoke a method inside a static method
     */
    int x = 0;
    public static void main(String[] args) {
        // Exception: Cannot use this in a static context
        System.out.println(this.x);
    }
}
