package com.carlosgumiero.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlosgumiero.socialbooks.domain.Livro;

public interface LivrosRepository extends JpaRepository<Livro, Long> {
	
	

}
