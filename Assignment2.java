import java.util.Scanner;
public class Assignment2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int numero = scanner.nextInt();
        //User inputs a number to be used for the diamond

        System.out.println("Enter a symbol to use: ");
        String cymbal = scanner.next();
        //User inputs whatever symbol they want to be used for the diamond
        System.out.println();
        //Creating a space between the symbol and the beginning of the diamond
        
        for(int i = 1; i<=numero; i++) {
            for(int j = 1; j<=i; j++) {
                System.out.print(cymbal); 
            }
            for(int k = 1; k<i; k++){
                System.out.print(cymbal);
            }
            for(int l = 1; l<=i; l++){
                System.out.println(cymbal);
            }
            System.out.println();
        }
        //This code is for the top half of the diamond

        scanner.close();
    }
}