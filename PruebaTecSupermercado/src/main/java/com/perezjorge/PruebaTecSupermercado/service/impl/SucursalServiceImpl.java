package com.perezjorge.PruebaTecSupermercado.service.impl;

import com.perezjorge.PruebaTecSupermercado.dto.SucursalDTO;
import com.perezjorge.PruebaTecSupermercado.model.Sucursal;

import java.util.List;

public interface SucursalServiceImpl {

    List <SucursalDTO> traerSucursales();
    SucursalDTO crearSucursal (SucursalDTO sucursalDto);
    SucursalDTO actualizarSucursal(Long id, SucursalDTO sucursaldto);
    void eliminarSucursal(Long id);
}
