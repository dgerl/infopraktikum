
/**
 * Beschreiben Sie hier die Klasse And.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

public class And extends Gatter
{  
    private int delay;
    public And(int AnzahlEingaenge, int d){
        super(AnzahlEingaenge, d);
    }

    public void calculate(int t){
        boolean output = false;
        for(int i = 0; i<Eingaenge.length; i++){
            if(Eingaenge[i].getValue()) {
                output = true;
            }  else { 
                output = false; 
                break;
            }
        }
        new Event(Ausgang, t + delay, output);

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
        Ausgang.setValue(output);
    }

}
