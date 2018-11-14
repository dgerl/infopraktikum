/**
 * Beschreiben Sie hier die Klasse And.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
import java.util.concurrent.TimeUnit;
public class And extends Gatter
{
   public And(int AnzahlEingaenge, int d){
       super(AnzahlEingaenge, d);
    }
    
   public void calculate(){
       boolean output =false;
       for(int i = 0; i<Eingaenge.length; i++){
            if(Eingaenge[i].getValue()) {
                output = true;
            }  else { 
                output = false; 
                break;
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
