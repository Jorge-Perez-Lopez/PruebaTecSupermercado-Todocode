package com.perezjorge.PruebaTecSupermercado.dto;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor

public class VentaDTO {

     // Datos de la venta

    private Long id;
    private LocalDate fecha;
    private String estado;

    // Datos de la sucursal

    private Long idSucursal;

    // Lista de Detalles

    private List<DetalleVentaDTO> detalle;

    // Total de la Venta

    private Double total;

}
