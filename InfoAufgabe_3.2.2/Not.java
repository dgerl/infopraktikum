
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
        boolean output= !Eingaenge[0].getValue();
        System.out.println("Not");
        Ausgang.setValue(output);
    }

    //Erzeugt neues Event, addiert die Zeitverzögerung und invertiert den Eingang
    public void calculate(int t){
        new Event(Ausgang, t + delay, !Eingaenge[0].getValue());
    }
    
}