import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

import fiend.*;
import game.*;
import hero.*;

public class Main{

    public static void main(String[] args)
    {
    	SpawnEngine spawnEngine = new SpawnEngine();
        Hero[] heros = HeroCreator.createHeros();
        Fiend[] enemies = new Fiend[3];
        enemies[0] = spawnEngine.spawn();
        enemies[1] = spawnEngine.spawn();
        enemies[2] = spawnEngine.spawn();
        Arena arena = new Arena(heros,enemies);
        Game game = new Game(arena);
        game.iterate();				//1.Runde
        game.iterate();				//2.Runde
        
        PrintWriter p = null;;
		try {
			p = new PrintWriter(new FileWriter("GameHistory.txt"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
       
        
        
        for(Hero e : arena.getHeros())
        {
            e.print();
            p.print(e.save());
        }

        for(Fiend f : arena.getFiends())
        {
            f.print();
            p.print(f.save());
        }
        p.close();
    }

}