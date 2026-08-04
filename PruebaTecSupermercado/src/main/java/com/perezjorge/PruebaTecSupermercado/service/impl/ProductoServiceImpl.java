package com.perezjorge.PruebaTecSupermercado.service.impl;

import com.perezjorge.PruebaTecSupermercado.dto.ProductoDTO;

import java.util.List;

public interface ProductoServiceImpl {

    List<ProductoDTO> traerProductos();
    ProductoDTO crearProducto(ProductoDTO productoDto);
    ProductoDTO actualizarProducto(Long id, ProductoDTO productoDto);
    void eliminarProducto(Long id);

}
