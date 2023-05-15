package fiend;

import game.*;
import hero.*;



public abstract class Fiend extends GameObject{
    protected int health;

    public Fiend(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(health < 0)
        {
            this.health = 0;
            return;
        }
        this.health = health;
    }

}
