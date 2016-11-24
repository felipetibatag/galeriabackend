package com.controlador;


import com.modelos.ProductoCompra;

import com.servicios.IProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/producto")
public class ControladorProducto {
    @Autowired
    private IProductoServicio productoServicio;


    @RequestMapping(value = "/compra", method = RequestMethod.POST, consumes = {"application/json"})
    public ProductoCompra compra(@RequestBody ProductoCompra productoCompra){
        System.out.println("PPPPPPPPPPPPPPP" + productoCompra.get_nombre() + "ppppppppppppppp");
        return productoServicio.save(productoCompra);
    }
}
