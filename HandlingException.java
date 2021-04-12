class HandlingException {
    public static void main(String[] args) {
        try {
            // Throws Arithmetic Exception
            System.out.println(10/2); 
            System.out.println("1. This will print if no error.");          
        }
        catch (ArithmeticException e) { 
            System.out.println("2. Arithmetic Exception catched it.");
        } 
        catch (Exception e) {
            System.out.println("3. Exception catched it.");
        } 
        finally {
            System.out.println("4. Finally is always executed.");
        }
    }
}
