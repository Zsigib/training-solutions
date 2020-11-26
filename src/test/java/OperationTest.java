import org.junit.jupiter.api.Test;
import week3.Operation;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperationTest {
    @Test
    void testGetResult(){
        Operation operation = new Operation("16+32");

        int result  = operation.getResult();

        assertEquals(48, result);
    }
}
