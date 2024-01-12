import java.util.ArrayList;

public class Check {
    public static void isDigitInRange(int x) throws Exception {
        if (x < 1 || x > 10){
            throw new Exception("Throws exception: Digit is out of range");
        }
    }

    public static boolean isOperator(String str){
        switch(str){
            case "+": return true;
            case "/": return true;
            case "-": return true;
            case "*": return true;
            default:
                return false;
        }
    }

    public static boolean isSameLocale(String firstValue, String secondValue) throws Exception {
        if (isNumeric(firstValue) && isNumeric(secondValue)){
            isDigitInRange(Integer.parseInt(firstValue));
            isDigitInRange(Integer.parseInt(secondValue));
            return true;
        }else if (!isNumeric(firstValue) && !isNumeric(secondValue)){
            return true;
        }else{throw new Exception("Throws exception: Digits are not in the Same Locale");
        }
    }

    public static boolean isNumeric(String string) {
        int intValue;

        if(string == null || string.equals("")) {
            return false;
        }

        try {
            intValue = Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void checkCountOfString(ArrayList<String> list) throws Exception {
        if (list.size() != 3) {
            throw new Exception("Throws exception: Incorrect format");
        }
    }
}