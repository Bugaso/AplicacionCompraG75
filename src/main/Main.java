/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import accesoADatos.CompraData;
import accesoADatos.DetalleCompraData;
import entidades.Compra;
import entidades.DetalleCompra;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import vistas.MenuPrincipal;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MenuPrincipal menu = new MenuPrincipal();
       menu.setVisible(true);
       /*
       DetalleCompraData detaCD = new DetalleCompraData();
       
       ArrayList<DetalleCompra> detalles = detaCD.productosDeUnaCompraDeUnaFecha(LocalDate.of(2023, Month.OCTOBER, 26));
       
       for(DetalleCompra detalle : detalles){
           System.out.println(detalle.toString());
       }
        */
       
       //CompraData compraD = new CompraData();
       //Compra compra = compraD.buscarCompra(54);
       //System.out.println(compra.toString());
    }
    
}
