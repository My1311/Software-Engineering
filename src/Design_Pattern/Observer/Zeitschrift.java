package Design_Pattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class Zeitschrift implements IZeitschrift {
    private String titel;
    private List<Abonnent> abonnenten = new ArrayList<>();
    public void anmelden(Abonnent abonnent) {
         abonnenten.add(abonnent);
     }
    public void abmelden(Abonnent abonnent){
         abonnenten.remove(abonnent);
    }
    public void gibBenachrichtung() {
        for (Abonnent a : abonnenten) {
            a.aktualisieren(this);
        }
    }
    public void setTitel(String titel) {
        this.titel = titel;
    }
    public String getTitel() {
        return titel;
    }
}
