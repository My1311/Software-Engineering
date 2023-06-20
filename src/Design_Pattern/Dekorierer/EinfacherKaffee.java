package Design_Pattern.Dekorierer;

public class EinfacherKaffee extends Kaffee{
    public EinfacherKaffee (){
        this.beschreibung = "Einfacher Kaffee";
    }
    @Override
    double preis() {
        return 1.5;
    }
    @Override
    String getBeschreibung() {
        return this.beschreibung;
    }
}
