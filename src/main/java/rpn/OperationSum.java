package rpn;

public class OperationSum extends Operation{

    public OperationSum() {
        this.OPERAND = Operands.OPERAND_SUM;
    }

    
    @Override
    public int doOperation(int param1, int param2) {
        return param1 + param2;
    }
}