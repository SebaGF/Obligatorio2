package obligatorio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class EvaluacionTest {

    public EvaluacionTest() {
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

    //<editor-fold defaultstate="collapsed" desc="Test getCantidadEstrellas">
    @Test
    public void testGetCatnidadEstrellasConNumPositivo() {
        Evaluacion instance = new Evaluacion();
        instance.setCatnidadEstrellas(10);
        assertEquals(10, instance.getCatnidadEstrellas());
    }

    @Test
    public void testGetCatnidadEstrellasConNumNegativo() {
        Evaluacion instance = new Evaluacion();
        instance.setCatnidadEstrellas(-5);
        assertEquals(-5, instance.getCatnidadEstrellas());
    }

    @Test
    public void testGetCatnidadEstrellasConMaxNumRepresentable() {
        Evaluacion instance = new Evaluacion();
        instance.setCatnidadEstrellas(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, instance.getCatnidadEstrellas());
    }

    @Test
    public void testGetCatnidadEstrellasConMinNumRepresentable() {
        Evaluacion instance = new Evaluacion();
        instance.setCatnidadEstrellas(Integer.MIN_VALUE);
        assertEquals(Integer.MIN_VALUE, instance.getCatnidadEstrellas());
    }

    @Test
    public void testGetCatnidadEstrellasConCero() {
        Evaluacion instance = new Evaluacion();
        instance.setCatnidadEstrellas(0);
        assertEquals(0, instance.getCatnidadEstrellas());
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Test setCantEstrellas">

    @Test
    public void testSetCatnidadEstrellasMaxNumRepresentable() {
        Evaluacion instance = new Evaluacion();
        instance.setCatnidadEstrellas(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, instance.getCatnidadEstrellas());
    }

    @Test
    public void testSetCatnidadEstrellasMinNumRepresentable() {
        Evaluacion instance = new Evaluacion();
        instance.setCatnidadEstrellas(Integer.MIN_VALUE);
        assertEquals(Integer.MIN_VALUE, instance.getCatnidadEstrellas());
    }

    @Test
    public void testSetCatnidadEstrellasConNumPositivo() {
        Evaluacion instance = new Evaluacion();
        instance.setCatnidadEstrellas(20);
        assertEquals(20, instance.getCatnidadEstrellas());
    }

    @Test
    public void testSetCatnidadEstrellasConNumNegativo() {
        Evaluacion instance = new Evaluacion();
        instance.setCatnidadEstrellas(-15);
        assertEquals(-15, instance.getCatnidadEstrellas());
    }

    @Test
    public void testSetCatnidadEstrellasConCero() {
        Evaluacion instance = new Evaluacion();
        instance.setCatnidadEstrellas(0);
        assertEquals(0, instance.getCatnidadEstrellas());
    }

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Test getResenia">
    @Test
    public void testGetReseniaNula() {
        Evaluacion instance = new Evaluacion();
        instance.setResenia(null);
        assertEquals(null, instance.getResenia());
    }

    @Test
    public void testGetReseniaVacia() {
        Evaluacion instance = new Evaluacion();
        instance.setResenia("");
        assertEquals("", instance.getResenia());
    }

    @Test
    public void testGetReseniaConUnCarater() {
        Evaluacion instance = new Evaluacion();
        instance.setResenia("a");
        assertEquals("a", instance.getResenia());
    }

    @Test
    public void testGetReseniaConFormatoCorrecto() {
        Evaluacion instance = new Evaluacion();
        instance.setResenia("Excelente Restaurante");
        assertEquals("Excelente Restaurante", instance.getResenia());
    }

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Test setResenia">
    @Test
    public void testSetReseniaNull() {
        Evaluacion instance = new Evaluacion();
        instance.setResenia(null);
        assertEquals(null, instance.getResenia());
    }

    @Test
    public void testSetReseniaVacia() {
        Evaluacion instance = new Evaluacion();
        instance.setResenia("");
        assertEquals("", instance.getResenia());
    }

    @Test
    public void testSetReseniaFormatoCorrecto() {
        Evaluacion instance = new Evaluacion();
        instance.setResenia("Excelente, muy rico");
        assertEquals("Excelente, muy rico", instance.getResenia());
    }

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Test getNombre">
    @Test
    public void testGetNombreNull() {
        Evaluacion instance = new Evaluacion();
        instance.setNombre(null);
        assertEquals(null, instance.getNombre());
    }

    @Test
    public void testGetNombreVacio() {
        Evaluacion instance = new Evaluacion();
        instance.setNombre("");
        assertEquals("", instance.getNombre());
    }

    @Test
    public void testGetNombreFormatoCorrecto() {
        Evaluacion instance = new Evaluacion();
        instance.setNombre("Juan Osorio");
        assertEquals("Juan Osorio", instance.getNombre());
    }

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Test setNombre">
    @Test
    public void testSetNombreNull() {
        Evaluacion instance = new Evaluacion();
        instance.setNombre(null);
        assertEquals(null, instance.getNombre());
    }

    @Test
    public void testSetNombreVacio() {
        Evaluacion instance = new Evaluacion();
        instance.setNombre("");
        assertEquals("", instance.getNombre());
    }

    @Test
    public void testSetNombreFormatoCorrecto() {
        Evaluacion instance = new Evaluacion();
        instance.setNombre("Sol Andres");
        assertEquals("Sol Andres", instance.getNombre());
    }

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Test getMail">
    @Test
    public void testGetMailNull() {
        Evaluacion instance = new Evaluacion();
        instance.setMail(null);
        assertEquals(null, instance.getMail());
    }

    @Test
    public void testGetMailVacio() {
        Evaluacion instance = new Evaluacion();
        instance.setMail("");
        assertEquals("", instance.getMail());
    }

    @Test
    public void testGetMailFormatoCorrecto() {
        Evaluacion instance = new Evaluacion();
        instance.setMail("anto23@gmail.com");
        assertEquals("anto23@gmail.com", instance.getMail());
    }

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Test setMail">
    @Test
    public void testSetMailNull() {
        Evaluacion instance = new Evaluacion();
        instance.setMail(null);
        assertEquals(null, instance.getMail());
    }

    @Test
    public void testSetMailVacio() {
        Evaluacion instance = new Evaluacion();
        instance.setMail("");
        assertEquals("", instance.getMail());
    }

    @Test
    public void testSetMailFormatoCorrecto() {
        Evaluacion instance = new Evaluacion();
        instance.setMail("evaluacion@restaurantes.com.uy");
        assertEquals("evaluacion@restaurantes.com.uy", instance.getMail());
    }

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Test getUnRestaurante">
    @Test
    public void testGetUnRestauranteNull() {
        Evaluacion instance = new Evaluacion();
        instance.setUnRestaurante(null);
        assertNull(instance.getUnRestaurante());
    }

    @Test
    public void testGetUnRestaurante() {
        Evaluacion instance = new Evaluacion();
        instance.setUnRestaurante(new Restaurante());
        assertNotNull(instance.getUnRestaurante());
    }

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Test setUnRestaurante">
    @Test
    public void testSetUnRestauranteNull() {
        Evaluacion instance = new Evaluacion();
        instance.setUnRestaurante(null);
        assertNull(instance.getUnRestaurante());
    }

    @Test
    public void testSetUnRestaurante() {
        Evaluacion instance = new Evaluacion();
        instance.setUnRestaurante(new Restaurante());
        assertNotNull(instance.getUnRestaurante());
    }

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Test getFecha">
    @Test
    public void testGetFechaNull() {
        Evaluacion instance = new Evaluacion();
        instance.setFecha(null);
        assertEquals(null, instance.getFecha());
    }

    @Test
    public void testGetFechaVacio() {
        Evaluacion instance = new Evaluacion();
        instance.setFecha("");
        assertEquals("", instance.getFecha());
    }

    @Test
    public void testGetFechaFormatoCorrecto() {
        Evaluacion instance = new Evaluacion();
        instance.setNombre("19/11/2016");
        assertEquals("19/11/2016", instance.getNombre());
    }

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Test setFecha">
    @Test
    public void testSetFechaNull() {
        Evaluacion instance = new Evaluacion();
        instance.setFecha(null);
        assertEquals(null, instance.getFecha());
    }

    @Test
    public void testSetFechaVacio() {
        Evaluacion instance = new Evaluacion();
        instance.setFecha("");
        assertEquals("", instance.getFecha());
    }

    @Test
    public void testSetFechaFormatoCorrecto() {
        Evaluacion instance = new Evaluacion();
        instance.setNombre("17/11/2016");
        assertEquals("17/11/2016", instance.getNombre());
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Test validarCantidadEstrellas">

    @Test
    public void testValidarCantidadEstrellasNegativas() {
        Evaluacion instance = new Evaluacion();
        assertEquals(false, instance.validarCantidadEstrellas(-5));

    }

    @Test
    public void testValidarCantidadEstrellasCero() {
        Evaluacion instance = new Evaluacion();
        assertEquals(false, instance.validarCantidadEstrellas(0));

    }

    @Test
    public void testValidarCantidadEstrellasMayorA6() {
        Evaluacion instance = new Evaluacion();
        assertEquals(false, instance.validarCantidadEstrellas(25));

    }

    @Test
    public void testValidarCantidadEstrellasCon6() {
        Evaluacion instance = new Evaluacion();
        assertEquals(false, instance.validarCantidadEstrellas(6));

    }

    @Test
    public void testValidarCantidadEstrellasCon1() {
        Evaluacion instance = new Evaluacion();
        assertEquals(true, instance.validarCantidadEstrellas(1));
    }

    @Test
    public void testValidarCantidadEstrellasCon5() {
        Evaluacion instance = new Evaluacion();
        assertEquals(true, instance.validarCantidadEstrellas(5));
    }

    @Test
    public void testValidarCantidadEstrellasEnRango() {
        Evaluacion instance = new Evaluacion();
        assertEquals(true, instance.validarCantidadEstrellas(4));
    }
//</editor-fold>

//
//    /**
//     * Test of toString method, of class Evaluacion.
//     */
//    @Test
//    public void testToString() {
//        System.out.println("toString");
//        Evaluacion instance = new Evaluacion();
//        String expResult = "";
//        String result = instance.toString();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}
