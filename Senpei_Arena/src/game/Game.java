package game;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import fiend.*;
import hero.*;

public class Game {
    protected Arena arena;

    public Game(Arena arena) {
        this.arena = arena;
    }

    public void iterate()
    {
    	int enemyCount = arena.getFiends().length;
        int heroCount = arena.getHeros().length;
        Die fiendDie = new Die(enemyCount);
        Die heroDie = new Die(heroCount);

        Fiend[] fiends = arena.getFiends();
        Hero[] heros = arena.getHeros();
        
        for(Hero e : heros)
        {
            int result = fiendDie.throwDie()-1;
            e.attack( fiends[result] );
        }

        for(Fiend f : fiends)
        {
            int result = heroDie.throwDie()-1;
            f.attack( heros[result] );
        }
        
    }
    
}
