import java.util.concurrent.TimeUnit;
/**
 * Beschreiben Sie hier die Klasse NAND.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Nand extends Gatter
{
   
    /**
     * Konstruktor für Aufgabe 2, RS-Latch-Simulation
     */
    public Nand(int AnzahlEingaenge, int d){
        super(AnzahlEingaenge,d);
    }

    public void calculate(){
        boolean output = false;
        for(int i = 0; i<Eingaenge.length; i++){
            if(Eingaenge[i].getValue()) {
                output = false;
            }  else { 
                output = true; 
                break;
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
