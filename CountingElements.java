public class CountingElements {
    public static void main(String[] args) {
        
        // For Array, use .length variable
        System.out.print("For Array: ");
        int values[] = {1, 2, 3, 4, 5};
        System.out.print(values.length);

        // For String, use .length() method
        System.out.print("\nFor String: ");
        String message = "I will win!";
        System.out.print(message.length());

        // For any of the Collection like List, use .size() method
        System.out.print("\nFor List: ");
        List myList = new ArrayList();
        System.out.print(myList.size());
    }
}
