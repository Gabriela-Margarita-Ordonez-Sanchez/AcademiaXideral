public class InyeccionDependencias {
    public static void main(String[] args) {
        EmailSender sender = new EmailSender();
        EmailService servicio = new EmailService(sender); // Inyección de dependencia
        servicio.enviar(); 
    }
}

class EmailSender {
    public void enviarCorreo() {
        System.out.println("Correo enviado exitosamente.");
    }
}

class EmailService {
    private EmailSender emailSender;

    // Por constructor
    public EmailService(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void enviar() {
        emailSender.enviarCorreo();
    }
}
