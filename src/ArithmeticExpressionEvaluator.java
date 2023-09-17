import java.util.Scanner;
import java.util.Stack;
public class ArithmeticExpressionEvaluator
{
    public static int evaluateExpression(String expression)
    {
        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < expression.length(); i++)
        {
            char c = expression.charAt(i);
            if (Character.isDigit(c))
            {
                int num = 0;
                while (i < expression.length() && Character.isDigit(expression.charAt(i)))
                {
                    num = num * 10 + (expression.charAt(i) - '0');
                    i++;
                }
                i--;
                operands.push(num);
            } else if (c == '(') {
                operators.push(c);
            } else if (c == ')')
            {
                while (!operators.isEmpty() && operators.peek() != '(') {
                    int operand2 = operands.pop();
                    int operand1 = operands.pop();
                    char operator = operators.pop();
                    int result = applyOperator(operand1, operand2, operator);
                    operands.push(result);
                }
                operators.pop(); // Видаляємо відкриваючу дужку зі стеку операторів
            } else if (c == '+' || c == '-' || c == '*') {
                while (!operators.isEmpty() && hasHigherPrecedence(c, operators.peek()))
                {
                    int operand2 = operands.pop();
                    int operand1 = operands.pop();
                    char operator = operators.pop();
                    int result = applyOperator(operand1, operand2, operator);
                    operands.push(result);
                }
                operators.push(c);
            }
        }

        while (!operators.isEmpty())
        {
            int operand2 = operands.pop();
            int operand1 = operands.pop();
            char operator = operators.pop();
            int result = applyOperator(operand1, operand2, operator);
            operands.push(result);
        }

        return operands.pop();
    }

    private static boolean hasHigherPrecedence(char op1, char op2) {
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
            return true;
        return false;
    }

    private static int applyOperator(int operand1, int operand2, char operator)
    {
        switch (operator)
        {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            default:
                throw new IllegalArgumentException("Невідомий оператор: " + operator);
        }
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Input expression: ");
        String expression = in.nextLine();
        int result = evaluateExpression(expression);
        System.out.println("Результат: " + result);
    }
}
