package obligatorio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

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
            if (lstRestaurantes.get(i).getDireccion().equalsIgnoreCase(dir)) {
                esta = true;
            }
        }

        return esta;
    }

    public boolean validarFecha(String fecha) {
        boolean ok = false;
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
            formatoFecha.setLenient(false);
            formatoFecha.parse(fecha);

        } catch (ParseException e) {
            return false;
        }
        return true;

    }

    public boolean validarNumero(int num, int min, int max) {
        boolean ok;
        ok = false;
        try {
            if (num > min && num < max) {
                ok = true;
            }
        } catch (NumberFormatException e) {

        }
        return ok;
    }

    public boolean comparaFechas(String fecha, String fecha2) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        boolean ok;
        ok = false;
        Date f = null;
        try {
            f = sdf.parse(fecha);
        } catch (ParseException ex) {
            ok = false;
        }

        Date s = null;

        try {
            s = sdf.parse(fecha2);
        } catch (ParseException ex) {
            ok = false;
        }

        if (f != null && s != null) {
            if (s.compareTo(f) > 0) {
                ok = true;
            }
            if (s.compareTo(f) < 0) {
                ok = false;
            }
        }

        return ok;
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
