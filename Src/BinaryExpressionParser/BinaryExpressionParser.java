import java.util.regex.*;

public class BinaryExpressionParser {

    /**
     * Parses a binary expression string and returns an array of tokens if the input is valid.
     * Supported format: "operand operator operand" (e.g., "2.3 + 3.4" or "5+5").
     * Only symbol operators (+, -, *, /) are allowed.
     *
     * @param input the expression string to parse.
     * @return an array with three tokens [leftOperand, operator, rightOperand] if valid; null otherwise.
     */
    public static String[] parseBinaryExpression(String input) {
        // Regular expression that captures:
        //   1. A left operand (a number with optional decimal or a simple variable name),
        //   2. A symbol operator: +, -, * or /,
        //   3. A right operand (a number with optional decimal or a simple variable name).
        // This pattern allows for optional spaces around each component.
        String regex = "^\\s*((?:-?\\d+(?:\\.\\d+)?)|[a-zA-Z]+)\\s*(\\+|-|\\*|/)\\s*((?:-?\\d+(?:\\.\\d+)?)|[a-zA-Z]+)\\s*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        
        if (!matcher.matches()) {
            return null;
        }
        
        String leftOperand = matcher.group(1);
        String operator = matcher.group(2);
        String rightOperand = matcher.group(3);
        
        return new String[] { leftOperand, operator, rightOperand };
    }
    
    // A main method with some tests.
    public static void main(String[] args) {
        String[] testInputs = {
            "2.3 + 3.4",
            "5 +5",            
            "7.5 * 2.0",
            "x - y",
            "2.3 +",          // Invalid: missing operand.
            "3.4 / 2.1 extra" // Invalid: extra token.
        };
        
        for (String input : testInputs) {
            String[] tokens = parseBinaryExpression(input);
            if (tokens != null) {
                System.out.print("Valid binary expression: ");
                for (String token : tokens) {
                    System.out.print("\"" + token + "\" ");
                }
                System.out.println();
            } else {
                System.out.println("Invalid binary expression: " + input);
            }
        }
    }
}
