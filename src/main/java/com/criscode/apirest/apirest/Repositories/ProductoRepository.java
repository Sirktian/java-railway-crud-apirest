package com.criscode.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.criscode.apirest.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
