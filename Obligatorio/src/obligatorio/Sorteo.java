
package obligatorio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Sorteo {
    
    private Restaurante restaurante;
    private String fechaInicio;
    private String fechaCierre;
    private String premio;
    private int cantGanadores;

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getFechaCierre() {
        return fechaCierre;
    }

    public String getPremio() {
        return premio;
    }

    public int getCantGanadores() {
        return cantGanadores;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaCierre(String fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public void setPremio(String premio) {
        this.premio = premio;
    }

    public void setCantGanadores(int cantGanadores) {
        this.cantGanadores = cantGanadores;
    }
    public Sorteo(){
        this.restaurante = null;
        this.fechaInicio = "";
        this.fechaCierre = "";
        this.premio = "";
        this.cantGanadores = 0;
    }
    
    public Sorteo(Restaurante unRestaurante, String fechaInicio, String fechaCierre, String premio, int cantGanadores){
        this.restaurante = unRestaurante;
        this.fechaInicio = fechaInicio;
        this.fechaCierre = fechaCierre;
        this.premio = premio;
        this.cantGanadores = cantGanadores;
    }
    
    @Override
    public String toString(){
        return this.restaurante.getNombre() + " Premio: " + this.premio;  
    }
    
   
    
}
