public class ArabCalc extends Calc {
    private String inputNum;

    public ArabCalc(String inputNum) {
        this.inputNum = inputNum;
    }

    public static void calcForArabNum(String inputNum) {
        String[] arabNumArray = inputNum.split(" ");
        int arabNum1 = Integer.parseInt(arabNumArray[0]);
        String operation = arabNumArray[1];
        int arabNum2 = Integer.parseInt(arabNumArray[2]);
        int result = 0;

        switch (operation) {
            case "+" -> result += sum(arabNum1, arabNum2);
            case "-" -> result += diff(arabNum1, arabNum2);
            case "*" -> result += mult(arabNum1, arabNum2);
            case "/" -> result += div(arabNum1, arabNum2);
        }
        System.out.println(result);
    }
}
