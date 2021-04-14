/**
 * StringMethods
 */
public class StringMethods {

    public static void main(String[] args) {
        String message = "i WILL WIN!";
        System.out.println(message.charAt(0)); // i

        System.out.println(message.substring(2, message.length()).toLowerCase()); // will win!

        System.out.println(String.valueOf(message.charAt(0)).toUpperCase()); // I
    }
}