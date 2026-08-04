package com.perezjorge.PruebaTecSupermercado.repository;

import com.perezjorge.PruebaTecSupermercado.model.DetalleVenta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetalleVentaRepository extends JpaRepository<DetalleVenta, Long> {
}
