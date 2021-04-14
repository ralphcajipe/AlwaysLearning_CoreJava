public class JavaStringandHeapMemory {
    public static void main(String[] args) {
        String s1 = "Ralph";
        String s2 = "Ralph";
        String s3 = s1;
        String s4 = new String("Ralph");

        if(s1==s2)
            System.out.println("true1"); // true
        if(s3==s1)
            System.out.println("true2"); // true
        if(s3==s2)
            System.out.println("true3"); // true
        if(s4==s1)
            System.out.println("true4"); // false, s4 is new memory allocation
        if(s4.equals(s1))
            System.out.println("true5"); // true, able to compare actual or literal value "Ralph"

    }
}
