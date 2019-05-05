package Game;

import Player.Player;

/**
 * represents go to jail square
 */
public class GoToJailSquare extends Square {
    Square jail;

    /**
     * creates a go to jail with a name and a Square j to transport the landing player on
     * @param name
     * @param j
     */
    public GoToJailSquare(String name,Square j) {
        super(name);
        jail=j;
    }

    /**
     * transports the player p to jail
     * @param p
     */
    @Override
    public void landedOn(Player p) {
        p.setLocation(jail);
    }
}
