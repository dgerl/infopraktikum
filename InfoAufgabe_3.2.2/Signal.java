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
        if(Wert!=value)
        {
            // Wertzuweisung
            Wert = value;
            // Mitteilung der Zustandsänderung
            for(Gatter n: Inputs) {
                n.calculate(t);
            }
        }
        /*if(Bezeichnung.equals("Out")||Bezeichnung.equals("Out0")||Bezeichnung.equals("Out1")||Bezeichnung.equals("Out2")||Bezeichnung.equals("Out3")||Bezeichnung.equals("memOut0")||Bezeichnung.equals("memOut1")||Bezeichnung.equals("memOut2")||Bezeichnung.equals("CntAddr0")||Bezeichnung.equals("CntAddr1")||Bezeichnung.equals("CntAddr2"))
        {
        if(Wert){
        System.out.println("[" + t +"]" + Bezeichnung + "->" + 1);
        }else{
        System.out.println("[" + t +"]" + Bezeichnung + "->" + 0);
        }
        }
         */
        if(Wert){
            System.out.println("[" + t +"]" + Bezeichnung + "->" + 1);
        }else{
            System.out.println("[" + t +"]" + Bezeichnung + "->" + 0);
        }
    }

    public void setValue(boolean value){
        
            // Wertzuweisung
            Wert = value;
            // Mitteilung der Zustandsänderung
            for(Gatter n: Inputs) {
                n.calculate();
            }
        
        /*if(Bezeichnung.equals("Out")||Bezeichnung.equals("Out0")||Bezeichnung.equals("Out1")||Bezeichnung.equals("Out2")||Bezeichnung.equals("Out3")||Bezeichnung.equals("memOut0")||Bezeichnung.equals("memOut1")||Bezeichnung.equals("memOut2")||Bezeichnung.equals("CntAddr0")||Bezeichnung.equals("CntAddr1")||Bezeichnung.equals("CntAddr2")||Bezeichnung.equals("Clk"))
        {
        if(Wert){
        System.out.println(Bezeichnung + "->" + 1);
        }else{
        System.out.println(Bezeichnung + "->" + 1);
        }
        }
         */
        if(Wert){
            System.out.println(Bezeichnung + "->" + 1);
        }else{
            System.out.println(Bezeichnung + "->" + 1);
        }
    }

    public void setConnection(Gatter n){ 
        Inputs.add(n);
    }

    public boolean getValue(){
        return Wert;
    }
}

