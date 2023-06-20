package Design_Pattern.Template;

public  abstract class Kaffeezubereitung {
    public final void kaffeeMachen(){
        wasserAuffuellen();
        maschinenAktivieren();
        tasseHinstellen();
        knopfDrucken();
    }
    private void wasserAuffuellen(){
        System.out.println("Wasser auffuellen");
    }
    private void maschinenAktivieren(){
        System.out.println("Maschine ist an");
    }
    abstract protected void tasseHinstellen();
    abstract protected void knopfDrucken();
}
