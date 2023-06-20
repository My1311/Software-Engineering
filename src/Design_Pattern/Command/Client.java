package Design_Pattern.Command;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Client {
    public static void main(String[] args) {
        Fernbedienung f1 = new Fernbedienung();
        f1.setCommand( new TVAnschaltenCommand());
        f1.aktivieren();
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_TIME) + " Uhr");
        f1.setCommand(new TVAusschaltenCommand());
        f1.aktivieren();
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_TIME) + " Uhr");
    }
}
