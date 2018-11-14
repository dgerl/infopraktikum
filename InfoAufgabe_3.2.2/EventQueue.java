import java.util.LinkedList;
import java.util.ListIterator;

public class EventQueue
{
    private LinkedList<Event> queue;

    public EventQueue()
    {
        queue = new LinkedList<Event>();     
    }

    public void addEvent(Event e)
    {
        ListIterator it = queue.listIterator();
        if(queue.size()!=0){

            while(it.hasNext()&&((Event) it.next()).getTime()<e.getTime());

        }
        it.add(e);
    }

    public Event getFirst()
    {
        return queue.pollFirst();
    }

    public boolean hasMore()
    {
        return queue.size()>0;
    }  

}
