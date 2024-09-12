import Clases.Email;
import Clases.EmailBuilder;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        EmailBuilder builder = new EmailBuilder();
        Email email = builder
                .addDestinatario("Nix1314@gmail.com")
                .addDestinatario("Juarez2002@gmail.com")
                .setAsunto("Ejemplo")
                .setCuerpo("Prueba del codigo del email")
                .addAdjunto(new File("C:\\Users\\tgpp1\\OneDrive\\Escritorio\\Reto de ProgramacionBuilder"))
                .addAdjunto(new File("C:\\Users\\tgpp1\\OneDrive\\Escritorio\\Reto de ProgramacionBuilder"))
                .build();
        System.out.println(email.getDestinatarios());
        System.out.println(email.getAsunto());
        System.out.println(email.getCuerpo());
        System.out.println(email.getAdjuntos());
    }
}