/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Data;

import com.entidades.Compra;
import com.entidades.DetalleCompra;
import java.util.ArrayList;

/**
 *
 * @author Bugaso
 */
public class DetalleCompraData {
    private DetalleCompra detalleCompra;
    
    public DetalleCompraData(DetalleCompra detalleCompra) {
        this.detalleCompra = detalleCompra;
    }
    
    
    
    public void MostrarDetalles(){
        
        System.out.println(detalleCompra.getCompra().toString());
        
    }
}
