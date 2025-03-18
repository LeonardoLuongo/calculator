package OperationMapper;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OperationMapperTest {

    @Test
    void testValidOperations() {
        OperationMapper mapper = new OperationMapper();

        assertEquals(1, mapper.getOperationValue("+"), "Expected ADD = 1");
        assertEquals(2, mapper.getOperationValue("-"), "Expected SUB = 2");
        assertEquals(3, mapper.getOperationValue("*"), "Expected MUL = 3");
        assertEquals(4, mapper.getOperationValue("/"), "Expected DIV = 4");
    }

    @Test
    void testInvalidOperation() {
        OperationMapper mapper = new OperationMapper();

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            mapper.getOperationValue("%"); // Invalid operator
        });

        assertEquals("Invalid operation: %", exception.getMessage());
    }
}

