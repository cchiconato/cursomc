package com.nelioalves.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nelioalves.cursomc.domain.Pedido;

@Repository
public interface PedidoRespository extends JpaRepository<Pedido, Integer> {

}
