package Design_Pattern.Command;

public class Fernbedienung {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }
    public void aktivieren(){
        command.ausfuehren();
    }
}
