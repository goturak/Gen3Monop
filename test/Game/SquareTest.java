package Game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class SquareTest {

    @Test
    void SquareReturnsCorrectName(){
        Square s = new Square("Go");
        assertEquals(s.getName(),"Go");

        Square s12 = new Square("Square 12");
        assertEquals(s12.getName(),"Square 12");
    }
}
