import java.util.ArrayList;
import java.util.Arrays;

public class Calculation {
    public static void calc (String input) throws Exception {
        ArrayList<String> myList = new ArrayList<>(Arrays.asList(input.split(" ")));
        Check.checkCountOfString(myList);
        if (Check.isOperator(myList.get(1)) && Check.isSameLocale(myList.get(0), myList.get(2))){
            if (Check.isNumeric(myList.get(0))){
                int x = Integer.parseInt(myList.get(0));
                int y = Integer.parseInt(myList.get(2));
                System.out.println(calculateResult(x, myList.get(1), y));
            }else {
                System.out.println(calcRimDigits(myList));
            }
        }
    }

    private static String calcRimDigits(ArrayList<String> myList) throws Exception {
        int firstValue = Conversion.convertToArabic(myList.get(0));
        int secondValue = Conversion.convertToArabic(myList.get(2));
        int result = calculateResult(firstValue, myList.get(1), secondValue);
        return Conversion.convertToRim(result);
    }

    private static int calculateResult(int x, String operator, int y) throws Exception {
        switch(operator){
            case "+": return x + y;
            case "/": return x / y;
            case "-": return x - y;
            case "*": return x * y;
            default:
                throw new Exception("Throws exception: Incorrect operator");
        }
    }
}