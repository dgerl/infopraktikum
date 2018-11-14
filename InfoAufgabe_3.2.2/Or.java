
/**
 * Beschreiben Sie hier die Klasse Or.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

public class Or extends Gatter
{
    public Or(int AnzahlEingaenge, int d){
        super(AnzahlEingaenge, d);
    }

    public void calculate(int t){
        boolean output = false;
        for(int i = 0; i<Eingaenge.length; i++){
            if(Eingaenge[i].getValue()) {
                output = true;
                break;
            }  else { 
                output = false;
            }
        }
        new Event(Ausgang, t + delay, output);
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
        Ausgang.setValue(output);
    }

}