
/**
* Beschreiben Sie hier die Klasse Exor.
* 
* @author (Ihr Name) 
* @version (eine Versionsnummer oder ein Datum)
*/
public class Exor extends Gatter
{
public Exor(int AnzahlEingaenge, int d){
super(AnzahlEingaenge, d);
}

public void calculate(){
boolean output = false;
for(int i = 0; i<Eingaenge.length; i++){
if(Eingaenge[i].getValue()) {
output = !output;
} 
}
Ausgang.setValue(output);
}

}