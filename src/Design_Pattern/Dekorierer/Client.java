package Design_Pattern.Dekorierer;
public class Client {
    public static void main(String[] args) {
        Kaffee kaffee = new EinfacherKaffee();
        System.out.println(kaffee.getBeschreibung());
        System.out.println("Preis für einfachen Kaffee ist: " + kaffee.preis());

        Kaffee mitMichschaumKaffee = new Milchschaum(kaffee);
        System.out.println(mitMichschaumKaffee.getBeschreibung());
        System.out.println(mitMichschaumKaffee.preis());

        Kaffee mitSchokoSirupKaffee = new Schokoladensirup(kaffee);
        System.out.println(mitSchokoSirupKaffee.getBeschreibung());
        System.out.println(mitSchokoSirupKaffee.preis());

        Kaffee mitBeideDekoKaffee = new Milchschaum(new Schokoladensirup(kaffee));
        System.out.println(mitBeideDekoKaffee.getBeschreibung());
        System.out.println(mitBeideDekoKaffee.preis());
    }
}
