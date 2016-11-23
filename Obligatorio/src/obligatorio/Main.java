package obligatorio;

import interfaz.VentanaPrincipal;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Sistema s = new Sistema();
        //datos de prueba
        Restaurante r = new Restaurante("Peperone", "26 de marzo", null, "papas");
        Restaurante r1 = new Restaurante("La Vidalita", "18 de julio", null, "pizza");
        Restaurante r2 = new Restaurante("Peperone", "Bv España", null, "pasta");
        Evaluacion e = new Evaluacion(3, "Muy buena comida", "Sebastian", "garciaseba96.sg@gmail.com", r1);
        Evaluacion e1 = new Evaluacion(2, "El pan estaba re duro", "Martin", "apa_bh@hotmail.com", r1);
        Evaluacion e2 = new Evaluacion(1, "El peor restaurante ", "Jose Luis", "alejo.pereira13@gmail.com", r1);
        s.getLstEvaluacionSorteo().add(e);
        s.getLstEvaluacionSorteo().add(e1);
        s.getLstEvaluacionSorteo().add(e2);
        s.getLstRestaurantes().add(r);
        s.getLstRestaurantes().add(r1);
        s.getLstRestaurantes().add(r2);
        VentanaPrincipal v = new VentanaPrincipal(s);
        v.setVisible(true);
    }

}
