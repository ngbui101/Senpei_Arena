package game;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class GameObject implements Attackable, Attack {
	String[] actionHistory = new String[30];
	int historyIndex = 0;
	
    protected void logAction(String s)
    {
    	if(historyIndex>=30)
    	{
    		System.out.println("history full");
    		return;
    	}
    	
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date now = new Date(System.currentTimeMillis());
        String strDate = sdf.format(now);
        actionHistory[historyIndex]=(strDate+": "+s);
        historyIndex++;
    }
    
    public void print()
    {
        String s = "";

        for(String s_ : actionHistory)
        {
        	if(s_ != null)
        	{
        		s += s_+"\n";
        	}
        }

        System.out.print(s);
    }
    public String save()
    {
        String s = "";

        for(String s_ : actionHistory)
        {
        	if(s_ != null)
        	{
        		s += s_+"\n";
        	}
        }

        return s;
    }
}
