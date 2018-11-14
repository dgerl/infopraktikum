/*
 * 
 */
import java.util.concurrent.TimeUnit;
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
        Queue.setEvent(this);
    }

    public static void setEventQueue(EventQueue eq)
    {
        Queue = eq;
    }

    public void propagate()
    {
      try{
          TimeUnit.MILLISECONDS.sleep(time);
       }catch(Exception e){
           System.out.println("fail in timing");
       }
       s.setValue(value);
    }
    
   
}
