/*
 * 
 */

public class Event
{
    private static EventQueue Queue;
    
    private Signal s;
    private int time;
    private boolean value;
    
    public Event(Signal s, int t, boolean b)
    {
        this.s=s;
        time = t;
        value = b;
        Queue.addEvent(this);
    }

    public static void setEventQueue(EventQueue eq)
    {
        Queue = eq;
    }
    
    //Getter-Methoden
    public int getTime(){
        return time;   
    }
    
    public boolean getValue(){
        return value;
    }
    
    //Propagieren der Änderung
    public void propagate()
    {
       s.setValue(value, time);
    }
    
   
}
