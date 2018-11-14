
/**
 *  Latch
 * 
 * @author Daniel Gerl, Sebastian Michel 
 */

public class Latch extends Gatter
{
    public Latch(int d){
        super(2,d);
    }
    
    //Berechnung der Initialwerte
    public void calculate(){
         if(Eingaenge[0].getValue()){
                Ausgang.setValue(Eingaenge[1].getValue());
         }
    }
    
    //Berechnung des Ausgangs und addieren der Zeitverzögerung
    public void calculate(int t){
        if(Eingaenge[0].getValue()){
                new Event(Ausgang, t + delay, Eingaenge[1].getValue());
         }
    }
}

