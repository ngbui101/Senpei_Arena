package hero;

import fiend.*;
import game.*;

public class Mage extends Hero {
    protected static final int DAMAGE = 2;
    public Mage(String name, int health) {
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
