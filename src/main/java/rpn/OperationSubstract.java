package rpn;

public class OperationSubstract extends Operation{

    public OperationSubstract() {
        this.OPERAND = Operands.OPERAND_SUBSTRACT;
    }

    
    @Override
    public int doOperation(int param1, int param2) {
        return param1 - param2;
    }
    
}
