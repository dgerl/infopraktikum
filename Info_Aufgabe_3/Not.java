

    
import java.util.concurrent.TimeUnit;
public class Not extends Gatter
{
   public Not(int d){
       super(1, d);
    }
    
   public void calculate(){
       try{
            TimeUnit.MILLISECONDS.sleep(Delay);
        }catch(Exception e){
            System.out.println("fail in calculation");
        }
        Ausgang.setValue(!Eingaenge[0].getValue());
    }
    
}
        
   

