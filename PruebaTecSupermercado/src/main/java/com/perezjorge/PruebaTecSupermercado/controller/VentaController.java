package com.perezjorge.PruebaTecSupermercado.controller;

import com.perezjorge.PruebaTecSupermercado.dto.VentaDTO;
import com.perezjorge.PruebaTecSupermercado.service.impl.VentaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/ventas")

public class VentaController {

    @Autowired

    private VentaServiceImpl ventaService;

    @GetMapping

    public ResponseEntity<List<VentaDTO>> traerVentas() {

        return ResponseEntity.ok(ventaService.traerVentas());
    }

    @PostMapping

    public ResponseEntity <VentaDTO> crearVenta(@RequestBody VentaDTO dto) {

        VentaDTO creada = ventaService.crearVenta(dto);

        return ResponseEntity.created(URI.create("/api/ventas" + creada.getId())).body(creada);
    }

    @PutMapping("/{id}")
    public ResponseEntity<VentaDTO> actualizarVenta (@PathVariable Long id,
                                                           @RequestBody VentaDTO dto) {
        return ResponseEntity.ok(ventaService.actualizarVenta(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> borrarVenta (@PathVariable Long id) {
        ventaService.eliminarVenta(id);
        return ResponseEntity.noContent().build();
    }
}
