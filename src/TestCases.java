import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class TestCases {

    public static void runTests(Hashtable<String ,Integer> tests) {

        RomanParser parser = new RomanParser();
        int CountFailureTest = 0;
        int numberOfTests = tests.size();

        for(Enumeration<String> key = tests.keys(); key.hasMoreElements();) {
            String input = key.nextElement();
            int expectation = tests.get(input);
            int output =  parser.romanToInteger(input);
            if (output != expectation) {
                System.out.println("Failure: expected  Integer of " + input + " is " + expectation + " but got " + output );
                CountFailureTest += 1;
            }
        }
       System.out.println(numberOfTests - CountFailureTest + " tests passed");
    }


    public static void main(String[] args) {
        Hashtable<String,Integer> tests= new Hashtable<>();
        tests.put("I",1);
        tests.put("II",2);
        tests.put("III",3);
        tests.put("IV",4);
        tests.put("V",5);
        tests.put("VI",6);
        tests.put("IX",9);
        tests.put("XII",12);
        tests.put("XVI",16);
        tests.put("XXIX",29);
        tests.put("XLIV",44);
        tests.put("XLV",45);
        tests.put("LXVIII",68);
        tests.put("LXXXIII",83);
        tests.put("D",500);
        tests.put("DI",501);
        tests.put("DCL",650);
        tests.put("DCCCXCV",895);
        tests.put("M",1000);
        tests.put("MMXVIII",2018);
        tests.put("MMXXII",2022);
        tests.put("MMMDCCXXIV",3724);
        runTests(tests);

    }
}
