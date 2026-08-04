package com.perezjorge.PruebaTecSupermercado.repository;

import com.perezjorge.PruebaTecSupermercado.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
