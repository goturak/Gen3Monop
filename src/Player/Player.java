package Player;

/**
 * class representing a player in a monopoly game
 * @author @author Guillaume Vetter & Luca Reis de Carvalho & Claude-André Alves
 */
public class Player {
    private String name;

    /**
     * Player constructor
     * @param name Player name
     */
    public Player(String name) {
        this.name = name;
    }

    /**
     * Player getter
     * @return Player name
     */
    public String getName() {
        return name;
    }
}
