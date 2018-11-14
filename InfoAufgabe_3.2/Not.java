
/**
 * Not- Gatter
 * 
 * @author Daniel Gerl, Sebastian Michel
 */
public class Not extends Gatter
{
    public Not(int d){
        super(1, d);
    }

    //Berechnung des Initialzustands
    public void calculate(){
        Ausgang.setValue(!Eingaenge[0].getValue());
    }

    //Erzeugt neues Event, addiert die Zeitverzögerung und invertiert den Eingang
    public void calculate(int t){
        new Event(Ausgang, t + delay, !Eingaenge[0].getValue());
    }
    
}