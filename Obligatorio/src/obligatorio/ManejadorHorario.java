package obligatorio;

import java.util.*;

public class ManejadorHorario {

    private String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sabado", "Domingo"};
    java.util.List<java.util.Map.Entry<String, String>> horarios = new java.util.ArrayList<>();

    public ManejadorHorario() {
        
        for (int i = 0; i < dias.length; i++) {
           
            Map.Entry<String, String> horario = new AbstractMap.SimpleEntry<>(dias[i], new Horario().getFormatoHorario());
            this.horarios.add(horario);
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
