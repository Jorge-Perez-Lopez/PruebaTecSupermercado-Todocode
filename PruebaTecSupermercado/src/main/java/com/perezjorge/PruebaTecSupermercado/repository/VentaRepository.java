package com.perezjorge.PruebaTecSupermercado.repository;

import com.perezjorge.PruebaTecSupermercado.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaRepository extends JpaRepository<Venta, Long> {
}
