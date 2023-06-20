package Design_Pattern.Observer;

public class ZeitschriftAbonnent implements Abonnent {
    private String name;
    public ZeitschriftAbonnent(String name){
        this.name = name;
    }
    // Hier benutze ich IZeitschrift als Parameter (nicht Klasse Zeitschrift), weil in der Zukunft
    // ist es erlaubt mir, alle Zeitschrift Klasse, die von IZeitschrift hier zu benutzen.
    // Mit nur Klasse Zeitschrift kann ich nur diese Klasse benutzen.
    @Override
    public void aktualisieren(IZeitschrift ausgabe) {
        System.out.println("Neue Nachricht fuer " + name + ".");
        System.out.println("Eine neue Ausgabe: " + ausgabe.getTitel());
    }
}
