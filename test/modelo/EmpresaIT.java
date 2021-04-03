/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cezun
 */
public class EmpresaIT {
    Empresa empresa = new Empresa("Sistema Web");
    Cliente clientePrueba = new Cliente(35435200,"Valentina","Ceron","8463443","CeronMV@gmail.com");
    Producto productoPrueba = new Producto(1, "Portatil ASUS ROG", 3200000,5,"15.6 pul, i7 16GB 1TB");

    public EmpresaIT() {
        empresa.agregarCliente(clientePrueba);
        empresa.agregarProducto(productoPrueba);
    }

    @Test
    public void testGetNombre() {
        String expected = "Sistema Web";
        String actual = empresa.getNombre();
        assertEquals(expected, actual);        
    }

    @Test
    public void testSetNombre() {
        String expected = "Sistema Web 2";
        empresa.setNombre("Sistema Web 2");
        String actual = empresa.getNombre();
        assertEquals(expected, actual);        
    }

    @Test
    public void testGetClientes() {
        ArrayList<Cliente> expected = new ArrayList<>();
        expected.add(clientePrueba);
        ArrayList<Cliente> actual = empresa.getClientes();
        assertEquals(expected, actual);    
    }

    @Test
    public void testSetClientes() {
        ArrayList<Cliente> expected = new ArrayList<>();
        Cliente c1 = new Cliente(455698753,"Jose Deivi","Mera", "8456634","MeraDeivi@gmail.com");
        Cliente c2 = new Cliente(34698521,"Jully", "Muñoz", "8563643","JullyM@gmail.com");
        expected.add(c1);
        expected.add(c2);        
        empresa.setClientes(expected);
        ArrayList<Cliente> actual = empresa.getClientes();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetProductos() {
        ArrayList<Producto> expected = new ArrayList<>();
        expected.add(productoPrueba);
        ArrayList<Producto> actual = empresa.getProductos();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetProductos() {
        ArrayList<Producto> expected = new ArrayList<>();
        Producto p1 = new Producto(6, "Monitor Samsung X3", 700000,8," Monitor curvo 27\"60GHZ-VA");
        Producto p2 = new Producto(7, "Impresora EPSON N2", 400000,18,"Laser inalambrica recargable");
        expected.add(p1);
        expected.add(p2);
        empresa.setProductos(expected);
        ArrayList<Producto> actual = empresa.getProductos();
        assertEquals(expected, actual);
    }

    @Test
    public void testAgregarCliente() {
        Boolean expected = true;
        Boolean actual = empresa.agregarCliente(clientePrueba);
        assertEquals(expected, actual);    
    }
    
    @Test
    public void testBuscarCliente() {
        Cliente expected = clientePrueba;
        Cliente actual = empresa.buscarCliente(clientePrueba.getIdentificacion());
        assertEquals(expected, actual);
    }

    @Test
    public void testEliminarCliente() {
        Boolean expected = true;
        Boolean actual = empresa.eliminarCliente(clientePrueba.getIdentificacion());
        assertEquals(expected, actual);
    }

    @Test
    public void testAgregarProducto() {
        Boolean expected = true;
        Boolean actual = empresa.agregarProducto(productoPrueba);
        assertEquals(expected, actual);
    }

    @Test
    public void testBuscarProducto() {
        Producto expected = productoPrueba;
        Producto actual = empresa.buscarProducto(productoPrueba.getNombre());
        assertEquals(expected, actual);
    }

    @Test
    public void testMostrarClientes_0args() {
        Object dataExpected[][] = new Object[1][5];
        dataExpected[0][0] = 35435200;
        dataExpected[0][1] = "Valentina";
        dataExpected[0][2] = "Ceron";
        dataExpected[0][3] = "8463443";
        dataExpected[0][4] = "CeronMV@gmail.com";
        Object dataActual[][] = empresa.mostrarClientes();
        Assert.assertArrayEquals(dataExpected, dataActual);
    }

    @Test
    public void testMostrarClientes_Cliente() {
        Object dataExpected[][] = new Object[1][5];
        dataExpected[0][0] = 35435200;
        dataExpected[0][1] = "Valentina";
        dataExpected[0][2] = "Ceron";
        dataExpected[0][3] = "8463443";
        dataExpected[0][4] = "CeronMV@gmail.com";
        Object dataActual[][] = empresa.mostrarClientes(clientePrueba);
        Assert.assertArrayEquals(dataExpected, dataActual);
    }

    @Test
    public void testMostrar_0args() {
        Object dataExpected[][] = new Object[1][5];
        dataExpected[0][0] = 1;
        dataExpected[0][1] = "Portatil ASUS ROG";
        dataExpected[0][2] = (double) 3200000;
        dataExpected[0][3] = 5;
        dataExpected[0][4] = "15.6 pul, i7 16GB 1TB";
        Object dataActual[][] = empresa.mostrar();
        Assert.assertArrayEquals(dataExpected, dataActual);
    }

    @Test
    public void testMostrar_Producto() {
        Object dataExpected[][] = new Object[1][5];
        dataExpected[0][0] = 1;
        dataExpected[0][1] = "Portatil ASUS ROG";
        dataExpected[0][2] = (double) 3200000;
        dataExpected[0][3] = 5;
        dataExpected[0][4] = "15.6 pul, i7 16GB 1TB";
        Object dataActual[][] = empresa.mostrar(productoPrueba);
        Assert.assertArrayEquals(dataExpected, dataActual);        
    }
    
}
