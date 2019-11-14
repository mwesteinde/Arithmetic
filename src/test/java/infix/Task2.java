package infix;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class Task2 {

    @Test
    public void test1() {
        String expr = "((1+2)+3)";
        ArithmeticExpressionTree myTree;
        try {
            myTree = new ArithmeticExpressionTree(expr);
            assertEquals(myTree.eval(), new BigDecimal(6.0));
        }
        catch (MalformedExpressionException e) {
            fail("Exception!");
        }

    }

    @Test
    public void test2() {
        String expr = "((1+2)*3)";
        ArithmeticExpressionTree myTree;
        try {
            myTree = new ArithmeticExpressionTree(expr);
            assertEquals(myTree.eval(), new BigDecimal(9.0));
        }
        catch (MalformedExpressionException e) {
            fail("Exception!");
        }

    }

    @Test
    public void test3() {
        String expr = "((1+2)/3)";
        ArithmeticExpressionTree myTree;
        try {
            myTree = new ArithmeticExpressionTree(expr);
            assertEquals(myTree.eval(), new BigDecimal(1.0));
        }
        catch (Exception e) {
            fail();
        }
    }

    @Test
    public void test4() {
        String expr = "(((1*2)*3)/3)";
        ArithmeticExpressionTree myTree;
        try {
            myTree = new ArithmeticExpressionTree(expr);
            assertEquals(myTree.eval(), new BigDecimal(2.0));
        }
        catch (Exception e) {
            fail();
        }
    }

    @Test
    public void test5() {
        String expr = "(((1*2)*27)/(3*3))";
        ArithmeticExpressionTree myTree;
        try {
            myTree = new ArithmeticExpressionTree(expr);
            assertEquals(myTree.eval(), new BigDecimal(6.0));
        }
        catch (Exception e) {
            fail();
        }
    }

    @Test
    public void test6() {
        String expr = "(((1*2)*27)/(3*0))";
        ArithmeticExpressionTree myTree;
        try {
            myTree = new ArithmeticExpressionTree(expr);
        }
        catch (Exception e) {
            assertTrue(true);
        }
    }

}
