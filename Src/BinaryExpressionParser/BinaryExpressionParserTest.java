import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BinaryExpressionParserTest {

    @Test
    void testParseValidExpression1() {
        String input = "2.3 + 3.4";
        String[] result = BinaryExpressionParser.parseBinaryExpression(input);
        assertNotNull(result, "Result should not be null for valid input: " + input);
        assertEquals("2.3", result[0], "Left operand mismatch");
        assertEquals("+", result[1], "Operator mismatch");
        assertEquals("3.4", result[2], "Right operand mismatch");
    }

    @Test
    void testParseValidExpression2() {
        String input = "5 +5";
        String[] result = BinaryExpressionParser.parseBinaryExpression(input);
        assertNotNull(result, "Result should not be null for valid input: " + input);
        assertEquals("5", result[0], "Left operand mismatch");
        assertEquals("+", result[1], "Operator mismatch");
        assertEquals("5", result[2], "Right operand mismatch");
    }

    @Test
    void testParseValidExpression3() {
        String input = "7.5 * 2.0";
        String[] result = BinaryExpressionParser.parseBinaryExpression(input);
        assertNotNull(result, "Result should not be null for valid input: " + input);
        assertEquals("7.5", result[0], "Left operand mismatch");
        assertEquals("*", result[1], "Operator mismatch");
        assertEquals("2.0", result[2], "Right operand mismatch");
    }

    @Test
    void testParseValidExpression4() {
        String input = "x - y";
        String[] result = BinaryExpressionParser.parseBinaryExpression(input);
        assertNotNull(result, "Result should not be null for valid input: " + input);
        assertEquals("x", result[0], "Left operand mismatch");
        assertEquals("-", result[1], "Operator mismatch");
        assertEquals("y", result[2], "Right operand mismatch");
    }

    @Test
    void testParseInvalidExpressionMissingRightOperand() {
        String input = "2.3 +";
        String[] result = BinaryExpressionParser.parseBinaryExpression(input);
        assertNull(result, "Result should be null for invalid input: " + input);
    }

    @Test
    void testParseInvalidExpressionExtraToken() {
        String input = "3.4 / 2.1 extra";
        String[] result = BinaryExpressionParser.parseBinaryExpression(input);
        assertNull(result, "Result should be null for invalid input: " + input);
    }

    @Test
    void testParseInvalidExpressionNotMatchingPattern() {
        String input = "invalid";
        String[] result = BinaryExpressionParser.parseBinaryExpression(input);
        assertNull(result, "Result should be null for invalid input: " + input);
    }

    @Test
    void testParseInvalidExpressionMissingLeftOperand() {
        String input = "+ 3.4";
        String[] result = BinaryExpressionParser.parseBinaryExpression(input);
        assertNull(result, "Result should be null for invalid input: " + input);
    }

    @Test
    void testParseInvalidExpressionMissingOperator() {
        String input = "2.3 3.4";
        String[] result = BinaryExpressionParser.parseBinaryExpression(input);
        assertNull(result, "Result should be null for invalid input: " + input);
    }
}
