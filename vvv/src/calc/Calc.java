package Calc;

public class Calc {

    public static void main(String[] args) {
        try {
            //String S = "-1.5 + 1e-02";
            //String S = "95 / 0";
            //String[] args = S.split(" ");
            double num1 = Double.parseDouble(args[0]);
            char operation = args[1].charAt(0);
            double num2 = Double.parseDouble(args[2]);
            System.out.println("Solution: " + calc(num1, num2, operation));
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }

    static double calc(double num1, double num2, char operation) {
        switch (operation) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else System.out.println("Error!!!!");
            default:
                return Double.NaN;
        }
    }
}