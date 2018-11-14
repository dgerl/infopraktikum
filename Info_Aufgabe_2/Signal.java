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

    /**
     * Konstruktor für Objekte der Klasse Signal
     */
    public Signal(String parameter){
        // Namenvergabe
        Bezeichnung = parameter;
        //Erstellen der Liste
        Inputs = new ArrayList<Gatter>();

    }

    public void setValue(boolean value, int t){
        if(Wert!=value){
            // Wertzuweisung
            Wert = value;
            // Mitteilung der Zustandsänderung
            for(Gatter n: Inputs) {
                n.calculate(t);
            }
        }
        if (Bezeichnung.equals("Q")||Bezeichnung.equals("nQ")||Bezeichnung.equals("S")||Bezeichnung.equals("R")){
            System.out.println("[" + t +"]" + Bezeichnung + "->" + Wert);
        }
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
        if (Bezeichnung.equals("s0")||Bezeichnung.equals("s1")||Bezeichnung.equals("Q")||Bezeichnung.equals("nQ")||Bezeichnung.equals("S")||Bezeichnung.equals("R")){
            System.out.println(Bezeichnung + "->" + Wert);
        }
    }

    public void setConnection(Gatter n){ 
        Inputs.add(n);
    }

    public boolean getValue(){
        return Wert;
    }
}

