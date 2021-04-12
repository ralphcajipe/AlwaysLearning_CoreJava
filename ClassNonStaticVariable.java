/**
 * Accessing Class Non-Static Variable
 */
    class ClassNonStaticVariable {
    int b = 2;

    public static void main(String[] args){
        
        ClassNonStaticVariable test = new ClassNonStaticVariable();
        System.out.println("Class Non Static Variable"); 
        System.out.println(test.b); // 2
        System.out.println(ClassNonStaticVariable.b); // Not allowed
        System.out.println(b); // Not allowed
    }
}
