package Design_Pattern.Template;

public class Cappuccino extends Kaffeezubereitung{
    @Override
    protected void tasseHinstellen() {
        System.out.println("Mittle Tasse");
    }

    @Override
    protected void knopfDrucken() {
        System.out.println("Cappuccino");
    }
}
