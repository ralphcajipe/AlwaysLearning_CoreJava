/**
 * AccessingClassStaticVariable
 */
    class ClassStaticVariable  {
    static int b = 2;

    public static void main(String[] args){
        
        ClassStaticVariable test = new ClassStaticVariable();
        // Each print is valid
        System.out.println("Class Static Variable"); 
        System.out.println(test.b); // 2
        System.out.println(ClassStaticVariable.b); // 2
        System.out.println(b); // 2
    }
}