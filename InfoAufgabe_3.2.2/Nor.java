
/**
 * Beschreiben Sie hier die Klasse Nor.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

public class Nor extends Gatter
{  
    private int delay;
    public Nor(int AnzahlEingaenge, int d){
        super(AnzahlEingaenge, d);
    }

    public void calculate(int t){
        boolean output = false;
        for(int i = 0; i<Eingaenge.length; i++){
            if(Eingaenge[i].getValue()) {
                output = false;
                break;
            }  else { 
                output = true; 
            }
        }
        new Event(Ausgang, t + delay, output);

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

        Ausgang.setValue(output);
    }

}