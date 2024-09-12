package Clases;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class EmailBuilder {
    private List<String> destinatarios;
    private String asunto;
    private String cuerpo;
    private List<File> adjuntos;

    public EmailBuilder() {
        this.destinatarios = new ArrayList<String>();
        this.adjuntos = new ArrayList<>();
    }

    public EmailBuilder addDestinatario(String destinatario) {
        this.destinatarios.add(destinatario);
        return this;
    }

    public EmailBuilder setAsunto(String asunto) {
        this.asunto = asunto;
        return this;
    }

    public EmailBuilder setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
        return this;
    }

    public EmailBuilder addAdjunto(File adjunto) {
        this.adjuntos.add(adjunto);
        return this;
    }

    public Email build() {
        if (this.destinatarios.isEmpty()) {
            throw new RuntimeException("Debe agregar al menos un destinatario");
        }
        if (this.asunto == null || this.asunto.trim().isEmpty()) {
            throw new RuntimeException("Debe agregar un asunto");
        }
        if (this.cuerpo == null || this.cuerpo.trim().isEmpty()) {
            throw new RuntimeException("Debe agregar un cuerpo");
        }
        return new Email(this.destinatarios, this.asunto, this.cuerpo, this.adjuntos);
    }
}
