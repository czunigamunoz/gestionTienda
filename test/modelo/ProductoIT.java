
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cezun
 */
public class ProductoIT {
    Producto productoPrueba = new Producto(1, "Portatil ASUS ROG", 3200000,5,"15.6 pul, i7 16GB 1TB");

    @Test
    public void testGetCodigo() {
        int expected = 1;
        int actual = productoPrueba.getCodigo();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetCodigo() {
        int expected = 2;
        productoPrueba.setCodigo(2);
        int actual = productoPrueba.getCodigo();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetNombre() {
        String expected = "Portatil ASUS ROG";
        String actual = productoPrueba.getNombre();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetNombre() {
        String expected = "Portatil ROG III";
        productoPrueba.setNombre("Portatil ROG III");
        String actual = productoPrueba.getNombre();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetPrecio() {
        double expected = 3200000;
        double actual = productoPrueba.getPrecio();
        assertEquals(expected, actual, 0.00001);
    }

    @Test
    public void testSetPrecio() {
        double expected = 350000;
        productoPrueba.setPrecio(350000);
        double actual = productoPrueba.getPrecio();
        assertEquals(expected, actual, 0.00001);
    }

    @Test
    public void testGetCantidad() {
        int expected = 5;
        int actual = productoPrueba.getCantidad();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetCantidad() {
        int expected = 10;
        productoPrueba.setCantidad(10);
        int actual = productoPrueba.getCantidad();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetDescripcion() {
        String expected = "15.6 pul, i7 16GB 1TB";
        String actual = productoPrueba.getDescripcion();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetDescripcion() {
        String expected = "15.6 pul, i7 32GB 2TB";
        productoPrueba.setDescripcion("15.6 pul, i7 32GB 2TB");
        String actual = productoPrueba.getDescripcion();
        assertEquals(expected, actual);
    }
    
}
