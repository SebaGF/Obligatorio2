
package obligatorio;

public class Horario {
    private int horaInicio;
    private int horaFin;
    private String formatoHorario;

    public int getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(int horaFin) {
        this.horaFin = horaFin;
    }

    public String getFormatoHorario() {
        return formatoHorario;
    }

    public void setFormatoHorario(String formatoHorario) {
        this.formatoHorario = formatoHorario;
    }

    public Horario() {
        this.horaInicio = 0;
        this.horaFin = 0;
        this.formatoHorario = horaInicio+ " - " + horaFin;
    }

    public Horario(int horaInicio, int horaFin) {
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.formatoHorario = this.horaInicio +" - "+this.horaFin;
    }
    
    
    
}
