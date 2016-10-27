
package obligatorio;


public class Restaurante {
    private String nombre;
    private String direccion;
    private String horarioInicio;
    private String horarioFin;
    private String tipoComida;

    public Restaurante() {
    }

    public Restaurante(String nombre, String direccion, String horarioInicio, String horarioFin, String tipoComida) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.horarioInicio = horarioInicio;
        this.horarioFin = horarioFin;
        this.tipoComida = tipoComida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String unNombre) {
        this.nombre = unNombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String unaDireccion) {
        this.direccion = unaDireccion;
    }

    public String getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(String unHorarioInicio) {
        this.horarioInicio = unHorarioInicio;
    }

    public String getHorarioFin() {
        return horarioFin;
    }

    public void setHorarioFin(String unHorarioFin) {
        this.horarioFin = unHorarioFin;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String unTipoComida) {
        this.tipoComida = unTipoComida;
    }

    @Override
    public String toString() {
        return  nombre.toUpperCase() + "  |  " + direccion.toUpperCase() + "  |  " + horarioInicio + " - " + horarioFin + "  |  " + tipoComida.toUpperCase();
    }
    
    
}
