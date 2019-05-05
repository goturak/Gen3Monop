package Player;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {
    @Test
    public void testPlayerGetName() {
        Player p1 = new Player("John");
        assertEquals("John", p1.getName());
        assertNotEquals("john", p1.getName());
    }
    @Test
    public void testTakeTurn() {

    }

}
