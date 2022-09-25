import java.util.HashMap;
import java.util.Map;

public class RomanParser {

    public static int romanToInteger(String romanNumber){

        //Create a hashMap with the roman numeral as key and the value it is gonna be its integer value
        Map<Character,Integer> romanNumbersMap= new HashMap<>();
        romanNumbersMap.put('I',1);
        romanNumbersMap.put('V',5);
        romanNumbersMap.put('X',10);
        romanNumbersMap.put('L',50);
        romanNumbersMap.put('C',100);
        romanNumbersMap.put('D',500);
        romanNumbersMap.put('M',1000);

        if(romanNumber == null)
            return 0;

        //initialize the result with the first char pf the roman string
        int integerNumber = 0;

        for(int i=0; i<romanNumber.length();i++){
            //variable used to get the current character of the string in each iteration
            char s= romanNumber.charAt(i);
            //if the current character is greater than the previous so we will extract current 2*previous and add it to the result
            if(i>0 && romanNumbersMap.get(s) > romanNumbersMap.get(romanNumber.charAt(i-1)))
            {
                integerNumber += romanNumbersMap.get(s) - 2 * romanNumbersMap.get(romanNumber.charAt(i-1));
            }
            // else add the current to result
            else {
                integerNumber+=romanNumbersMap.get(s);
            }
        }
        return integerNumber;
    }

}
