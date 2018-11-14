
/**
 * Beschreiben Sie hier die Klasse Buf.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
import java.util.concurrent.TimeUnit;
public class Buf extends Gatter
{
   public Buf(int d){
       super(1,d);
    }
     public void calculate(){
       try{
            TimeUnit.MILLISECONDS.sleep(Delay);
        }catch(Exception e){
            System.out.println("fail in calculation");
        }
        Ausgang.setValue(Eingaenge[0].getValue());
    }
}
