package Game;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class DieTest {
    @RepeatedTest(10)
    public void dieHasValueBetweenOneAndSix(){
        Die d = new Die();
        d.roll();
        assertFalse(d.getFaceValue() < 1 || d.getFaceValue() > 6);
    }

    @Test
    public void dieHas0ValueAfterInit(){
        Die d = new Die();
        assertEquals(0, d.getFaceValue());
        d.roll();
        assertNotEquals(0, d.getFaceValue());
    }
}
