package obligatorio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Properties;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class Sistema {

    private ArrayList<Restaurante> lstRestaurantes;
    private ArrayList<Evaluacion> lstEvaluacion;
    private ArrayList<Evaluacion> lstEvaluacionSorteo;
    private Correo miCorreo;
    private ArrayList<Sorteo> lstSorteos;

    public Sistema() {
        this.lstRestaurantes = new ArrayList();
        this.lstEvaluacion = new ArrayList();
        lstEvaluacionSorteo = new ArrayList();
        this.lstSorteos = new ArrayList();
    }

    public ArrayList<Restaurante> getLstRestaurantes() {
        return lstRestaurantes;
    }

    public ArrayList<Evaluacion> getLstEvaluacion() {
        return lstEvaluacion;
    }

    public ArrayList<Evaluacion> getLstEvaluacionSorteo() {
        return lstEvaluacionSorteo;
    }

    public Correo getCorreo() {
        return this.miCorreo;
    }

    public void setCorreo(Correo unCorreo) {
        this.miCorreo = unCorreo;
    }

    public ArrayList<Sorteo> getLstSorteos() {
        return lstSorteos;
    }

    public boolean validarStringNoVacio(String dato, int min, int max) {
        boolean ok;
        ok = false;
        try {
            if (dato.length() > min && dato.length() < max) {
                ok = true;
            }
        } catch (Exception e) {

        }
        return ok;
    }

    public boolean estaRestaurante(String dir) {
        boolean esta;
        esta = false;
        for (int i = 0; i < lstRestaurantes.size(); i++) {
            if (lstRestaurantes.get(i).getDireccion().equalsIgnoreCase(dir)) {
                esta = true;
            }
        }

        return esta;
    }
    
    public boolean validarFecha(String fecha) {
        boolean ok = false;
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
            formatoFecha.setLenient(false);
            formatoFecha.parse(fecha);
            return true;

        } catch (Exception e) {
            return false;
        }

    }

    public boolean validarNumero(int num, int min, int max) {
        boolean ok;
        ok = false;
        try {
            if (num > min && num < max) {
                ok = true;
            }
        } catch (NumberFormatException e) {

        }
        return ok;
    }
    
    public boolean comparaFechas(String fecha, String fecha2) {
        //Retorna TRUE si la primera es mas chica que la segunda
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        boolean ok;
        ok = false;
        Date f = null;
        try {
            f = sdf.parse(fecha);
        } catch (ParseException ex) {
            ok = false;
        }

        Date s = null;

        try {
            s = sdf.parse(fecha2);
        } catch (ParseException ex) {
            ok = false;
        }

        if (f != null && s != null) {
            if (s.compareTo(f) > 0) {
                ok = true;
            }
            if (s.compareTo(f) < 0) {
                ok = false;
            }
        }

        return ok;
    }

    public boolean estaEvaluacionSorteo(String mail, String dir) {
        boolean esta;
        esta = false;
        for (int i = 0; i < this.getLstEvaluacionSorteo().size(); i++) {
            Evaluacion aux;
            aux = this.getLstEvaluacionSorteo().get(i);
            if (aux.getMail().equalsIgnoreCase(mail)) {
                if (aux.getUnRestaurante().getDireccion().equalsIgnoreCase(dir)) {

                    esta = true;
                }
            }
        }
        return esta;
    }

    public boolean enviarCorreo(Correo correo) {
        try {
            Properties p = new Properties();
            p.put("mail.smtp.host", "smtp.gmail.com");
            p.setProperty("mail.smtp.starttls.enable", "true");
            p.setProperty("mail.smtp.port", "587");
            p.setProperty("mail.smtp.user", correo.getUsuarioCorreo());
            p.setProperty("mail.smtp.auth", "true");

            Session session = Session.getDefaultInstance(p, null);
            BodyPart texto = new MimeBodyPart();
            texto.setText(correo.getMensaje());

            MimeMultipart m = new MimeMultipart();
            m.addBodyPart(texto);
            MimeMessage mensaje = new MimeMessage(session);
            mensaje.setFrom(new InternetAddress(correo.getUsuarioCorreo()));
            mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(correo.getDestino()));
            mensaje.setSubject(correo.getAsunto());
            mensaje.setContent(m);

            Transport transport = session.getTransport("smtp");
            transport.connect(correo.getUsuarioCorreo(), correo.getContrasenia());
            transport.sendMessage(mensaje, mensaje.getAllRecipients());
            transport.close();
            return true;
        } catch (Exception e) {
            return false;
        }

    }
}
