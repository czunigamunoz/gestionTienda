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
public class Empresa {
    private String nombre;
    private ArrayList<Cliente> clientes;
    private ArrayList<Producto> productos;

    public Empresa(String nombre) {
        this.nombre = nombre;
        clientes = new ArrayList<Cliente>();
        productos = new ArrayList<Producto>();
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
      
    public Boolean agregarCliente(Cliente cliente){
        return clientes.add(cliente);
    }
    
    public Boolean agregarProducto(Producto producto){
        return productos.add(producto);
    }
    
    public Cliente buscarCliente(int identificacion){
        Cliente clienteTemp = null;
        for(int i=0; i<clientes.size(); i++){
            if(clientes.get(i).getIdentificacion() == identificacion){
                clienteTemp = clientes.get(i);
                break;
            }
        }        
        return clienteTemp;
    }
    
    public Boolean eliminarCliente(int identificacion){
        Boolean elimino = false;
        for(int i=0; i<clientes.size(); i++){
            if(identificacion == clientes.get(i).getIdentificacion()){
                clientes.remove(i);
                elimino = true;
                break;
            }
        }
        return elimino;
    }
       
    public Producto buscarProducto(String nombre){
        Producto productoTemp = null;
        for(int i=0; i<productos.size(); i++){
            if(nombre.equals(productos.get(i).getNombre())){
                productoTemp = productos.get(i);
                break;
            }
        }
        return productoTemp;
    }
    
    public Producto buscarProductoA(int codigo){
        Producto ProductoTemp = null;
        for(int i=0; i<productos.size(); i++){
            if(productos.get(i).getCodigo()== codigo){
                ProductoTemp = productos.get(i);
                break;
            }
        } 
        return ProductoTemp;
    }
    
    public Boolean eliminarProductoA(int codigoProducto){
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
    
    public Object[][] mostrarClientes(){
        Object data[][] = new Object[getClientes().size()][5];
        for(int i=0; i<clientes.size(); i++){
            data[i][0] = clientes.get(i).getIdentificacion();
            data[i][1] = clientes.get(i).getNombres();
            data[i][2] = clientes.get(i).getApellidos();
            data[i][3] = clientes.get(i).getTelefono();
            data[i][4] = clientes.get(i).getCorreo();            
        }
        return data;
    }
    
    public Object[][] mostrarClientes(Cliente cliente){
        Object data[][] = new Object[getClientes().size()][5];
        data[0][0] = cliente.getIdentificacion();
        data[0][1] = cliente.getNombres();
        data[0][2] = cliente.getApellidos();
        data[0][3] = cliente.getTelefono();
        data[0][4] = cliente.getCorreo();            
        return data;
    }
    
    public Object[][] mostrar(){
        Object data[][] = new Object[getProductos().size()][5];
        for(int i=0; i<productos.size(); i++){
            data[i][0] = productos.get(i).getCodigo();
            data[i][1] = productos.get(i).getNombre();
            data[i][2] = productos.get(i).getPrecio();
            data[i][3] = productos.get(i).getCantidad();
            data[i][4] = productos.get(i).getDescripcion();
        }
        return data;
    }
    
    public Object[][] mostrar(Producto producto){
        Object data[][] = new Object[1][5];
        data[0][0] = producto.getCodigo();
        data[0][1] = producto.getNombre();
        data[0][2] = producto.getPrecio();
        data[0][3] = producto.getCantidad();
        data[0][4] = producto.getDescripcion();
        return data;
    }
}
