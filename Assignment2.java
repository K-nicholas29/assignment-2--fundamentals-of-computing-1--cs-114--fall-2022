import java.util.Scanner;
public class Assignment2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int Userinputnumero = scanner.nextInt();
        //User inputs a number to be used for the diamond

        System.out.println("Enter a symbol to use: ");
        String cymbal = scanner.next();
        //User inputs whatever symbol they want to be used for the diamond
        System.out.println();
        //Creating a space between the symbol and the beginning of the diamond
        
        for(int i = 1; i<=Userinputnumero; i++) {
            for(int j = i; j<=Userinputnumero; j++) {
                System.out.print(" "); 
            }
            for(int j = 1; j<=i; j++) {
                System.out.print(cymbal);
            }
            for(int j = 1; j<=i; j++) {
                System.out.print(cymbal);
            }
            System.out.println();
        }

        for(int k = 1; k<=Userinputnumero; k++) {
            for(int j = 1; j<=k; j++) {
                System.out.print(" ");
            }
            for(int j = k; j<=Userinputnumero; j++) {
                System.out.print(cymbal);
            }
            for(int j = k; j<=Userinputnumero; j++) {
                System.out.print(cymbal);
            }
            System.out.println();
        }
        //This code is for the top half of the diamond. I think.
        //If I sort of reverse this will I get the bottom half?

        scanner.close();
    }
}