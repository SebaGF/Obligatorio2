package obligatorio;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.Icon;

public class Evaluacion {

    private int catnidadEstrellas;
    private String reseña;
    private String nombre;
    private String mail;
    private Restaurante unRestaurante;
    private String fecha;

    public Evaluacion() {
        this.catnidadEstrellas = 0;
        this.reseña = "Sin-Reseña";
        this.nombre = "Sin-Nombre";
        this.mail = "Sin-Mail";
        this.unRestaurante = null;
        this.fecha = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
    }

    public Evaluacion(int catnidadEstrellas, String reseña, String nombre, String mail, Restaurante unRestaurante) {
        this.catnidadEstrellas = catnidadEstrellas;
        this.reseña = reseña;
        this.nombre = nombre;
        this.mail = mail;
        this.unRestaurante = unRestaurante;
        this.fecha =new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
    }
    public Evaluacion(int cantidadEstrellas, String reseña, Restaurante unRestaurante){
        this.catnidadEstrellas = cantidadEstrellas;
        this.reseña = reseña;
        this.mail = "Sin-Mail";
        this.nombre = "Anónima";
        this.unRestaurante = unRestaurante;
        this.fecha = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
    }

    public int getCatnidadEstrellas() {
        return catnidadEstrellas;
    }

    public void setCatnidadEstrellas(int catnidadEstrellas) {
        this.catnidadEstrellas = catnidadEstrellas;
    }

    public String getReseña() {
        return reseña;
    }

    public void setReseña(String reseña) {
        this.reseña = reseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Restaurante getUnRestaurante() {
        return unRestaurante;
    }

    public void setUnRestaurante(Restaurante unRestaurante) {
        this.unRestaurante = unRestaurante;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public boolean validarCantidadEstrellas(int estrellas) {
        boolean ok;
        ok = false;
        if (estrellas > 0 && estrellas < 6) {
            ok = true;
        }
        return ok;
    }

    @Override
    public String toString() {
        String resultado;
        resultado = "";
        resultado += "CatnidadEstrellas: " + catnidadEstrellas;
        resultado += !nombre.equals("") ? "  |  Nombre: " + nombre : "";
        resultado += "  |  " + unRestaurante;
        return resultado;
    }

}
