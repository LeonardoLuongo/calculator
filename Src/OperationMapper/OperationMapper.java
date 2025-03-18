package OperationMapper;

import java.util.HashMap;
import java.util.Map;

public class OperationMapper {
    // Define final constant values for operations
    public static final int ADD = 1;
    public static final int SUB = 2;
    public static final int MUL = 3;
    public static final int DIV = 4;

    // Map that associates a String operator with its corresponding constant value
    private final Map<String, Integer> operationMap;

    // Constructor that initializes and populates the map
    public OperationMapper() {
        operationMap = new HashMap<>();
        operationMap.put("+", ADD);
        operationMap.put("-", SUB);
        operationMap.put("*", MUL);
        operationMap.put("/", DIV);
    }

    /**
     * Returns the operation value for the given operator string.
     *
     * @param operator the operator string (e.g. "+", "-", "*", "/")
     * @return the corresponding constant value
     * @throws IllegalArgumentException if the operator is not supported
     */
    public int getOperationValue(String operator) {
        Integer value = operationMap.get(operator);
        if (value == null) {
            throw new IllegalArgumentException("Invalid operation: " + operator);
        }
        return value;
    }

    // Main method for simple testing
    public static void main(String[] args) {
        OperationMapper mapper = new OperationMapper();
        System.out.println("Operation '+' returns: " + mapper.getOperationValue("+")); // Should print 1
        System.out.println("Operation '-' returns: " + mapper.getOperationValue("-")); // Should print 2
        System.out.println("Operation '*' returns: " + mapper.getOperationValue("*")); // Should print 3
        System.out.println("Operation '/' returns: " + mapper.getOperationValue("/")); // Should print 4
    }
}
