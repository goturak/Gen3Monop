package Game;

/**
 * class representing a piece in a monopoly game
 * @author @author Guillaume Vetter & Luca Reis de Carvalho & Claude-André Alves
 */
public class Piece {
    private String name;

    /**
     * Piece Constructor
     * @param name Piece name
     */
    public Piece(String name) {
        this.name = name;
    }

    /**
     * Name getter
     * @return Piece name
     */
    public String getName() {
        return name;
    }
}
