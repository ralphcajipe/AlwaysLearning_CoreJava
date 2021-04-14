public  class ScopeOfVariables {
    public static void main(String[] args) {
        
        public void displayValue(){
            // Will not print because condition
            if(true){
                int value = 10;
                if(value %2 == 0){
                    value += 100; // 10+100
                }
            }
            int value = 25;
            compute(value);
            value -= 20; // 25-20 = 5
            System.out.println(value); // 5
        }
        // It is set to void and no return value 
        // so it will not affect value 25
        public void compute(int value){
            value++;
        }
    }
    
    
}
