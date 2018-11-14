
/**
 * Beschreiben Sie hier die Klasse Or.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

import java.util.concurrent.TimeUnit;
public class Or extends Gatter
{
   public Or(int AnzahlEingaenge, int d){
       super(AnzahlEingaenge, d);
    }
    
   public void calculate(){
       boolean output =false;
       for(int i = 0; i<Eingaenge.length; i++){
            if(Eingaenge[i].getValue()) {
                output = true;
                break;
            }  else { 
                output = false; 
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