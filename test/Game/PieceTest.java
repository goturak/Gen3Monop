package Game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PieceTest {
    @Test
    public void testPieceGetName() {
        Piece p1 = new Piece("Pony");
        assertEquals("Pony", p1.getName());
        assertNotEquals("Cat", p1.getName());
    }
}
