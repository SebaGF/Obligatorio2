package obligatorio;

import java.util.List;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ManejadorHorarioTest {

    public ManejadorHorarioTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    //<editor-fold defaultstate="collapsed" desc="Test SetDias">
    @Test
    public void testSetDiasOk(){
        ManejadorHorario instance = new ManejadorHorario();
        String [] dias ={"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        instance.setDias(dias);
        assertSame(dias, instance.getDias());
    }

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Test setHorarios">
    @Test
    public void testSetHorariosOk() {
        List<Map.Entry<String, String>> horarios;
        ManejadorHorario instance = new ManejadorHorario();
        instance.setHorarios(instance.getHorarios());
        horarios = instance.getHorarios();
        assertSame(horarios, instance.getHorarios());
    }

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Test cargarHorarios">
    @Test
    public void testCargarHorario() {
        String dia = "Lunes";
        String horaInicio = "15:00";
        String horaFin = "22:30";
        ManejadorHorario instance = new ManejadorHorario();
        instance.cargarHorario(dia, horaInicio, horaFin);
        assertEquals(instance.getHorarios().get(0).getValue(), horaInicio+" - "+horaFin);
    }
//
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Test validarHorario">
     @Test
    public void testValidarHorarioOk() {
        ManejadorHorario instance = new ManejadorHorario(); 
        assertEquals(true, instance.validarHorario("15:00"));
    }
     @Test
    public void testValidarHorarioFormatoMal() {
        ManejadorHorario instance = new ManejadorHorario(); 
        assertEquals(false, instance.validarHorario("ts:Pl"));
    }
     @Test
    public void testValidarHorarioSoloConDosPuntos() {
        ManejadorHorario instance = new ManejadorHorario(); 
        assertEquals(false, instance.validarHorario(":"));
    }
     @Test
    public void testValidarHorarioSinDosPuntos() {
        ManejadorHorario instance = new ManejadorHorario(); 
        assertEquals(false, instance.validarHorario("1500"));
    }
     @Test
    public void testValidarHorarioSinHoras() {
        ManejadorHorario instance = new ManejadorHorario(); 
        assertEquals(false, instance.validarHorario(":00"));
    }
     @Test
    public void testValidarHorarioSinMinutos() {
        ManejadorHorario instance = new ManejadorHorario(); 
        assertEquals(false, instance.validarHorario("15:"));
    }
     @Test
    public void testValidarHorarioVacia() {
        ManejadorHorario instance = new ManejadorHorario(); 
        assertEquals(false, instance.validarHorario(""));
    }
     @Test
    public void testValidarHorarioNull() {
        ManejadorHorario instance = new ManejadorHorario(); 
        assertEquals(false, instance.validarHorario(null));
    }
     @Test
    public void testValidarHorarioHoraNegativa() {
        ManejadorHorario instance = new ManejadorHorario(); 
        assertEquals(false, instance.validarHorario("-2:00"));
    }
     @Test
    public void testValidarHorarioMinutoNegativo() {
        ManejadorHorario instance = new ManejadorHorario(); 
        assertEquals(false, instance.validarHorario("15:-5"));
    }
     @Test
    public void testValidarHorarioMinutoMayorA59() {
        ManejadorHorario instance = new ManejadorHorario(); 
        assertEquals(false, instance.validarHorario("15:65"));
    }
     @Test
    public void testValidarHorarioHoraMayorA23() {
        ManejadorHorario instance = new ManejadorHorario(); 
        assertEquals(false, instance.validarHorario("30:00"));
    }
//</editor-fold>
//    @Test
//    public void testGetDias() {
//        System.out.println("getDias");
//        ManejadorHorario instance = new ManejadorHorario();
//        String[] expResult = null;
//        String[] result = instance.getDias();
//        assertArrayEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setDias method, of class ManejadorHorario.
//     */
//
//    /**
//     * Test of getHorarios method, of class ManejadorHorario.
//     */
//    @Test
//    public void testGetHorarios() {
//        System.out.println("getHorarios");
//        ManejadorHorario instance = new ManejadorHorario();
//        List<Map.Entry<String, String>> expResult = null;
//        List<Map.Entry<String, String>> result = instance.getHorarios();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setHorarios method, of class ManejadorHorario.
//     */
//    
//    /**
//     * Test of cargarHorario method, of class ManejadorHorario.
//     */
//    
//    /**
//     * Test of validarHorario method, of class ManejadorHorario.
//     */
//   
}
