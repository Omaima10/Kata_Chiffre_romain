import java.util.Scanner;

public class ParserApp {
    public static void main(String[] args) {

        // Defining a regular expression for validating the user input (Roman numeral format)
        String romanRegex="^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$";

        RomanParser parser=new RomanParser();
        String answer="";
            //Read the user input
            Scanner scan = new Scanner(System.in);
        System.out.println("\n********** Hello to the Roman to Integer Converter ******************\n");
            do {
                System.out.println("Enter a Roman Numeral :");
                String romanNumber = scan.nextLine();
                if (romanNumber.matches(romanRegex)) {
                    int result = parser.romanToInteger(romanNumber);
                    System.out.println("The Integer Value of " + romanNumber + " is: " + result);
                } else
                    System.out.println("You have entered an invalid roman numeral \n");
                System.out.println("do you want to try another conversion ?(Y/N)");
                answer=scan.nextLine();
            }while (answer.equals("y"));

        }


}
