package Design_Pattern.Observer;

public interface IZeitschrift {
    public void anmelden(Abonnent abonnent);
    public void abmelden(Abonnent abonnent);
    public void gibBenachrichtung();
    public String getTitel();

}
