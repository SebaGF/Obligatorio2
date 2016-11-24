package obligatorio;

import java.util.*;

public class ManejadorHorario {

    private String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sabado", "Domingo"};
    java.util.List<java.util.Map.Entry<String, String>> horarios = new java.util.ArrayList<>();

    public String[] getDias() {
        return dias;
    }

    public void setDias(String[] dias) {
        this.dias = dias;
    }

    public List<Map.Entry<String, String>> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<Map.Entry<String, String>> horarios) {
        this.horarios = horarios;
    }

    
    
    
    
    public ManejadorHorario() {

        for (int i = 0; i < dias.length; i++) {
            Horario miHorario = new Horario();
            Map.Entry<String, String> horario = new AbstractMap.SimpleEntry<>(dias[i], miHorario.getFormatoHorario());
            this.horarios.add(horario);
        }

    }

    public void cargarHorario(String dia, String horaInicio, String horaFin) {
       
        for (int i = 0; i < horarios.size(); i++) {
            if (horarios.get(i).getKey().equals(dia)) {
                 horarios.get(i).setValue(horaInicio + " - " + horaFin);
            }

        }
        
    }

    public boolean validarHorario(String horario) {
        boolean ok;
        ok = false;
        //formato hora "hh:mm";
        //filro que el formato sea correcto, que contenga ":" y que este entre 4 y 5 caracteres
        //ej 2:00 o 19:00
        try {
            if (horario.contains(":") && horario.length() < 6 && horario.length() > 3) {

                String horarioMmHh[] = horario.split(":"); //separo hh y mm por :
                int horaIniH = Integer.parseInt(horarioMmHh[0]); //tomo las horas
                int horaIniM = Integer.parseInt(horarioMmHh[1]); //tomo los minutos

                if (horaIniH > -1 && horaIniH < 24) {
                    if (horaIniM < 60 && horaIniM > -1) {
                        ok = true;
                    }
                }
            }
        } catch (Exception e) {

        }
        return ok;
    }

}
