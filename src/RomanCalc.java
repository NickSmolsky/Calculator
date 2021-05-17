import java.util.List;

public class RomanCalc extends Calc {
    private String inputNum;

    public RomanCalc(String inputNum) {
        this.inputNum = inputNum;
    }

    public static void calcForRomanNum(String inputNum) {
        String[] romanNumArray = inputNum.split(" ");
        String romanNum1 = romanNumArray[0];
        String operation = romanNumArray[1];
        String romanNum2 = romanNumArray[2];

        int arabNum1 = romanToArab(romanNum1);
        int arabNum2 = romanToArab(romanNum2);
        int result = 0;

        switch (operation) {
            case "+" -> result += sum(arabNum1, arabNum2);
            case "-" -> result += diff(arabNum1, arabNum2);
            case "*" -> result += mult(arabNum1, arabNum2);
            case "/" -> result += div(arabNum1, arabNum2);
        }
        System.out.println(arabToRoman(result));
    }

    public static int romanToArab(String romanNum) {
        int result = 0;
        int index = 0;

        List<RomanNum> romanNums = RomanNum.getListEnum();

        while (romanNum.length() > 0) {
            RomanNum sym = romanNums.get(index);
            if (romanNum.startsWith(sym.name())) {
                result += sym.getValue();
                romanNum = romanNum.substring(sym.name().length());
            } else
                index++;
        }
        return result;
    }

    public static String arabToRoman(int arabNum) {
        StringBuilder romanNum = new StringBuilder();
        int index = 0;

        List<RomanNum> romanNums = RomanNum.getListEnum();

        while (arabNum > 0) {
            RomanNum sym = romanNums.get(index);
            if (sym.getValue() <= arabNum) {
                romanNum.append(sym.name());
                arabNum -= sym.getValue();
            } else
                index++;
        }
        return romanNum.toString();
    }
}
