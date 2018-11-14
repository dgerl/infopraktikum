/**
 * Beschreiben Sie hier die Klasse NAND.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Nand extends Gatter
{
   
    public Nand(int AnzahlEingaenge, int d){
        super(AnzahlEingaenge, d);
    }

   //Berechnung des Ausgangs und Addieren der Gatterverzögerung
    public void calculate(int t){
        boolean output = false;
        for(int i = 0; i<Eingaenge.length; i++){
            if(Eingaenge[i].getValue()) {
                output = false;
            }  else { 
                output = true; 
                break;
            }
        } 
        new Event(Ausgang, t+delay, output);
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
        Ausgang.setValue(output);
    }
}