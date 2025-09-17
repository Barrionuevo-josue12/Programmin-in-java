package ar.edu.unju.fi.managers;

import ar.edu.unju.fi.FacturaException;
import ar.edu.unju.fi.modelos.Factura;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ManagerFacturas {
    private static List<Factura> facturas;

    //metodos
    public static List <Factura> obtenerFacturasPorFecha(LocalDate fecha){
        List <Factura> auxiliar = new ArrayList<Factura> ();
        if(!facturas.isEmpty()){
            for(Factura f : facturas){
                if(f.getFecha().equals(fecha)){ //considera usar otra forma de usar la igualdad
                    auxiliar.add(f);
                }
            }
        }
        return auxiliar;
    }
    public static List <Factura> obtenerFacturasCliente(String dni){
        List <Factura> auxiliar = new ArrayList<Factura>();
        if(!facturas.isEmpty()){
         for(Factura f : facturas){
             if(f.getCliente().getDni().equals(dni)){
                 auxiliar.add(f);
             }
         }
        }
        return auxiliar;
    }
    public void crearFactura(Factura factura){
        try{
            controlFactura(factura); //arroja excepciones si la factura se encuentra en un estado indebido
            facturas.add(factura);
        }
        catch(FacturaException e){
            System.out.println(e.getMessage());
        }
    }
    private void controlFactura(Factura f) throws FacturaException {
        if(f == null){
             throw new FacturaException("Error: la factura es null");
        }
        if(f.getCliente()==null){
            throw new FacturaException("Error: la factura no posee un cliente");
        }
        //... mas excepciones
    }
}
