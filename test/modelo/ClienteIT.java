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
public class ClienteIT {
    Cliente clientePrueba = new Cliente(35435200,"Valentina","Ceron","8463443","CeronMV@gmail.com");
    
    public ClienteIT() {
    }

    @Test
    public void testGetIdentificacion() {
        int expected = 35435200;
        int actual = clientePrueba.getIdentificacion();
        assertEquals(expected, actual);        
    }

    @Test
    public void testGetNombres() {
        String expected = "Valentina";
        String actual = clientePrueba.getNombres();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetApellidos() {
        String expected = "Ceron";
        String actual = clientePrueba.getApellidos();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetTelefono() {
        String expected = "8463443";
        String actual = clientePrueba.getTelefono();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetCorreo() {
        String expected = "CeronMV@gmail.com";
        String actual = clientePrueba.getCorreo();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetIdentificacion() {
        int expected = 36345234;
        clientePrueba.setIdentificacion(36345234);
        int actual = clientePrueba.getIdentificacion();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetNombres() {
        String expected = "Maria Valentina";
        clientePrueba.setNombres("Maria Valentina");
        String actual = clientePrueba.getNombres();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetApellidos() {
        String expected = "Ceron Monje";
        clientePrueba.setApellidos("Ceron Monje");
        String actual = clientePrueba.getApellidos();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetTelefono() {
        String expected = "3125678188";
        clientePrueba.setTelefono("3125678188");
        String actual = clientePrueba.getTelefono();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetCorreo() {
        String expected = "valentina@hotmail.com";
        clientePrueba.setCorreo("valentina@hotmail.com");
        String actual = clientePrueba.getCorreo();
        assertEquals(expected, actual);
    }
    
}
