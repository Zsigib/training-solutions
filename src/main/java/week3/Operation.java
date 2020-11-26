package week3;

public class Operation {

    private int leftOperand;
    private int rightOperand;

    public Operation (String expression) {
        String left = expression.substring(0, expression.indexOf("+"));
        leftOperand = Integer.parseInt(left);

        String right = expression.substring(0, expression.indexOf("+") + 1);
        rightOperand = Integer.parseInt(right);
    }

    public int getResult(){
        return leftOperand + rightOperand;
    }
}
