import java.util.Scanner;

public class ScannerMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner("2 hot 2 handle me, for real");

        System.out.println(input.nextInt());
        //java.util.InputMismatchException
        System.out.println(input.nextInt());
        //
        System.out.println(input.nextInt());
        System.out.println(input.nextLine());
    }   
}
