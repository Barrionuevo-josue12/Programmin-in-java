package ar.edu.unju.fi.modelos;

import java.time.LocalDate;
import java.util.List;

public class Factura {
    private int nroFactura;
    private Cliente cliente;
    private LocalDate fecha;
    private double todalSinDesc;
    private double descuento;
    private double totalConDescuento;
    private List<DetalleFactura> detallesFactura;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFecha() {
        return this.fecha;
    }
}
