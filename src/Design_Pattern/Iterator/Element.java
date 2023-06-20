package Design_Pattern.Iterator;

public class Element<T> {
    private T inhalt;

    public Element(T eingabe){
        inhalt = eingabe;
    }

    public T operation(){return inhalt;}
}
