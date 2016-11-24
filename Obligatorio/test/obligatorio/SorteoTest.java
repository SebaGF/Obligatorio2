/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Seba
 */
public class SorteoTest {

    public SorteoTest() {
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

    //<editor-fold defaultstate="collapsed" desc="Test getRestaurantes">
    @Test
    public void testGetRestauranteCorrecto() {
        Sorteo instance = new Sorteo();
        instance.setRestaurante(new Restaurante());
        assertNotNull(instance.getRestaurante());
    }

    public void testGetRestauranteNulo() {
        Sorteo instance = new Sorteo();
        instance.setRestaurante(null);
        assertNull(instance.getRestaurante());
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Test getFechaInicio">

    @Test
    public void testGetFechaInicioCorrecta() {
        Sorteo instance = new Sorteo();
        instance.setFechaInicio("12-05-2015");
        assertEquals("12-05-2015", instance.getFechaInicio());
    }

    @Test
    public void testGetFechaInicioNull() {
        Sorteo instance = new Sorteo();
        instance.setFechaInicio(null);
        assertNull(instance.getFechaInicio());
    }

    @Test
    public void testGetFechaInicioVacio() {
        Sorteo instance = new Sorteo();
        instance.setFechaInicio("");
        assertEquals("", instance.getFechaInicio());
    }

//</editor-fold> 
    //<editor-fold defaultstate="collapsed" desc="Teste getFechaCierre">
    @Test
    public void testGetFechaCierreCorrecta() {
        Sorteo instance = new Sorteo();
        instance.setFechaCierre("12-05-2015");
        assertEquals("12-05-2015", instance.getFechaCierre());
    }

    @Test
    public void testGetFechaCierreNull() {
        Sorteo instance = new Sorteo();
        instance.setFechaCierre(null);
        assertNull(instance.getFechaCierre());
    }

    @Test
    public void testGetFechaCierreVacio() {
        Sorteo instance = new Sorteo();
        instance.setFechaCierre("");
        assertEquals("", instance.getFechaCierre());
    }

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Test getPremio">
    @Test
    public void testGetPremioCorrecto() {
        Sorteo instance = new Sorteo();
        instance.setPremio("Milanesa en dos panes para dos.");
        assertEquals("Milanesa en dos panes para dos.", instance.getPremio());
    }

    @Test
    public void testGetPremioVacio() {
        Sorteo instance = new Sorteo();
        instance.setPremio("");
        assertEquals("", instance.getPremio());
    }

    @Test
    public void testGetPremioNull() {
        Sorteo instance = new Sorteo();
        instance.setPremio(null);
        assertNull(instance.getPremio());
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Test getCantGanadores">

    @Test
    public void testGetCantGanadoresCorrecto() {
        Sorteo instance = new Sorteo();
        instance.setCantGanadores(2);
        assertEquals(2, instance.getCantGanadores());
    }

    @Test
    public void testGetCantGanadoresMinimo() {
        Sorteo instance = new Sorteo();
        instance.setCantGanadores(0);
        assertEquals(0, instance.getCantGanadores());
    }

    @Test
    public void testGetCantGanadoresMaximo() {
        Sorteo instance = new Sorteo();
        instance.setCantGanadores(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, instance.getCantGanadores());
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Test setRestaurantes">

    @Test
    public void testSetRestauranteCorrecto() {
        Sorteo instance = new Sorteo();
        instance.setRestaurante(new Restaurante());
        assertNotNull(instance.getRestaurante());
    }

    public void testSetRestauranteNulo() {
        Sorteo instance = new Sorteo();
        instance.setRestaurante(null);
        assertNull(instance.getRestaurante());
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Test setFechaInicio">

    @Test
    public void testSetFechaInicioCorrecta() {
        Sorteo instance = new Sorteo();
        instance.setFechaInicio("25-12-2012");
        assertEquals("25-12-2012", instance.getFechaInicio());
    }

    @Test
    public void testSetFechaInicioNull() {
        Sorteo instance = new Sorteo();
        instance.setFechaInicio(null);
        assertNull(instance.getFechaInicio());
    }

    @Test
    public void testSetFechaInicioVacio() {
        Sorteo instance = new Sorteo();
        instance.setFechaInicio("");
        assertEquals("", instance.getFechaInicio());
    }

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Test setFechaCierre">
    @Test
    public void testSetFechaCierreCorrecta() {
        Sorteo instance = new Sorteo();
        instance.setFechaCierre("26-01-2013");
        assertEquals("26-01-2013", instance.getFechaCierre());
    }

    @Test
    public void testSetFechaCierreNull() {
        Sorteo instance = new Sorteo();
        instance.setFechaCierre(null);
        assertNull(instance.getFechaCierre());
    }

    @Test
    public void testSetFechaCierreVacio() {
        Sorteo instance = new Sorteo();
        instance.setFechaCierre("");
        assertEquals("", instance.getFechaCierre());
    }

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Test setPremio">
     @Test
    public void testSetPremioCorrecto() {
        Sorteo instance = new Sorteo();
        instance.setPremio("Canadiense con fritas para dos.");
         assertEquals("Canadiense con fritas para dos.", instance.getPremio());
    }
    @Test
    public void testSetPremioNulo() {
        Sorteo instance = new Sorteo();
        instance.setPremio(null);
        assertNull(instance.getPremio());
    }
    @Test
    public void testSetPremioVacio() {
        Sorteo instance = new Sorteo();
        instance.setPremio("");
        assertEquals("",instance.getPremio());
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Test setCantGanadores">
    @Test
    public void testSetCantGanadoresCorrecto() {
        Sorteo instance = new Sorteo();
        instance.setCantGanadores(3);
        assertEquals(3, instance.getCantGanadores());
    }
    @Test
    public void testSetCantGanadoresMinimo() {
        Sorteo instance = new Sorteo();
        instance.setCantGanadores(0);
        assertEquals(0, instance.getCantGanadores());
    }
    @Test
    public void testSetCantGanadoresMaximo() {
        Sorteo instance = new Sorteo();
        instance.setCantGanadores(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, instance.getCantGanadores());
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Test toString">
    @Test
    public void testToString() {
        Restaurante r = new Restaurante("La Pasiva", "Rivera y Soca", null, "Pizza");
        Sorteo instance = new Sorteo(r,"12-05-2015","25-09-2015","Milanesa al pan para dos.",2 );
        assertEquals("La Pasiva Premio: Milanesa al pan para dos.", instance.toString());

    }
    
//</editor-fold>

    

}
