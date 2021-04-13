/**
 * Passing subclass constructor parameter to superclass constructor parameter
 */
class A {
    public A(int valueofSuperclass){}
    
}
class B extends A{
    public B(int valueOfSubclass){
        super(valueofSubclass);
    }
}