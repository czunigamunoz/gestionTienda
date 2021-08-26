/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cezun
 */
public class PedidoIT {
        Pedido pedido = new Pedido();
        Producto productoPrueba = new Producto(1, "Portatil ASUS ROG", 3200000,5,"15.6 pul, i7 16GB 1TB");
    
    public PedidoIT() {
        pedido.agregarProductoPedido(productoPrueba);
    }

    @Test
    public void testBuscarProductoPedido() {
        Producto expected = productoPrueba;
        Producto actual = pedido.buscarProductoPedido("Portatil ASUS ROG");
        assertEquals(expected, actual);
    }

    @Test
    public void testEliminarProductoPedido() {
        Boolean expected = true;
        Boolean actual = pedido.eliminarProductoPedido(1);
        assertEquals(expected, actual);
    }

    @Test
    public void testMostrarProductoPedido() {
        Object dataExpected[][] = new Object[1][4];
        dataExpected[0][0] = 1;
        dataExpected[0][1] = "Portatil ASUS ROG";
        dataExpected[0][2] = (double) 3200000;
        dataExpected[0][3] = 5;
        Object dataActual[][] = pedido.mostrarProductoPedido();
        Assert.assertArrayEquals(dataExpected, dataActual);
    }
    
}
