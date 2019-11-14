package postfix;

import static org.junit.Assert.*;

import org.junit.Test;
import parser.MalformedExpressionException;

public class Task1 {

	@Test
	public void test1() throws MalformedExpressionException {
	    assertEquals(7, new PostfixEvaluator("5 2 +").eval(), 0);
	}

    @Test
    public void test2() throws MalformedExpressionException {
        assertEquals(8, new PostfixEvaluator("5 2 + 7 - 8 +").eval(), 0);
    }

    @Test
    public void test3() throws MalformedExpressionException {
        assertEquals(-40, new PostfixEvaluator("5 2 + 7 - 8 + 0 5 - *").eval(), 0);
    }

    @Test(expected = MalformedExpressionException.class)
    public void test4() throws MalformedExpressionException {
        assertEquals(-40, new PostfixEvaluator("5 2 + 7 - 8 + 0 5 - * +").eval(), 0);
    }

    @Test(expected = MalformedExpressionException.class)
    public void test5() throws MalformedExpressionException {
        new PostfixEvaluator("+").eval();
    }

    @Test
    public void test6() throws MalformedExpressionException {
        assertEquals(200, new PostfixEvaluator("10 10 + 10 *").eval(), 0);
    }

    @Test
    public void test7() throws MalformedExpressionException {
        assertEquals(10, new PostfixEvaluator("5 5 / 10 *").eval(), 0);
    }

    @Test
    public void test8() throws MalformedExpressionException {
        assertEquals(-99, new PostfixEvaluator("6 3 - 10 - 5 * 2 + 3 *").eval(), 0);
    }

}
