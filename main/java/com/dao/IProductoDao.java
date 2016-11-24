package com.dao;

import com.modelos.ProductoCompra;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoDao extends CrudRepository<ProductoCompra,Integer>{
    ProductoCompra save(ProductoCompra productoCompra);
}
