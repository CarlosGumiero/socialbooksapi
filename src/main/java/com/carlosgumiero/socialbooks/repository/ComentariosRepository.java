package com.carlosgumiero.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlosgumiero.socialbooks.domain.Comentario;

public interface ComentariosRepository extends JpaRepository<Comentario, Long> {

}
