import java.util.Scanner;
public class Assignment2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int numero = scanner.nextInt();

        System.out.println("Enter a symbol to use: ");
        String cymbal = scanner.next();

        for(int i = 0; i < 4; i++) {
            System.out.println(cymbal);
        }


        scanner.close();
    }
}