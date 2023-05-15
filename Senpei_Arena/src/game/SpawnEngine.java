package game;

import fiend.*;
import hero.*;

public class SpawnEngine {
    public Fiend spawn()
    {
        return new Spider(20);
    }
}
