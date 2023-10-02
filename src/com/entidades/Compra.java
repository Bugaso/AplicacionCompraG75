package com.entidades;

import java.time.LocalDate;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Bugaso
 */
public class Compra {
    private int idCompra;
    private Proveedor proveedor;
    private LocalDate fecha;

    public Compra() {
    }

    public Compra(int idCompra, Proveedor proveedor, LocalDate fecha) {
        this.idCompra = idCompra;
        this.proveedor = proveedor;
        this.fecha = fecha;
    }
    
    
}
