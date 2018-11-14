
/**
 * Beschreiben Sie hier die Klasse Latch.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
import java.util.concurrent.TimeUnit;
public class Latch extends Gatter
{
    public Latch(int d){
        super(2,d);
    }
    
    public void calculate(){
         if(Eingaenge[0].getValue()){
                try{
                    TimeUnit.MILLISECONDS.sleep(Delay);
                }catch(Exception e){
                    System.out.println("fail in calculation");
                }
                Ausgang.setValue(Eingaenge[1].getValue());
         }
    }
}

