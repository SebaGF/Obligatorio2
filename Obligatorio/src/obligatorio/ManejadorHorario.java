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

}
