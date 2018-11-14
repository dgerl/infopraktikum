
/**
 * Positiv flankengesteuertes Flipflop
 * 
 * @author Daniel Gerl, Sebastian Michel
 */
public class FF extends Gatter
{
    private boolean clk;
   
    public FF(int d)
    {
        super(2,d);
        clk=false;
    }
    
    //Berechnung des Initialzustandes
    public void calculate(){
        if(Eingaenge[0].getValue()!= clk){
            clk=Eingaenge[0].getValue();
            if(clk){
                Ausgang.setValue(Eingaenge[1].getValue());
            }
        }

    }
    
    //Berechnen des Ausgangswertes und Verzögerung
    public void calculate(int t){
        //Überprüfen auf Zustandsänderung der Clk
        if(Eingaenge[0].getValue()!= clk){
            clk=Eingaenge[0].getValue();
            
            //Überprüfen auf Rising Edge und Erzeugen eines neuen Events
            if(clk){
                new Event(Ausgang, t + delay, Eingaenge[1].getValue());
            }

        }
    }
}
