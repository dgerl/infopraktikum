import java.util.ArrayList;

public class EventQueue
{
    private ArrayList<Event> queue;
    public EventQueue()
    {
        queue = new ArrayList<Event>();     
    }
    
    public void setEvent(Event e)
    {
        queue.add(e);
    }
    
    public Event getFirst()
    {
        Event e= queue.get(0);
        queue.remove(0);
        return e;
    }
    
    public boolean hasMore()
    {
        return !queue.isEmpty();
    }  
}
