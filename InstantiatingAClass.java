class InstantiatingAClass {
    
    public static void main(String[] args) {
        // Valid way to instantiate
        // Classname objectname = newkeyword constructorname();
        // Name of constructor should be the same as the name of Class with () because it's a method
        InstantiatingAClass test = new InstantiatingAClass();

        // Invalid
        InstantiatingAClass test = new test(); // wrong constructor name
        InstantiatingAClass test = new InstantiatingAClass; // no parentheses
        test InstantiatingAClass = new test; // object came first, very wrong
    }
}
