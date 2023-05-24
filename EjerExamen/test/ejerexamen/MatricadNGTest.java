/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package ejerexamen;

import java.util.ArrayList;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 * @author Alumno
 */
public class MatricadNGTest {

    public MatricadNGTest() {
    }
    static String[] prueba;
    static String[] vacia;

    @BeforeClass
    public static void setUpClass() throws Exception {
        prueba = new String[]{"hola", "que", "tal", "cómo", "estás", "hola",};

    }

    @Test
    public void constructor1() {
        Matricad a = new Matricad(null);

    }

    @Test
    public void constructor2() {
        Matricad b = new Matricad(vacia);

    }

    @Test
    public void constructor3() {
        Matricad c = new Matricad(prueba);

    }

    /**
     * Test of getCantidadCadenasQueEmpiezanCon method, of class Matricad.
     */
    @Test
    public void testGetCantidadCadenasQueEmpiezanCon() {
        System.out.println("getCantidadCadenasQueEmpiezanCon");
        char letra = ' ';
        Matricad instance = null;
        int expResult = 0;
        int result = instance.getCantidadCadenasQueEmpiezanCon(letra);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of hayCadenasQueEmpiezanPor method, of class Matricad.
     */
    @Test
    public void testHayCadenasQueEmpiezanPor() {
        System.out.println("hayCadenasQueEmpiezanPor");
        char letra = 't';
        Matricad instance = null;
        boolean expResult = false;
        boolean result = instance.hayCadenasQueEmpiezanPor(letra);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getConcatenacionCadenas method, of class Matricad.
     */
    public void testGetConcatenacionCadenas() {
        System.out.println("getConcatenacionCadenas");
        Matricad instance = null;
        String expResult = "";
        String result = instance.getConcatenacionCadenas();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getPosicionesDe method, of class Matricad.
     */
    @Test
    public void testGetPosicionesDe() {
        System.out.println("getPosicionesDe");
        String unaCadena = "adios";
        Matricad instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getPosicionesDe(unaCadena);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

}
