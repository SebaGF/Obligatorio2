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

   

}
