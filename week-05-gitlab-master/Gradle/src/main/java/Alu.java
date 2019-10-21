/**
 * Arithmetic Logic Unit - ALU - capable of performing simple arithmetic
 * functions given an array argument.
 * 
 * @author Elijah Weske
 * @version N/A
 */
public class Alu {

    /**
     * Create a new Alu object.
     */
    private Alu() {
        // Does not allow for instantiation.

    }


    /**
     * Evaluates the expression given in argument x. Array argument has three
     * elements x[0] and x[2] = integer operands x[1] = operator
     * 
     * @param x - an array with two operands and an operator.
     *
     * @return result of operation.
     */
    public static Integer eval(String[] x) {
        Integer firstNum;
        Integer secondNum;
        String operator;

        firstNum = Integer.parseInt(x[0]);
        secondNum = Integer.parseInt(x[2]);
        operator = x[1];

        if (operator.equals("+")) {
            return firstNum + secondNum;
        }
        else if (operator.equals("*")) {
            return firstNum * secondNum;
        }
        else if (operator.equals("-")) {
            return firstNum - secondNum;
        }
        else if (operator.equals("/")) {
            if (secondNum.equals(0)) {
                throw new ArithmeticException();
            }
            else {
                return firstNum / secondNum;
            }
        }
        else if (operator.equals("%")) {
            return firstNum % secondNum;
        }
        else {
            return null;
        }

    }
}
