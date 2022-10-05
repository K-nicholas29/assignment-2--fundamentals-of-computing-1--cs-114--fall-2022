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
        
        for(int i = 0; i<=Userinputnumero; i++) {
            for(int j = 0; j<i; j++) {
                System.out.print(cymbal);
            }
            System.out.println();
        }

        for(int i = Userinputnumero - 1; i>0; i--) {
            for(int j = 0; j<i; j++) {
                System.out.print(cymbal);
            }
            System.out.println();
        }
        //Prints out full right side of a diamond

        for(int i = 0; k<=Userinputnumero; i++) {
            for(int j = 0; j<i; j++) {
                System.out.print(cymbal);
            }
        }

        for(int i = Userinputnumero - 1; i>0; i--) {
            for(int j = 0; j<i; j++) {
                System.out.print(cymbal);
            }
            System.out.println();
        }
        scanner.close();
    }
}