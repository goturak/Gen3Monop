package Player;

import Game.*;

import java.util.ArrayList;

/**
 * class representing a player in a monopoly game
 * @author @author Guillaume Vetter & Luca Reis de Carvalho & Claude-André Alves
 */
public class Player {
    private String name;
    private Piece piece;
    private Board board;
    private ArrayList<Die> dice;

    public Player(String name) {
        this.name = name;
    }
    /**
     * Player constructor
     * @param name Player name
     */
    public Player(String name, String piece, Board board, ArrayList<Die> dice) {
        this.piece = new Piece(piece, board.getSquare(0));
        this.board = board;
        this.dice = dice;
        this.name = name;
    }

    /**
     * Player getter
     * @return Player name
     */
    public String getName() {
        return name;
    }

    /**
     *
     */
    public void takeTurn() {
        Die d1 = new Die();
        Die d2 = new Die();
        Board b = new Board();

        d1.roll();
        d2.roll();
    }
}
