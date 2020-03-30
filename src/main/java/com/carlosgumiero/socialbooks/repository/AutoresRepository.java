package com.carlosgumiero.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlosgumiero.socialbooks.domain.Autor;

public interface AutoresRepository extends JpaRepository<Autor, Long>{

}
