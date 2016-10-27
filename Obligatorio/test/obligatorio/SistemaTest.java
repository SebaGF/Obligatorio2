
package obligatorio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class SistemaTest {
    
    public SistemaTest() {
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

    
    
    @Test
    public void validarStringNoVacioNula(){
        Sistema s = new Sistema();
        boolean result = s.validarStringNoVacio(null, 1, 3);
        assertEquals(false, result);
    }
    @Test
    public void validarStringNoVacioMenorMinimo(){
        Sistema s = new Sistema();
        boolean result = s.validarStringNoVacio("texto", 6, 10);
        assertEquals(false, result);
    }
    @Test
    public void validarStringNoVacioMayorMaximo(){
        Sistema s = new Sistema();
        boolean result = s.validarStringNoVacio("texto", 1, 3);
        assertEquals(false, result);
    }
    @Test
    public void validarStringNoVacioEntreMinYMax(){
        Sistema s = new Sistema();
        boolean result = s.validarStringNoVacio("texto", 1, 10);
        assertEquals(true, result);
    }
    @Test
    public void validarHorarioNulo(){
        Sistema s = new Sistema();
        boolean result = s.validarHorario(null);
        assertEquals(false, result);
    }
    @Test
    public void validarHorarioSinPuntos(){
        Sistema s = new Sistema();
        boolean result = s.validarHorario("2100");
        assertEquals(false, result);
    }
    @Test
    public void validarHorarioSinHoras(){
        Sistema s = new Sistema();
        boolean result = s.validarHorario(":30");
        assertEquals(false, result);
    }
    @Test
    public void validarHorarioSinMinutos(){
        Sistema s = new Sistema();
        boolean result = s.validarHorario("21:");
        assertEquals(false, result);
    }
    @Test
    public void validarHorarioConHoraMayorA23(){
        Sistema s = new Sistema();
        boolean result = s.validarHorario("28:00");
        assertEquals(false, result);
    }
    @Test
    public void validarHorarioConHoraNegativa(){
        Sistema s = new Sistema();
        boolean result = s.validarHorario("-21:00");
        assertEquals(false, result);
    }
    @Test
    public void validarHorarioConMinutosMayorA59(){
        Sistema s = new Sistema();
        boolean result = s.validarHorario("21:65");
        assertEquals(false, result);
    }
    @Test
    public void validarHorarioConMinutosNegativos(){
        Sistema s = new Sistema();
        boolean result = s.validarHorario("21:-15");
        assertEquals(false, result);
    }
    @Test
    public void validarHorarioCorrecto(){
        Sistema s = new Sistema();
        boolean result = s.validarHorario("20:30");
        assertEquals(true, result);
    }
    
}
