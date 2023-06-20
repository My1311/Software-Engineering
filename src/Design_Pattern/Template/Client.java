package Design_Pattern.Template;

public class Client {
    public static void main(String[] args) {
        Kaffeezubereitung kaffe1 = new Filterkaffee();
        Kaffeezubereitung kaffe2 = new Espresso();
        Kaffeezubereitung kaffe3 = new Cappuccino();

        kaffe1.kaffeeMachen();
        kaffe2.kaffeeMachen();
        kaffe3.kaffeeMachen();
    }
}
