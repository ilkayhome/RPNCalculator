package rpn;

import junit.framework.TestCase;

public class TestRPNCalculator extends TestCase {

    public void testEqualsSumCase1() {

        String expression = "2,3,+";
        assertEquals(5.0, new RPNCalculator().calculate(expression));

    }
    
    public void testEqualsSumCase2() {

        String expression = "2,1,+";
        assertEquals(3.0, new RPNCalculator().calculate(expression));

    }
    
    public void testEqualsSumCase3() {

        String expression = "2,7,+";
        
        if(new RPNCalculator().calculate(expression) != 9.0)
        {
            assertTrue(false);
        }

    }
    
    public void testEqualsSubstractCase1() {

        String expression = "1,3,-";
        assertEquals(-2.0, new RPNCalculator().calculate(expression));

    }
    
    public void testEqualsSubstractCase2() {

        String expression = "0,5,-";
        assertEquals(-5.0, new RPNCalculator().calculate(expression));

    }
    
    public void testEqualsSubstractCase3() {

        String expression = "2,2,-";
        assertEquals(0.0, new RPNCalculator().calculate(expression));

    }
    
    public void testEqualsMultiplyCase1() {

        String expression = "6,2,*";
        assertEquals(12.0, new RPNCalculator().calculate(expression));
    }
   
}
