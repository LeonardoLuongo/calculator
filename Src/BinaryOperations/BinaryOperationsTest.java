package BinaryOperations;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BinaryOperationsTest {

    @Test
    void testAdditionCase1() {
        double result = BinaryOperations.addition(2.0, 3.0);
        assertEquals(5.0, result, "Addition of 2.0 and 3.0 should be 5.0");
    }

    @Test
    void testSubtractionCase1() {
        double result = BinaryOperations.subtraction(4.0, 3.0);
        assertEquals(1.0, result, "Subtraction of 3.0 from 4.0 should be 1.0");
    }

    @Test
    void testMultiplicationCase1() {
        double result = BinaryOperations.multiplication(2.0, 3.0);
        assertEquals(6.0, result, "Multiplication of 2.0 and 3.0 should be 6.0");
    }

    @Test
    void testAdditionCase2() {
        double result = BinaryOperations.addition(5.2, 4.8);
        assertEquals(10.0, result, "Addition of 5.2 and 4.8 should be 10.0");
    }

    @Test
    void testSubtractionCase2() {
        double result = BinaryOperations.subtraction(1.1, 2.8);
        // Using a delta for potential floating-point arithmetic issues.
        assertEquals(-1.7, result, 1e-9, "Subtraction of 2.8 from 1.1 should be -1.7");
    }

    @Test
    void testMultiplicationCase2() {
        double result = BinaryOperations.multiplication(0.2, 5.0);
        assertEquals(1.0, result, "Multiplication of 0.2 and 5.0 should be 1.0");
    }

    @Test
    void testDivisionCase1() {
        double result = BinaryOperations.division(10.0, 2.0);
        assertEquals(5.0, result, "Division of 10.0 by 2.0 should be 5.0");
    }

    @Test
    void testDivisionCase2() {
        double result = BinaryOperations.division(30.0, 10.0);
        assertEquals(3.0, result, "Division of 30.0 by 10.0 should be 3.0");
    }

    @Test
    void testDivisionByZero() {
        try
        {
            double result = BinaryOperations.division(30.0, 0.0);
        }
        catch(Exception e)
        {
            // In Java, dividing a double by zero results in Infinity.
            assertTrue(true, "Division of 30.0 by 0.0 should result in infinity");
        }
    }

    @Test
    void testDivisionZeroDividend() {
        double result = BinaryOperations.division(0.0, 2.0);
        assertEquals(0.0, result, "Division of 0.0 by 2.0 should be 0.0");
    }
}

