/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author cezun
 */
public class Factura {
    private Date fecha;
    private double totalSinIva = 0;
    private float iva;
    private double totalConIva = 0;
    private Cliente cliente;

    public Factura(Date fecha, double totalSinIva, float iva, double totalConIva, Cliente cliente) {
        this.fecha = fecha;
        this.totalSinIva = totalSinIva;
        this.iva = iva;
        this.totalConIva = totalConIva;
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTotalSinIva() {
        return totalSinIva;
    }

    public void setTotalSinIva(double totalSinIva) {
        this.totalSinIva = totalSinIva;
    }
    
    public float getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public double getTotalConIva() {
        return totalConIva;
    }

    public void setTotalConIva(double totalConIva) {
        this.totalConIva = totalConIva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
