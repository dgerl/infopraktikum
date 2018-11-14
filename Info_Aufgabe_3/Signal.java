import java.util.ArrayList;
/**
 * Beschreiben Sie hier die Klasse Signal.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

public class Signal
{
    // alle in der Klasse vorkommenden Attribute werden deklariert.
    private String Bezeichnung;
    private boolean Wert;
    private ArrayList<Gatter> Inputs;
    private long start;

    /**
     * Konstruktor für Objekte der Klasse Signal
     */
    public Signal(String parameter){
        // Namenvergabe
        Bezeichnung = parameter;
        //Erstellen der Liste
        Inputs = new ArrayList<Gatter>();
        start=System.currentTimeMillis();
    }

    public void setValue(boolean value){
        if(Wert!=value){
            // Wertzuweisung
            Wert = value;
            // Mitteilung der Zustandsänderung
            for(Gatter n: Inputs) {
                n.calculate();
            }
        }
        long l = System.currentTimeMillis()-start;
        System.out.println(l + " " + Bezeichnung + "->" + Wert);
    }

    public void setConnection(Gatter n){ 
        Inputs.add(n);
    }

    public boolean getValue(){
        return Wert;
    }
}
