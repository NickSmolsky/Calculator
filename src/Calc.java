
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 арабских или римских числа от 0 до 10 для выполнения арифмитической операции (в формате x + y): ");
        
        String stringNum = scanner.nextLine();
        if (stringNum.matches("([0-9]|1[0])\s(\\+|-|\\*|/)\s([0-9]|1[0])")) {
            ArabCalc.calcForArabNum(stringNum);
        } else if (stringNum.matches("((IX|IV|V?I{0,3})|X)\s(\\+|-|\\*|/)\s((IX|IV|V?I{0,3})|X)")) {
            RomanCalc.calcForRomanNum(stringNum);
        } else
            throw new NumberFormatException("Ошибка ввода");
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int diff(int num1, int num2) {
        return num1 - num2;
    }

    public static int mult(int num1, int num2) {
        return num1 * num2;
    }

    public static int div(int num1, int num2) {
        return num1 / num2;
    }
}
