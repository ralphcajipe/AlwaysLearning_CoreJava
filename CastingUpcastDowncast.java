public class CastingUpcastDowncast {
    /**
     * - casting will just cast the value without rounding up
     */
    public static void main(String[] args) {
        double grade = 3.5;
        //  Downcast/Explicit cast - stated clearly and in detail, leaving no room for confusion or doubt
        int newGrade = (int)grade; 
        int anotherGrade = 4;
        System.out.println(newGrade); // 3
        
        // Upcast/Implicit Cast - implied though not plainly expressed
        grade = anotherGrade; 
        System.out.println(grade); // 4.0
    }
    
}
