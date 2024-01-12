public class Conversion {
    public static String convertToRim(int x) throws Exception {
        String result;
        if (x < 10 && x > 0){
            result = units(x);
        }else if (x > 9 && x < 99){
            result = tens(x / 10);
            if (x % 10 != 0)
                 result += units(x % 10);
        }else if (x == 100){
            result = hundreds(x);
        }
        else{
            throw new Exception("Throws exception: Can not be converted to Rim locale");

        }
        return result;
    }

    public static int convertToArabic(String value) throws Exception {
        String[] rimDigits = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        int[] arabicDigits = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int digit = -1;
        for (int i = 0; i < 10; i++) {
            if (value.equals(rimDigits[i])) {
                digit = arabicDigits[i];
                break;
            }
        }
        if (digit == -1) {
            throw new Exception("Throws exception: It is not digit");
        }
        return digit;
    }

    private static String units(int units) {
        switch (units) {
            case 1: return "I";
            case 2: return "II";
            case 3: return "III";
            case 4: return "IV";
            case 5: return "V";
            case 6: return "VI";
            case 7: return "VII";
            case 8: return "VIII";
            case 9: return "IX";
            default: return "null";
        }
    }

    private static String tens(int tens) {
        switch (tens) {
            case 1: return "X";
            case 2: return "XX";
            case 3: return "XXX";
            case 4: return "XL";
            case 5: return "L";
            case 6: return "LX";
            case 7: return "LXX";
            case 8: return "LXXX";
            case 9: return "XC";
            default: return "null";
        }
    }

    private static String hundreds(int hundreds) {
        switch (hundreds) {
            case 100: return "C";
            default: return "null";
        }
    }

}
