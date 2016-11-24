package com.implementado;

import com.dao.IProductoDao;
import com.modelos.ProductoCompra;
import com.servicios.IProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServicioProductoImpl implements IProductoServicio {
    @Autowired
    private IProductoDao productoDao;


    public ProductoCompra save(ProductoCompra productoCompra) {
        return productoDao.save(productoCompra);
    }


}
