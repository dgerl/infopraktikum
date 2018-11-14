
/**
 * Beschreiben Sie hier die Klasse Gatter.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Gatter
{
    protected Signal[] Eingaenge;
    protected Signal Ausgang;
    protected int Delay;
   public Gatter(int AnzahlEingaenge, int d){
       Eingaenge = new Signal[AnzahlEingaenge];
       Delay = d;
    }
    
    public void setOutput(Signal Ausgang){
        this.Ausgang = Ausgang;
    }
    
    public void setInput(int Index, Signal Input){
        Eingaenge[Index] = Input;
        Input.setConnection(this);
    }
    
    public void calculate(){
    }
}
