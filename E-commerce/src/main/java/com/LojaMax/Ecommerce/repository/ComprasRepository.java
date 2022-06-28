package com.LojaMax.Ecommerce.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LojaMax.Ecommerce.model.ComprasModel;

public interface ComprasRepository extends JpaRepository<ComprasModel, Long> {
	
	public Optional<ComprasModel> findById (Long id);
	
	// public Optional<ComprasModel> findByDate (LocalDate data);
	
	// public Optional<ComprasModel> findAllByProdutoContainingIgnoreCase (String produto);
}
