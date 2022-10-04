import java.util.Scanner;
public class Assignment2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // System.out.println("Please enter a number: ");
        // int numero = scanner.nextInt();
        //User inputs a number to be used for the diamond

        // System.out.println("Enter a symbol to use: ");
        // String cymbal = scanner.next();
        //User inputs whatever symbol they want to be used for the diamond
        
        int chicken = 4;
        for(int i = 1; i<=chicken; i++) {
            for(int j = 1; j<=i; j++) {
                System.out.println(cymbal); 
            }
            System.out.println();
        }

        scanner.close();
    }
}