
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
    
}
