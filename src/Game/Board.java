package Game;


import java.util.ArrayList;
import java.util.List;
/**
 * Class representing a GameBoard
 * @author Guillaume Vetter & Luca Reis de Carvalho & Claude-André Alves
 *
 */
public class Board {
    private ArrayList<Square> squares;

    /**
     * board constructor
     */
    public Board() {
        squares=new ArrayList<Square>();
        squares.add(new Square("Go"));
        for(int i= 1;i<40;i++){
            squares.add(new Square("Square "+i));
        }
    }

    /**
     * returns the square at the index or thows an exception if it's out of range
     * @param index
     * @return
     */
    public Square getSquare(int index){
        if(index>=squares.size()||index<0){
            throw new IllegalArgumentException("index not in the 0-39 range");
        }
        return squares.get(index);
    }


    /**
     * returns a square based on the previous location
     * 
     * @param oldLocation
     * @param offset
     * @return
     */
    public Square getSquare(Square oldLocation,int offset){
        int i= squares.indexOf(oldLocation);
        if(i==-1){
            throw new IllegalArgumentException("oldLocation does not exist");
        }else {
            return getSquare((i+offset)%40);
        }
    }

}
