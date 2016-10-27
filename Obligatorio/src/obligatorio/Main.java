
package obligatorio;

import Interfaz.VentanaPrincipal;


public class Main {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Sistema s = new Sistema();
        VentanaPrincipal miVentana = new VentanaPrincipal(s);
        miVentana.setVisible(true);
    }
    
}
