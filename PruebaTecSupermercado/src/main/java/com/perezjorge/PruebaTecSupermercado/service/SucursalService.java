package com.perezjorge.PruebaTecSupermercado.service;

import com.perezjorge.PruebaTecSupermercado.dto.SucursalDTO;
import com.perezjorge.PruebaTecSupermercado.exception.NotFoundException;
import com.perezjorge.PruebaTecSupermercado.mapper.Mapper;
import com.perezjorge.PruebaTecSupermercado.model.Sucursal;
import com.perezjorge.PruebaTecSupermercado.repository.SucursalRepository;
import com.perezjorge.PruebaTecSupermercado.service.impl.SucursalServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SucursalService implements SucursalServiceImpl {

    @Autowired
    private SucursalRepository repo;

    @Override
    public List<SucursalDTO> traerSucursales() {
        return repo.findAll()
                .stream()
                .map(Mapper::toDTO)
                .toList();
    }

    @Override
    public SucursalDTO crearSucursal(SucursalDTO sucursalDto) {
        Sucursal suc = Sucursal.builder()
                .nombre(sucursalDto.getNombre())
                .direccion(sucursalDto.getDireccion())
                .build();

        return Mapper.toDTO(repo.save(suc));
    }

    @Override
    public SucursalDTO actualizarSucursal(Long id, SucursalDTO sucursalDto) {
        Sucursal suc = repo.findById(id)
                .orElseThrow(() -> new NotFoundException("Sucursal no encontrada"));

        suc.setNombre(sucursalDto.getNombre());
        suc.setDireccion(sucursalDto.getDireccion());

        return Mapper.toDTO(repo.save(suc));
    }

    @Override
    public void eliminarSucursal(Long id) {
        if (!repo.existsById(id))
            throw new NotFoundException("Sucursal no encontrada");

        repo.deleteById(id);
    }
}