package hero;

import fiend.*;
import game.*;

public class Knight extends Hero {
    protected static final int DAMAGE = 10;
    public Knight(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack(GameObject h){
        h.sustainDamage(DAMAGE);
        logAction("Hero: "+getName()+" attacks Fiend "+h.getClass()+" Health: "+((Fiend) h).getHealth());
        }

    @Override
    public void sustainDamage(int damage) {
        this.setHealth(this.getHealth()-damage);
    }
}
