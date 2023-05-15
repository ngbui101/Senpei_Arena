package fiend;

import game.*;
import hero.*;

public class Spider extends Fiend {
    protected static final int DAMAGE = 2;

    public Spider(int health) {
        super(health);
    }

    @Override
    public void attack(GameObject h){
        h.sustainDamage(DAMAGE);
        logAction("Fiend: "+this.getClass()+" attacks Hero "+((Hero) h).getName()+" Health: "+((Hero) h).getHealth());
    }

    @Override
    public void sustainDamage(int damage) {
        this.setHealth(this.getHealth()-damage);
    }
}
