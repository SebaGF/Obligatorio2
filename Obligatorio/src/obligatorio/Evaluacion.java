package obligatorio;

import javax.swing.Icon;

public class Evaluacion {

    private int catnidadEstrellas;
    private String reseña;
    private String nombre;
    private Restaurante unRestaurante;
    private Icon estrellas;

    public Evaluacion() {
    }

    public Evaluacion(int catnidadEstrellas, String reseña, String nombre, Restaurante unRestaurante) {
        this.catnidadEstrellas = catnidadEstrellas;
        this.reseña = reseña;
        this.nombre = nombre;
        this.unRestaurante = unRestaurante;
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

    public Restaurante getUnRestaurante() {
        return unRestaurante;
    }

    public void setUnRestaurante(Restaurante unRestaurante) {
        this.unRestaurante = unRestaurante;
    }

    public Icon getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(Icon estrellas) {
        this.estrellas = estrellas;
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
