class RedundantHandlingException {
    public static void main(String[] args) {
        try {
            // Throws Arithmetic Exception
            System.out.println(10/0); 
            System.out.println("1");          
        } 
        // Super class
        catch (Exception e) { 
            System.out.println("2. Exception catched it.");
        } 
        // Compiler will detect this as error because 
        // it is already handled by super class Exception
        catch (ArithmeticException e) {
            System.out.println("3. Arithmetic Exception catched it.");
        } 
        finally {
            System.out.println("4. Finally is always executed.");
        }
    }
}
