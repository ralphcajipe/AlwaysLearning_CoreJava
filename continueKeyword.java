public class continueKeyword {
    /**
     * - use in looping to skip the current loop
     * - therefore skipping all the coes after encountering the keyword
     */
    public static void main(String[] args) {
        if(true)
            continue;
        System.out.println("Since it is true, you will never get to this point.");  
    }
    
}
