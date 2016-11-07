package obligatorio;

public class Restaurante {

    private String nombre;
    private String direccion;
    private ManejadorHorario horarios;
    private String tipoComida;

    public Restaurante() {
    }

    public Restaurante(String nombre, String direccion, ManejadorHorario horario, String tipoComida) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.horarios = horario;
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

    public ManejadorHorario getHorarios() {
        return horarios;
    }

    public void setHorarios(ManejadorHorario horarios) {
        this.horarios = horarios;
    }
    
    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String unTipoComida) {
        this.tipoComida = unTipoComida;
    }

    @Override
    public String toString() {
        return nombre.toUpperCase() + "  |  " + direccion.toUpperCase()+ "  |  " + tipoComida.toUpperCase();
    }
}
