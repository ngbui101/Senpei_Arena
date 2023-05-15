package game;

import fiend.*;
import hero.*;




import java.util.Map;
import java.util.Set;

public class Arena{
    Hero[] heros;

    Fiend[] fiends;

    public Arena(Hero[] heros, Fiend[] fiends) {
        this.heros = heros;
        this.fiends = fiends;
    }

    public Hero[] getHeros() {
        return heros;
    }

    public Fiend[] getFiends() {
        return fiends;
    }
}