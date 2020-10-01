package Calc;

public class Calc {

    public static void main(String[] args) {
        try {
            // String S = "-1.5 + 1e-2";
             String S = "95 / 0";
            String[] Args = S.split(" ");
            double num1 = Double.parseDouble(Args[0]);
            char operation = Args[1].charAt(0);
            double num2 = Double.parseDouble(Args[2]);
            System.out.println("Solution: " + calc(num1, num2, operation));
        }
        catch (Exception e) {
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
                if (num2 == 0) {
                    System.out.println("Error!!!!");
                }
                else return num1 / num2;
            default:
                return Double.NaN;
        }
    }
}