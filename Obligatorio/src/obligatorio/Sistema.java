package obligatorio;

import java.util.ArrayList;

public class Sistema {

    private ArrayList<Restaurante> lstRestaurantes;
    private ArrayList<Evaluacion> lstEvaluacion;
    private ArrayList<Evaluacion> lstEvaluacionSorteo;

    public Sistema() {
        this.lstRestaurantes = new ArrayList();
        this.lstEvaluacion = new ArrayList();
        lstEvaluacionSorteo = new ArrayList<>();
    }

    public ArrayList<Restaurante> getLstRestaurantes() {
        return lstRestaurantes;
    }

    public ArrayList<Evaluacion> getLstEvaluacion() {
        return lstEvaluacion;
    }

    public ArrayList<Evaluacion> getLstEvaluacionSorteo() {
        return lstEvaluacionSorteo;
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

    public boolean estaRestaurante(String dir) {
        boolean esta;
        esta = false;
        for (int i = 0; i < lstRestaurantes.size(); i++) {
            if (lstRestaurantes.get(i).getDireccion().equals(dir)) {
                esta = true;
            }
        }

        return esta;
    }

    public boolean estaEvaluacionSorteo(String mail, String dir) {
        boolean esta;
        esta = false;
        for (int i = 0; i < this.getLstEvaluacionSorteo().size(); i++) {
            Evaluacion aux;
            aux = this.getLstEvaluacionSorteo().get(i);
            if (aux.getMail().equalsIgnoreCase(mail)) {
                if (aux.getUnRestaurante().getDireccion().equalsIgnoreCase(dir)) {

                    esta = true;
                }
            }
        }
        return esta;
    }

}
