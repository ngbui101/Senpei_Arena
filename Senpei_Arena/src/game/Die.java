package game;

import java.util.Random;
import fiend.*;
import hero.*;

public class Die {
    protected int sides;

    public Die(int sides) {
        this.sides = sides;
    }

    public int throwDie()
    {
        Random r = new Random();
        return r.nextInt(sides)+1;
    }
}
