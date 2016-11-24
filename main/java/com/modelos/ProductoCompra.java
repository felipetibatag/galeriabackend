package com.modelos;

import javax.persistence.*;

@Entity
public class ProductoCompra {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int _codigoCompra;
    @Column
    private int _codigoProducto;
    @Column
    private int _precio;
    @Column
    private String _nombre;

    public ProductoCompra() {
    }

    public ProductoCompra(int _codigoProducto, int _precio, String _nombre) {
        this._codigoProducto = _codigoProducto;
        this._precio = _precio;
        this._nombre = _nombre;
    }

    public int get_codigoCompra() {
        return _codigoCompra;
    }

    public void set_codigoCompra(int _codigoCompra) {
        this._codigoCompra = _codigoCompra;
    }

    public int get_codigoProducto() {
        return _codigoProducto;
    }

    public void set_codigoProducto(int _codigoProducto) {
        this._codigoProducto = _codigoProducto;
    }

    public int get_precio() {
        return _precio;
    }

    public void set_precio(int _precio) {
        this._precio = _precio;
    }

    public String get_nombre() {
        return _nombre;
    }

    public void set_nombre(String _nombre) {
        this._nombre = _nombre;
    }
}
