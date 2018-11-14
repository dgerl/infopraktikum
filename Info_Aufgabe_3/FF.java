
/**
 * Beschreiben Sie hier die Klasse FF.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
import java.util.concurrent.TimeUnit;
public class FF extends Gatter
{
    private boolean clk;
    /**
     * Konstruktor für Objekte der Klasse FF
     */
    public FF(int d)
    {
        super(2,d);
        clk=false;
    }

    public void calculate(){
        if(Eingaenge[0].getValue()!= clk){
            clk=Eingaenge[0].getValue();
            if(clk){
                try{
                    TimeUnit.MILLISECONDS.sleep(Delay);
                }catch(Exception e){
                    System.out.println("fail in calculation");
                }
                Ausgang.setValue(Eingaenge[1].getValue());
            }
        }
         
    }
}
