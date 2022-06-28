package com.LojaMax.Ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LojaMax.Ecommerce.model.ProdutoModel;
import com.LojaMax.Ecommerce.util.Categoria;
import com.LojaMax.Ecommerce.util.Equipamentos;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long>{
	public List<ProdutoModel> findAllByServicoContainingIgnoreCase(String servico);

	public List<ProdutoModel> findAllByCategoria(Categoria categoria);
	
	public List<ProdutoModel> findAllByCategoriaAndEquipamentos(Categoria categoria, Equipamentos equipamentos);
}
