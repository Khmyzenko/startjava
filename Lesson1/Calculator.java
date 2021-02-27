import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double result = 1;
        int yes = 0;

        do {
            System.out.println("Введите первое число:");
            double  firstNumber = input.nextDouble() ;

            System.out.println("Укажите операцию '+' '-' '*' '/' '^' '%':");
            char ch = input.next().charAt(0);

            System.out.println("Введите второе число:");
            double  secondNumber = input.nextDouble() ;

            if (ch == '+') {
            result = firstNumber + secondNumber;
            System.out.println(result);
            }
            if (ch == '-') {
            result = firstNumber - secondNumber;
            System.out.println(result);
            }
            if (ch == '*') {
            result = firstNumber * secondNumber;
            System.out.println(result);
            }
            if (ch == '/' && secondNumber == 0) {
            System.out.println("делить на 0 нельзя!");
            } else if (ch == '/' && secondNumber != 0) {
            result  = firstNumber / secondNumber;
            System.out.println(result);
            }
            if (ch == '^') {
            for (int i = 0; i < secondNumber; i++) {
                result = result * firstNumber;
            }
            System.out.println(result);
            }
            if (ch == '%') {
            result = firstNumber % secondNumber;
            System.out.println(result);
            }
            System.out.println("Если хотите продолжить вычисления нажмите - 1, если нет - любую клавишу");
            yes = input.nextInt();
        } while (yes == 1);
    }
}