package obligatorio;

import java.util.ArrayList;

public class Sistema {

    private ArrayList<Restaurante> lstRestaurantes;
    private ArrayList<Evaluacion> lstEvaluacion;

    public Sistema() {
        this.lstRestaurantes = new ArrayList();
        this.lstEvaluacion = new ArrayList();
    }

    public ArrayList<Restaurante> getLstRestaurantes() {
        return lstRestaurantes;
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
