
package obligatorio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class RestauranteTest {
    
    public RestauranteTest() {
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

    //<editor-fold defaultstate="collapsed" desc="Test getNombre">
    @Test
    public void testGetNombreCorrecto() {
        Restaurante instance = new Restaurante();
        instance.setNombre("La Pasiva");
        assertEquals("La Pasiva", instance.getNombre());
      
    }
    @Test
    public void testGetNombreVacio() {
        Restaurante instance = new Restaurante();
        instance.setNombre(" ");
        assertEquals(" ", instance.getNombre());
      
    }
    @Test
    public void testGetNombreNulo() {
        Restaurante instance = new Restaurante();
        instance.setNombre(null);
        assertEquals(null, instance.getNombre());
      
    }
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Test setNombre">
     @Test
    public void testSetNombreCorrecto() {
        Restaurante instance = new Restaurante();
        instance.setNombre("La Balconada");
        assertEquals("La Balconada", instance.getNombre());
      
    }
    @Test
    public void testSetNombreVacio() {
        Restaurante instance = new Restaurante();
        instance.setNombre(" ");
        assertEquals(" ", instance.getNombre());
      
    }
    @Test
    public void testSetNombreNulo() {
        Restaurante instance = new Restaurante();
        instance.setNombre(null);
        assertEquals(null, instance.getNombre());
      
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Test getDireccion">
    @Test
    public void testGetDireccionCorrecta() {
        Restaurante instance = new Restaurante();
        instance.setDireccion("Rivera y Soca");
        assertEquals("Rivera y Soca", instance.getDireccion());
    }
    @Test
    public void testGetDireccionVacia() {
        Restaurante instance = new Restaurante();
        instance.setDireccion("");
        assertEquals("", instance.getDireccion());
    }
    @Test
    public void testGetDireccionNula() {
        Restaurante instance = new Restaurante();
        instance.setDireccion(null);
        assertEquals(null, instance.getDireccion());
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Test setDireccion">
    @Test
    public void testSetDireccionCorrecta() {
        Restaurante instance = new Restaurante();
        instance.setDireccion("Av Italia y Comercio");
        assertEquals("Av Italia y Comercio", instance.getDireccion());
    }
    @Test
    public void testSetDireccionVacia() {
        Restaurante instance = new Restaurante();
        instance.setDireccion("");
        assertEquals("", instance.getDireccion());
    }
    @Test
    public void testSetDireccionNula() {
        Restaurante instance = new Restaurante();
        instance.setDireccion(null);
        assertEquals(null, instance.getDireccion());
    }
//</editor-fold>    
    //<editor-fold defaultstate="collapsed" desc="Test getHorario">
    @Test
    public void testGetHorariosCorrecto() {
        Restaurante instance = new Restaurante();
        instance.setHorarios(new ManejadorHorario());
        assertNotNull(instance.getHorarios());
    }
    @Test
    public void testGetHorariosNulo() {
        Restaurante instance = new Restaurante();
        instance.setHorarios(null); 
        assertNull(instance.getHorarios());
    }
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Test setHorario">
      @Test
    public void testSetHorariosCorrecto() {
        Restaurante instance = new Restaurante();
        instance.setHorarios(new ManejadorHorario());
        assertNotNull(instance.getHorarios());
    }
    @Test
    public void testSetHorariosNulo() {
        Restaurante instance = new Restaurante();
        instance.setHorarios(null);
        assertNull(instance.getHorarios());
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Test getTipoComida">
    @Test
    public void testGetTipoComidaCorrecto() {
        Restaurante instance = new Restaurante();
        instance.setTipoComida("Pizza");
        assertEquals("Pizza", instance.getTipoComida());
    }
    @Test
    public void testGetTipoComidaVacio() {
        Restaurante instance = new Restaurante();
        instance.setTipoComida("");
        assertEquals("", instance.getTipoComida());
    }
    @Test
    public void testGetTipoComidaNulo() {
        Restaurante instance = new Restaurante();
        instance.setTipoComida(null);
        assertEquals(null, instance.getTipoComida());
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Test setTipoComida">
      @Test
    public void testSetTipoComidaCorrecto() {
        Restaurante instance = new Restaurante();
        instance.setTipoComida("Pasta casera");
        assertEquals("Pasta casera", instance.getTipoComida());
    }
    @Test
    public void testSetTipoComidaVacio() {
        Restaurante instance = new Restaurante();
        instance.setTipoComida("");
        assertEquals("", instance.getTipoComida());
    }
    @Test
    public void testSetTipoComidaNulo() {
        Restaurante instance = new Restaurante();
        instance.setTipoComida(null);
        assertEquals(null, instance.getTipoComida());
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Test toString">
    @Test
    public void testToString() {
        Restaurante instance = new Restaurante("La Pasiva","Rivera y Soca", null, "Pizza" );
        assertEquals("LA PASIVA  |  RIVERA Y SOCA  |  PIZZA", instance.toString());
    }
   
//</editor-fold>
    
    
}
