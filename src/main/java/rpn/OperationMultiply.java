package rpn;

public class OperationMultiply extends Operation{

    
     public OperationMultiply() {
        this.OPERAND = Operands.OPERAND_MULTIPLY;
    }

    
    @Override
    public int doOperation(int param1, int param2) {
        return param1 * param2;
    }
    
}

