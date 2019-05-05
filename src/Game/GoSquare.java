package Game;

import Player.Player;

/**
 * represents to go square
 */
public class GoSquare extends Square {
    /**
     * Constructs a Square with a name
     *
     *
     */
    public GoSquare() {
        super("GO");
    }

    /**
     * Adds 200 to player p's cash
     * @param p
     */
    @Override
    public void landedOn(Player p) {
        p.addCash(200);
    }
}
