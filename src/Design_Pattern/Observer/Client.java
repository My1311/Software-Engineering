package Design_Pattern.Observer;

public class Client {
    public static void main(String[] args) {
        ZeitschriftAbonnent john = new ZeitschriftAbonnent("John");
        ZeitschriftAbonnent olivia = new ZeitschriftAbonnent("Olivia");

        Zeitschrift z = new Zeitschrift();
        z.anmelden(john);
        z.anmelden(olivia);

        z.setTitel("Hallo");
        z.gibBenachrichtung();
    }
}
