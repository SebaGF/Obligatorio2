package obligatorio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class HorarioTest {

    public HorarioTest() {
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

    //<editor-fold defaultstate="collapsed" desc="Test getHoraInicio">
    @Test
    public void testGetHoraInicioPositivo() {
        Horario instance = new Horario(15, 18);
        assertEquals(15, instance.getHoraInicio());
    }
    @Test
    public void testGetHoraInicioNegativo() {
        Horario instance = new Horario();
        instance.setHoraInicio(-5);
        assertEquals(-5, instance.getHoraInicio());
    }
    @Test
    public void testGetHoraInicioCero() {
        Horario instance = new Horario(0, 18);
        assertEquals(0, instance.getHoraInicio());
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Test getHoraFin">
    @Test
    public void testGetHoraFinPositivo() {
        Horario instance = new Horario(15, 18);
        assertEquals(18, instance.getHoraFin());
    }
    @Test
    public void testGetHoraFinNegativo() {
        Horario instance = new Horario();
        instance.setHoraFin(-8);
        assertEquals(-8, instance.getHoraFin());
    }
    @Test
    public void testGetHoraFinCero() {
        Horario instance = new Horario(0, 0);
        assertEquals(0, instance.getHoraFin());
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Test setFormatoHorario">
    
    @Test
    public void testSetFormatoHorarioVacio() {
        Horario instance = new Horario();
        instance.setFormatoHorario("");
        assertEquals("", instance.getFormatoHorario());
    }
    @Test
    public void testSetFormatoHorarioNull() {
        Horario instance = new Horario();
        instance.setFormatoHorario(null);
        assertEquals(null, instance.getFormatoHorario());
    }
    @Test
    public void testSetFormatoHorarioOk() {
        Horario instance = new Horario();
        instance.setFormatoHorario("hh:mm");
        assertEquals("hh:mm", instance.getFormatoHorario());
    }

//</editor-fold>
    
}
