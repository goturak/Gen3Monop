package Game;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import sun.security.util.Cache;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTest {
    static Board board;
    @BeforeAll
    static void BuildBoard(){
        board= new Board();
    }

    @Test
    void TheFirstSquareIsGo(){
        Square go= board.getSquare(0);
        assertEquals("Go",go.getName());
    }

    @Test
    void GetSquareRelativeToOtherWorks(){
        Square go= board.getSquare(0);
        Square next = board.getSquare(go,1);
        assertEquals("Square 1",next.getName());
        Square lastSquare= board.getSquare(39);
        next = board.getSquare(lastSquare,1);
        assertEquals("Go",next.getName());
    }

}
