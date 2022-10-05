import java.util.Scanner;
public class Assignment2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Please enter a number: ");
        int Userinputnumero = scanner.nextInt();
        //User inputs a number to be used for the diamond
 
        System.out.println("Enter a symbol to use: ");
        String Userinputsymbol = scanner.next();
        //User inputs whatever symbol they want to be used for the diamond
        System.out.println();
        //Creating a space between the symbol and the beginning of the diamond
       
        for(int i = 0; i<=Userinputnumero; i++) {
            for(int j = i; j<=Userinputnumero; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++) {
                System.out.print(Userinputsymbol);
            }
            for(int j = 1; j<=i; j++) {
                System.out.print(Userinputsymbol);
            }
            System.out.println();
        }
 
        for(int k = 0; k<=Userinputnumero; k++) {
            for(int j = 1; j<=k; j++) {
                System.out.print(" ");
            }
            for(int j = k; j<=Userinputnumero; j++) {
                System.out.print(Userinputsymbol);
            }
            for(int j = k; j<=Userinputnumero; j++) {
                System.out.print(Userinputsymbol);
            }
            System.out.println();
        }
        /*
        Prints out a diamond shape
        However this prints out the user input's number as rows to and from the middle.
        If the user inputs 3, there will be 3 rows to the middle, 
        a separate section, and then 3 rows to the bottom*/
        scanner.close();
    }
}
