
/**
 * Beschreiben Sie hier die Klasse Nor.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
import java.util.concurrent.TimeUnit;
public class Nor extends Gatter
{
   public Nor(int AnzahlEingaenge, int d){
       super(AnzahlEingaenge, d);
    }
    
   public void calculate(){
       boolean output =false;
       for(int i = 0; i<Eingaenge.length; i++){
            if(Eingaenge[i].getValue()) {
                output = false;
                break;
            }  else { 
                output = true; 
            }
       }
       try{
            TimeUnit.MILLISECONDS.sleep(Delay);
        }catch(Exception e){
            System.out.println("fail in calculation");
        }
        Ausgang.setValue(output);
    }
    
}