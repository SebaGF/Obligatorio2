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

    //<editor-fold defaultstate="collapsed" desc="Test validarStringNoVacio">
    @Test
    public void testValidarStringNoVacioNula() {
        Sistema s = new Sistema();
        boolean result = s.validarStringNoVacio(null, 1, 3);
        assertEquals(false, result);
    }

    @Test
    public void testValidarStringNoVacioVacio() {
        Sistema s = new Sistema();
        boolean result = s.validarStringNoVacio("", 1, 3);
        assertEquals(false, result);
    }

    @Test
    public void testValidarStringNoVacioMenorMinimo() {
        Sistema s = new Sistema();
        boolean result = s.validarStringNoVacio("texto", 6, 10);
        assertEquals(false, result);
    }

    @Test
    public void testValidarStringNoVacioMayorMaximo() {
        Sistema s = new Sistema();
        boolean result = s.validarStringNoVacio("texto", 1, 3);
        assertEquals(false, result);
    }

    @Test
    public void testValidarStringNoVacioEntreMinYMax() {
        Sistema s = new Sistema();
        boolean result = s.validarStringNoVacio("texto", 1, 10);
        assertEquals(true, result);
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Test estaEvaluacionSorteo">

    @Test
    public void testEstaEvaluacionSorteoSi() {
        Restaurante restaurant = new Restaurante("Barbacoa Carrasco", "Bolivia", new ManejadorHorario(), "Megamilapizza");
        Evaluacion evaluation = new Evaluacion(5, "Buena", "Pedro Ormaicheaga", "pedro24Orma@gmail.com", restaurant);
        Sistema instance = new Sistema();
        instance.getLstEvaluacionSorteo().add(evaluation);
        assertEquals(true, instance.estaEvaluacionSorteo(evaluation.getMail(), restaurant.getDireccion()));
    }

    @Test
    public void testEstaEvaluacionSorteoNoMail() {
        Restaurante restaurant = new Restaurante("Barbacoa Carrasco", "Bolivia", new ManejadorHorario(), "Megamilapizza");
        Evaluacion evaluation = new Evaluacion(5, "Buena", "Pedro Ormaicheaga", "pedro24Orma@gmail.com", restaurant);
        Sistema instance = new Sistema();
        instance.getLstEvaluacionSorteo().add(evaluation);
        assertEquals(false, instance.estaEvaluacionSorteo("sebagf@gmail.com", restaurant.getDireccion()));
    }

    @Test
    public void testEstaEvaluacionSorteoMailNull() {
        Restaurante restaurant = new Restaurante("Barbacoa Carrasco", "Bolivia", new ManejadorHorario(), "Megamilapizza");
        Evaluacion evaluation = new Evaluacion(5, "Buena", "Pedro Ormaicheaga", "pedro24Orma@gmail.com", restaurant);
        Sistema instance = new Sistema();
        instance.getLstEvaluacionSorteo().add(evaluation);
        assertEquals(false, instance.estaEvaluacionSorteo(null, restaurant.getDireccion()));
    }

    @Test
    public void testEstaEvaluacionSorteoMailVacia() {
        Restaurante restaurant = new Restaurante("Barbacoa Carrasco", "Bolivia", new ManejadorHorario(), "Megamilapizza");
        Evaluacion evaluation = new Evaluacion(5, "Buena", "Pedro Ormaicheaga", "pedro24Orma@gmail.com", restaurant);
        Sistema instance = new Sistema();
        instance.getLstEvaluacionSorteo().add(evaluation);
        assertEquals(false, instance.estaEvaluacionSorteo("", restaurant.getDireccion()));
    }

    @Test
    public void testEstaEvaluacionSorteoRestauranteVacia() {
        Restaurante restaurant = new Restaurante("Barbacoa Carrasco", "Bolivia", new ManejadorHorario(), "Megamilapizza");
        Evaluacion evaluation = new Evaluacion(5, "Buena", "Pedro Ormaicheaga", "pedro24Orma@gmail.com", restaurant);
        Sistema instance = new Sistema();
        instance.getLstEvaluacionSorteo().add(evaluation);
        assertEquals(false, instance.estaEvaluacionSorteo("pedro24Orma@gmail.com", ""));
    }

    @Test
    public void testEstaEvaluacionSorteoRestauranteNo() {
        Restaurante restaurant = new Restaurante("Barbacoa Carrasco", "Bolivia", new ManejadorHorario(), "Megamilapizza");
        Evaluacion evaluation = new Evaluacion(5, "Buena", "Pedro Ormaicheaga", "pedro24Orma@gmail.com", restaurant);
        Sistema instance = new Sistema();
        instance.getLstEvaluacionSorteo().add(evaluation);
        assertEquals(false, instance.estaEvaluacionSorteo("pedro24Orma@gmail.com", "RioNegro 23"));
    }

    @Test
    public void testEstaEvaluacionSorteoRestauranteNull() {
        Restaurante restaurant = new Restaurante("Barbacoa Carrasco", "Bolivia", new ManejadorHorario(), "Megamilapizza");
        Evaluacion evaluation = new Evaluacion(5, "Buena", "Pedro Ormaicheaga", "pedro24Orma@gmail.com", restaurant);
        Sistema instance = new Sistema();
        instance.getLstEvaluacionSorteo().add(evaluation);
        assertEquals(false, instance.estaEvaluacionSorteo("pedro24Orma@gmail.com", null));
    }

    @Test
    public void testEstaEvaluacionSorteoNull() {
        Restaurante restaurant = new Restaurante("Barbacoa Carrasco", "Bolivia", new ManejadorHorario(), "Megamilapizza");
        Evaluacion evaluation = new Evaluacion(5, "Buena", "Pedro Ormaicheaga", "pedro24Orma@gmail.com", restaurant);
        Sistema instance = new Sistema();
        instance.getLstEvaluacionSorteo().add(evaluation);
        assertEquals(false, instance.estaEvaluacionSorteo(null, null));
    }

    @Test
    public void testEstaEvaluacionSorteoVacio() {
        Restaurante restaurant = new Restaurante("Barbacoa Carrasco", "Bolivia", new ManejadorHorario(), "Megamilapizza");
        Evaluacion evaluation = new Evaluacion(5, "Buena", "Pedro Ormaicheaga", "pedro24Orma@gmail.com", restaurant);
        Sistema instance = new Sistema();
        instance.getLstEvaluacionSorteo().add(evaluation);
        assertEquals(false, instance.estaEvaluacionSorteo("", ""));
    }

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Test estaRestaurante">
    @Test
    public void testEstaRestauranteOk() {
        Restaurante restaurant = new Restaurante("Barbacoa Carrasco", "Bolivia", new ManejadorHorario(), "Megamilapizza");
        Sistema instance = new Sistema();
        instance.getLstRestaurantes().add(restaurant);
        assertEquals(true, instance.estaRestaurante("Bolivia"));
    }

    @Test
    public void testEstaRestauranteNo() {
        Restaurante restaurant = new Restaurante("Barbacoa Carrasco", "Bolivia", new ManejadorHorario(), "Megamilapizza");
        Sistema instance = new Sistema();
        instance.getLstRestaurantes().add(restaurant);
        assertEquals(false, instance.estaRestaurante("Av Italia"));
    }

    @Test
    public void testEstaRestauranteVacio() {
        Restaurante restaurant = new Restaurante("Barbacoa Carrasco", "Bolivia", new ManejadorHorario(), "Megamilapizza");
        Sistema instance = new Sistema();
        instance.getLstRestaurantes().add(restaurant);
        assertEquals(false, instance.estaRestaurante(""));
    }

    @Test
    public void testEstaRestauranteNull() {
        Restaurante restaurant = new Restaurante("Barbacoa Carrasco", "Bolivia", new ManejadorHorario(), "Megamilapizza");
        Sistema instance = new Sistema();
        instance.getLstRestaurantes().add(restaurant);
        assertEquals(false, instance.estaRestaurante(null));
    }

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Test validarNumero">
    @Test
    public void testValidarNumeroOk(){
        Sistema instance = new Sistema();
        assertEquals(true, instance.validarNumero(4, 1, 8));
    }
    @Test
    public void testValidarNumeroFueraRangoSuperior(){
        Sistema instance = new Sistema();
        assertEquals(false, instance.validarNumero(4, 1, 2));
    }
    @Test
    public void testValidarNumeroFueraRangoInferior(){
        Sistema instance = new Sistema();
        assertEquals(false, instance.validarNumero(0, 1, 4));
    }
    @Test
    public void testValidarNumeroNoNumerico(){
        Sistema instance = new Sistema();
        try{
            instance.validarNumero(Integer.parseInt("a"), 1, 4);
            fail();
        }catch(NumberFormatException e){
            
        }
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Test getLstEvaluacion">
    @Test
    public void testGetLstEvaluacion(){
        Sistema instance = new Sistema();
        instance.getLstEvaluacion().add(new Evaluacion(5, "Todo ok", null));
        assertNotEquals(0, instance.getLstEvaluacion().size());
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Test validarFecha">
     @Test
    public void testFechaCorrecta() {
        Sistema s = new Sistema();
        boolean result = s.validarFecha("17-02-1996");
        assertEquals(true, result);
    }
    @Test
    public void testFechaDiaIncorrecto() {
        Sistema s = new Sistema();
        boolean result = s.validarFecha("34-05-1996");
        assertEquals(false, result);
    }
    @Test
    public void testFechaCorrectaMesIncorrecto() {
        Sistema s = new Sistema();
        boolean result = s.validarFecha("15-18-2005");
        assertEquals(false, result);
    }
    @Test
    public void testFechaCorrecta30Febrero() {
        Sistema s = new Sistema();
        boolean result = s.validarFecha("30-02-2004");
        assertEquals(false, result);
    }
    @Test
    public void testFechaCorrectaVacio() {
        Sistema s = new Sistema();
        boolean result = s.validarFecha("");
        assertEquals(false, result);
    }
    @Test
    public void testFechaCorrectaNulo() {
        Sistema s = new Sistema();
        boolean result = s.validarFecha(null);
        assertEquals(false,result);
    }
    @Test
    public void testFechaCorrecta29FebreroBisiesto() {
        Sistema s = new Sistema();
        boolean result = s.validarFecha("29-02-2016");
        assertEquals(true, result);
    }
    @Test
    public void testFechaCorrecta29FebreroNoBisiesto() {
        Sistema s = new Sistema();
        boolean result = s.validarFecha("29-02-2017");
        assertEquals(false, result);
    }
    
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Test comparaFechas">
    @Test
    public void testComparaFechasPrimeraDiaMasChica() {
        Sistema s = new Sistema();
        boolean result = s.comparaFechas("17-02-201","25-02-2012");
        assertEquals(true, result);
    }
    @Test
    public void testComparaFechasPrimeraMesMasChico() {
        Sistema s = new Sistema();
        boolean result = s.comparaFechas("17-02-2012","25-05-2012");
        assertEquals(true, result);
    }
    @Test
    public void testComparaFechasPrimeraAnoMasChico() {
        Sistema s = new Sistema();
        boolean result = s.comparaFechas("17-02-2010","25-05-2012");
        assertEquals(true, result);
    }
    @Test
    public void testComparaFechasPrimeraDiaMasGrande() {
        Sistema s = new Sistema();
        boolean result = s.comparaFechas("29-02-2012","25-02-2012");
        assertEquals(false, result);
    }
    @Test
    public void testComparaFechasPrimeraMesMasGrande() {
        Sistema s = new Sistema();
        boolean result = s.comparaFechas("17-12-2012","25-05-2012");
        assertEquals(false, result);
    }
    @Test
    public void testComparaFechasPrimeraAnoMasGrande() {
        Sistema s = new Sistema();
        boolean result = s.comparaFechas("17-02-2014","25-05-2012");
        assertEquals(false, result);
    }
    @Test
    public void testComparaFechasIguales() {
        Sistema s = new Sistema();
        boolean result = s.comparaFechas("17-02-2012","17-02-2012");
        assertEquals(false, result);
    }
    @Test
    public void testComparaFechasVacias() {
        Sistema s = new Sistema();
        boolean result = s.comparaFechas("","");
        assertEquals(false, result);
    }
   
    
    
//</editor-fold>
   
}
