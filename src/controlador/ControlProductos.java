/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Empresa;
import modelo.Producto;

/**
 *
 * @author valen
 */
public class ControlProductos {
    private final Empresa empresa;
    
    public ControlProductos() {

        empresa = new Empresa("Sistema Web");
        
        Producto p1 = new Producto(1, "Portatil ASUS ROG", 3200000,5,"15.6 pul, i7 16GB 1TB");
        Producto p2 = new Producto(2, "Xiaomi Redmi Note 10", 1000000,10," 8 Dual SIM 64 GB moonlight white 4 GB RAM" );
        Producto p3 = new Producto(3, "Parlante JBL", 600000,20,"JBL GO 2, 7,1 x 8,6 x 3,1 cm");
        Producto p4 = new Producto(4, "Portatil Acer Nitro 5", 3150000,7,"Core i5, 512 SSD, 15.6 GTX 1050Ti 4GB");
        Producto p5 = new Producto(5, "Mouse Logitech MX", 300000,15,"Inalambrico recargable");
        Producto p6 = new Producto(6, "Monitor Samsung X3", 700000,8," Monitor curvo 27\"60GHZ-VA");
        Producto p7 = new Producto(7, "Impresora EPSON N2", 400000,18,"Laser inalambrica recargable");
        Producto p8 = new Producto(8, "USB 8GB Kidstone", 70000,22,"128 GB");
        Producto p9 = new Producto(9, "Tablet Galaxy 8", 650000,20,"g 8 PuLG Ram 2gb Rom 32gb");
        Producto p10 = new Producto(10, "Amplificador WIFI Xiaomi", 90000,5,"4-antenas externas, 2.4 GHz WPS");
        
        empresa.agregarProducto(p1);
        empresa.agregarProducto(p2);
        empresa.agregarProducto(p3);
        empresa.agregarProducto(p4);
        empresa.agregarProducto(p5);
        empresa.agregarProducto(p6);
        empresa.agregarProducto(p7);
        empresa.agregarProducto(p8);
        empresa.agregarProducto(p9);
        empresa.agregarProducto(p10);
    }
    
    public Producto buscarProductoA(int codigo){
        return empresa.buscarProductoA(codigo);
    }  
    
    public Object[][] mostrarProducto(){
        return empresa.mostrar();
    }
      
    public Object[][] mostrarProducto(Producto producto){
        return empresa.mostrar(producto);
    }
    
    public Boolean agregarProducto (Producto producto){
        return empresa.agregarProducto(producto);
    }
    
     public Boolean eliminarProductoA(int codigo){
        return empresa.eliminarProductoA(codigo);
    }     
}
