
package obligatorio;

import interfaz.VentanaPrincipal;


public class Main {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Sistema s = new Sistema();
        VentanaPrincipal v = new VentanaPrincipal(s);
        v.setVisible(true);
    }
    
}
