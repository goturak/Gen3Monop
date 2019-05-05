package Game;

import Player.Player;

/**
 * represents the income tax square
 *
 */
public class IncomeTaxSquare extends Square {
    /**
     * Constructs a Square with a name
     *
     * @param name String name
     */
    public IncomeTaxSquare(String name) {
        super(name);
    }

    /**
     * taxes player p for 10% of his Networth or 200$ 
     * @param p
     */
    @Override
    public void landedOn(Player p) {
        int w= p.getNetWorth();
        p.reduceCash(Math.min((int) (w*0.1f),200));
    }
}
