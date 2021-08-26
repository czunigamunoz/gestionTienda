/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cezun
 */
public class FacturaIT {
    Date fecha = new Date();
    Cliente clientePrueba = new Cliente(35435200,"Valentina","Ceron","8463443","CeronMV@gmail.com");
    Factura facturaPrueba = new Factura(fecha, 56700, 13300, 70000, clientePrueba);

    @Test
    public void testGetTotalSinIva() {
        double expected = 56700;
        double actual = facturaPrueba.getTotalSinIva();
        assertEquals(expected, actual, 0.00001);
    }

    @Test
    public void testSetTotalSinIva() {
        double expected = 58000;
        facturaPrueba.setTotalSinIva(58000);
        double actual = facturaPrueba.getTotalSinIva();
        assertEquals(expected, actual, 0.00001);
    }

    @Test
    public void testGetIva() {
        float expected = 13300;
        float actual = facturaPrueba.getIva();
        assertEquals(expected, actual, 0.00001);
    }

    @Test
    public void testSetIva() {
        float expected = 14000;
        facturaPrueba.setIva(14000);
        float actual = facturaPrueba.getIva();
        assertEquals(expected, actual, 0.00001);
    }

    @Test
    public void testGetTotalConIva() {
        double expected = 70000;
        double actual = facturaPrueba.getTotalConIva();
        assertEquals(expected, actual, 0.00001);
    }

    @Test
    public void testSetTotalConIva() {
        double expected = 60000;
        facturaPrueba.setTotalConIva(60000);
        double actual = facturaPrueba.getTotalConIva();
        assertEquals(expected, actual, 0.00001);
    }

    @Test
    public void testGetCliente() {
        Cliente expected = clientePrueba;
        Cliente actual = facturaPrueba.getCliente();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetCliente() {
        Cliente c1 = new Cliente(1002695412,"Alejandra","Solarte", "8763533","AlejaSol@hotmail.es");
        Cliente expected = c1;
        facturaPrueba.setCliente(c1);
        Cliente actual = facturaPrueba.getCliente();
        assertEquals(expected, actual);
    }
    
}
