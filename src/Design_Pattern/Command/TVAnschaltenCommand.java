package Design_Pattern.Command;

public class TVAnschaltenCommand implements Command{
    @Override
    public void ausfuehren() {
        System.out.println("TV ist an.");
    }
}
