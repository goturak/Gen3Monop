package Game;

/**
 * Class representing a Square on the game board
 * @author Guillaume Vetter & Luca Reis de Carvalho & Claude-André Alves
 *
 */
public class Square {
    private String name;

    /**
     * Constructs a Square with a name
     * @param name String name
     */
    public Square(String name) {
        this.name = name;
    }

    /**
     * name getter
     * @return the name of the Square
     */
    public String getName() {
        return name;
    }
}
