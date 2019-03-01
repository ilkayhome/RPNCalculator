package rpn;

import java.util.HashMap;
import java.util.Map;

public class RPNCalculator {
    
    private int firstNumber;
    private int secondNumber;
    private char operand;

    Map<Character, Operation> operations = new HashMap<>();
    public RPNCalculator() {
        operations.put(Operands.OPERAND_SUM, new OperationSum());
        operations.put(Operands.OPERAND_SUBSTRACT, new OperationSubstract());
        operations.put(Operands.OPERAND_MULTIPLY, new OperationMultiply());
        
        // ilkay test 
    }
    
    
    
    public void parseExpression(String expression)
    {
        
        String[] components =  expression.split(",");
        firstNumber = Integer.valueOf(components[0]);
        
        
        System.out.println("Expression: " + expression);
        System.out.println("firstNumber: " + firstNumber);
        System.out.println("secondNumber: " + secondNumber);
        if(components.length == 3)
        {
            secondNumber = Integer.valueOf(components[1]);
            operand = components[2].charAt(0);
        }
        else
        {
            operand = components[1].charAt(0);
        }
        
        
        System.out.println("operand: " + operand);
        
    }      
    
    public double calculate(String expression)
    {
        System.out.println("xp.RPNCalculator.calculate() entered");
        parseExpression(expression);
             
        return operations.get(operand).doOperation(firstNumber, secondNumber);
            
        
    }
    
}
