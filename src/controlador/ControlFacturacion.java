/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Cliente;
import modelo.Producto;
import modelo.Pedido;
import modelo.Empresa;
import modelo.Factura;

/**
 *
 * @author cezun
 */
public class ControlFacturacion {
    private Producto producto;
    private final Pedido pedido;
    private final Empresa empresa;

    public ControlFacturacion() {
        pedido = new Pedido();
        empresa = new Empresa("Sistema Web");
        Cliente c1 = new Cliente(100293852,"Andres","Segura","8345632","andress@gmail.com");
        Cliente c2 = new Cliente(45456451,"Felipe","Garces","8432544","felipeG@hotmail.es");
        Cliente c3 = new Cliente(35435200,"Valentina","Ceron","8463443","CeronMV@gmail.com");
        Cliente c4 = new Cliente(1029484,"Gustavo","Ulchur", "8643434","Gus124@hotmail.com");
        Cliente c5 = new Cliente(3262012,"Eduar","Sanchez", "8456645","SanchezE@hotmail.com");
        Cliente c6 = new Cliente(1002695412,"Alejandra","Solarte", "8763533","AlejaSol@hotmail.es");
        Cliente c7 = new Cliente(455698753,"Jose Deivi","Mera", "8456634","MeraDeivi@gmail.com");
        Cliente c8 = new Cliente(34698521,"Jully", "Muñoz", "8563643","JullyM@gmail.com");
        Cliente c9 = new Cliente(781066302,"Eduar Hernan","Tuqueres", "8456345","TuqueresE@gmail.com");
        Cliente c10 = new Cliente(1222934830,"Mayer","Guzman","8546753","MayerG@hotmail.com");
        
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
        
        empresa.agregarCliente(c1);
        empresa.agregarCliente(c2);
        empresa.agregarCliente(c3);
        empresa.agregarCliente(c4);
        empresa.agregarCliente(c5);
        empresa.agregarCliente(c6);
        empresa.agregarCliente(c7);
        empresa.agregarCliente(c8);
        empresa.agregarCliente(c9);
        empresa.agregarCliente(c10);
        
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
    
    public Cliente buscarCliente(int identificacion){
        return empresa.buscarCliente(identificacion);        
    }
    
    public Producto buscarProducto(String nombre){
        return empresa.buscarProducto(nombre);
    }
    
    public Object[][] mostrarProducto(){
        return empresa.mostrar();
    }
    
    public Object[][] mostrarProducto(Producto producto){
        return empresa.mostrar(producto);
    }
    
    public void setCodigo(int cod){
        pedido.setCodigo(cod);
    }
    
    public int obtenerCodigo(){
        return pedido.getCodigo();
    }
    
    public Boolean agregarProductoPedido(int codigo, String nombre, double precio,int cantidad, String descripcion){
        producto = new Producto(codigo,nombre,precio,cantidad,descripcion);
        return pedido.agregarProductoPedido(producto);
    }
    
    public Producto buscarProductoPedido(String nombre){
        return pedido.buscarProductoPedido(nombre);
    }
      
    public Boolean eliminarProductoPedido(int codigo){
        return pedido.eliminarProductoPedido(codigo);
    }
    
    public Object[][] mostrarProductoPedido(){
        return pedido.mostrarProductoPedido();
    }
    
    public Boolean agregarFactura(Factura factura){
        return pedido.agregarFactura(factura);
    }
}

