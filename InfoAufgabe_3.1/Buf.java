
/**
 * Buf-Gatter
 * 
 * @author Daniel Gerl, Sebastian Michel
 */
public class Buf extends Gatter
{
   public Buf(int d){
       super(1,d);
    }
    //Berechnung des Initialzustands
     public void calculate(){
        Ausgang.setValue(Eingaenge[0].getValue());
    }
    
    //Erzeugt neues Event und addiert die Zeitverzögerung
    public void calculate(int t){
        new Event(Ausgang, t+delay, Eingaenge[0].getValue());
    }
}
