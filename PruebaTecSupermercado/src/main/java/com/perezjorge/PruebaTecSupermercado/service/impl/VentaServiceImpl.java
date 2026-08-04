package com.perezjorge.PruebaTecSupermercado.service.impl;

import com.perezjorge.PruebaTecSupermercado.dto.VentaDTO;

import java.util.List;

public interface VentaServiceImpl {

    List<VentaDTO> traerVentas();
    VentaDTO crearVenta(VentaDTO ventaDto);
    VentaDTO actualizarVenta(Long id, VentaDTO ventaDto);
    void eliminarVenta(Long id);
}
