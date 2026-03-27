package com.goncalo.exemplocrud.exemplocrud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goncalo.exemplocrud.exemplocrud.model.Conta;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long> {
    List<Conta> findByTitularId(Long usuarioId);
}
