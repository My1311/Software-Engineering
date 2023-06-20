package Design_Pattern.Command;

public class TVAusschaltenCommand implements Command{
    @Override
    public void ausfuehren() {
        System.out.println("TV ist aus.");
    }
}
