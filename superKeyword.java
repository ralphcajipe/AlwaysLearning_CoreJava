public class superKeyword {
    /**
     * super
     * - represents the parent class
     * - can not be used inside a static method
     * - can be used to access parent class attributes and behaviors
     */
    int x = 0;
    public static void main(String[] args) {
        // Exception: Cannot use this in a static context
        System.out.println(super.x);
    }
}
