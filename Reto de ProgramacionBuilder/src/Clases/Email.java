package Clases;

import java.io.File;
import java.util.List;

public class Email {
    private List<String> destinatarios;
    private String asunto;
    private String cuerpo;
    private List<File> adjuntos;

    public Email(List<String> destinatarios, String asunto, String cuerpo, List<File> adjuntos) {
        this.destinatarios = destinatarios;
        this.asunto = asunto;
        this.cuerpo = cuerpo;
        this.adjuntos = adjuntos;

    }

    public List<String> getDestinatarios() {
        return destinatarios;
    }

    public String getAsunto() {
        return asunto;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public List<File> getAdjuntos() {
        return adjuntos;
    }
}
