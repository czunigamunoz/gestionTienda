/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Cliente;
import modelo.Empresa;

/**
 *
 * @author cezun
 */
public class ControlCliente {
    private final Empresa empresa;
    
    public ControlCliente(){
        empresa = new Empresa("Sistema Web");        
        
        Cliente c1 = new Cliente(100293852,"Alejandro","constain","8345632","alejandro@gmail.com");
        Cliente c2 = new Cliente(45456451,"Felipe","Garces","8432544","felipeG@hotmail.es");
        Cliente c3 = new Cliente(35435200,"Valentina","Ceron","8463443","CeronMV@gmail.com");
        Cliente c4 = new Cliente(1029484,"Gustavo","Ulchur", "8643434","Gus124@hotmail.com");
        Cliente c5 = new Cliente(3262012,"Eduar","Sanchez", "8456645","SanchezE@hotmail.com");
        Cliente c6 = new Cliente(1002695412,"Alejandra","Solarte", "8763533","AlejaSol@hotmail.es");
        Cliente c7 = new Cliente(455698753,"Jose Deivi","Mera", "8456634","MeraDeivi@gmail.com");
        Cliente c8 = new Cliente(34698521,"Jully", "Muñoz", "8563643","JullyM@gmail.com");
        Cliente c9 = new Cliente(781066302,"Eduar Hernan","Tuqueres", "8456345","TuqueresE@gmail.com");
        Cliente c10 = new Cliente(1222934830,"Mayer","Guzman","8546753","MayerG@hotmail.com");
        
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
    }
    
    public Object[][] mostrarCliente(){
        return empresa.mostrarClientes();
    }
    
    public Object[][] mostrarcliente(Cliente cliente){
        return empresa.mostrarClientes(cliente);
    }
    
    public Cliente buscarCliente(int identificacion){
        return empresa.buscarCliente(identificacion);        
    }
    
    public Boolean agregarCliente(Cliente cliente){
        return empresa.agregarCliente(cliente);
    }
    
    public Boolean eliminarCliente(int identificacion){
        return empresa.eliminarCliente(identificacion);
    }
}
