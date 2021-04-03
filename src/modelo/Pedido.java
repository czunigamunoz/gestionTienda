/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author cezun
 */
public class Pedido {
    private int codigo;
    private int cantidad;
    private String estadoPedido;
    private ArrayList<Producto> productos;
    private ArrayList<Factura> facturas;

    public Pedido() {
        productos = new ArrayList<>();
        facturas = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public ArrayList<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(ArrayList<Factura> facturas) {
        this.facturas = facturas;
    }
    
    public Boolean agregarFactura(Factura factura){
        return facturas.add(factura);
    }
    
    public Boolean eliminarFactura(Factura factura){
        return facturas.remove(factura);
    }
    
    public Boolean agregarProductoPedido(Producto producto){
        return productos.add(producto);
    }
    
    public Producto buscarProductoPedido(String nombre){
        Producto productoTemp = null;
        for(int i=0; i<productos.size(); i++){
            if(nombre.equals(productos.get(i).getNombre())){
                productoTemp = productos.get(i);
                break;
            }
        }
        return productoTemp;
    }
    
    public Boolean eliminarProductoPedido(int codigoProducto){
        Boolean elimino = false;
        for(int i=0; i<productos.size(); i++){
            if(codigoProducto == productos.get(i).getCodigo()){
                productos.remove(i);
                elimino = true;
                break;
            }
        }
        return elimino;
    }
    
    public Object[][] mostrarProductoPedido(){
        Object data[][] = new Object[getProductos().size()][4];
        for(int i=0; i<productos.size(); i++){
            data[i][0] = productos.get(i).getCodigo();
            data[i][1] = productos.get(i).getNombre();
            data[i][2] = productos.get(i).getPrecio();
            data[i][3] = productos.get(i).getCantidad();
        }
        return data;
    }
}
