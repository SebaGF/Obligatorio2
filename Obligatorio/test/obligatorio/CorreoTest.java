package obligatorio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CorreoTest {

    public CorreoTest() {
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

    //<editor-fold defaultstate="collapsed" desc="Test setUsuarioCorrecto">
    @Test
    public void testSetUsuarioCorreoValido() {
        Correo instance = new Correo();
        instance.setUsuarioCorreo("ObligatorioOrt16@gmail.com");
        assertEquals("ObligatorioOrt16@gmail.com", instance.getUsuarioCorreo());
    }

    @Test
    public void testSetUsuarioCorreoVacio() {
        Correo instance = new Correo();
        instance.setUsuarioCorreo("");
        assertEquals("", instance.getUsuarioCorreo());
    }

    @Test
    public void testSetUsuarioCorreoNull() {
        Correo instance = new Correo();
        instance.setUsuarioCorreo(null);
        assertEquals(null, instance.getUsuarioCorreo());
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Test setContrasenia">

    @Test
    public void testSetContraseniaValida() {
        Correo instance = new Correo();
        instance.setContrasenia("ContRaseNia16");
        assertEquals("ContRaseNia16", instance.getContrasenia());
    }

    @Test
    public void testSetContraseniaVacia() {
        Correo instance = new Correo();
        instance.setContrasenia("");
        assertEquals("", instance.getContrasenia());
    }

    @Test
    public void testSetContraseniaNull() {
        Correo instance = new Correo();
        instance.setContrasenia(null);
        assertEquals(null, instance.getContrasenia());
    }

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Test setDestino">
    @Test
    public void testSetDestinoCorrecto() {
        Correo instance = new Correo();
        instance.setDestino("Evaluacion@ort.edu.uy");
        assertEquals("Evaluacion@ort.edu.uy", instance.getDestino());
    }

    @Test
    public void testSetDestinoVacio() {
        Correo instance = new Correo();
        instance.setDestino("");
        assertEquals("", instance.getDestino());
    }

    @Test
    public void testSetDestinoNull() {
        Correo instance = new Correo();
        instance.setDestino(null);
        assertEquals(null, instance.getDestino());
    }

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Test setAsunto">
    @Test
    public void testSetAsuntoCorrecto() {
        Correo instance = new Correo();
        instance.setAsunto("Ganador sorteo");
        assertEquals("Ganador sorteo", instance.getAsunto());
    }

    @Test
    public void testSetAsuntoVacio() {
        Correo instance = new Correo();
        instance.setAsunto("");
        assertEquals("", instance.getAsunto());
    }

    @Test
    public void testSetAsuntoNull() {
        Correo instance = new Correo();
        instance.setAsunto(null);
        assertEquals(null, instance.getAsunto());
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Test setMensaje">

    @Test
    public void testSetMensajeCorrecto() {
        Correo instance = new Correo();
        instance.setMensaje("Ganó una cena para dos");
        assertEquals("Ganó una cena para dos", instance.getMensaje());
    }
    @Test
    public void testSetMensajeVacio() {
        Correo instance = new Correo();
        instance.setMensaje("");
        assertEquals("", instance.getMensaje());
    }
    @Test
    public void testSetMensajeNull() {
        Correo instance = new Correo();
        instance.setMensaje(null);
        assertEquals(null, instance.getMensaje());
    }
//</editor-fold>

}
