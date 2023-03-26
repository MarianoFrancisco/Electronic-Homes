/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camposeco.proyecto1archivos.identidad;

/**
 *
 * @author Mariano
 */
public class Producto_Bodega {
    int id_bodega;
    String codigo_producto;
    String proveedor;
    int cantidad_bodega;

    public int getId_bodega() {
        return id_bodega;
    }

    public void setId_bodega(int id_bodega) {
        this.id_bodega = id_bodega;
    }

    public String getCodigo_producto() {
        return codigo_producto;
    }

    public void setCodigo_producto(String codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getCantidad_bodega() {
        return cantidad_bodega;
    }

    public void setCantidad_bodega(int cantidad_bodega) {
        this.cantidad_bodega = cantidad_bodega;
    }
    
}
