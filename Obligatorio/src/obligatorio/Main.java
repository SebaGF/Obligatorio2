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
        s.getLstRestaurantes().add(r);
        s.getLstRestaurantes().add(r1);
        s.getLstRestaurantes().add(r2);
        VentanaPrincipal v = new VentanaPrincipal(s);
        v.setVisible(true);
    }

}
