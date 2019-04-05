package Game;

import java.util.Random;

public class Die {
    private int faceValue = 0;

    public Die(){}

    public void roll(){
        Random r = new Random();
        faceValue = r.nextInt(6) + 1;
    }

    public int getFaceValue() {
        return faceValue;
    }
}
