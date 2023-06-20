package Design_Pattern.Template;

public class Filterkaffee extends Kaffeezubereitung {

    @Override
    protected void tasseHinstellen() {
        System.out.println("Grosse Kanne");
    }

    @Override
    protected void knopfDrucken() {
        System.out.println("Filter Kaffee");
    }
}
