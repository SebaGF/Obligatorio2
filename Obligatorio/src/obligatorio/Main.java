
package obligatorio;

import Interfaz.VentanaInicio;

public class Main {

    public static void main(String[] args) {
       
        Sistema s = new Sistema(); 
        /*DATOS DE PRUEBA*/
        
//        s.getLstRestaurantes().add(new Restaurante("La pasiva", "18 de julio 1800", "15:00", "23:00", "pizza"));
//        s.getLstRestaurantes().add(new Restaurante("La Tortuguita", "Tristan narvaja 1252", "12:00", "00:00", "chivito"));
//        
        
        
        
        
        /*FIN DATOS DE PRUEBA*/
        VentanaInicio miVentana = new VentanaInicio(s);
        miVentana.setVisible(true);
    }
    
}
