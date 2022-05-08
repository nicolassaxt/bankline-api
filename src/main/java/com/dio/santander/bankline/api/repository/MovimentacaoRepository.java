package com.dio.santander.bankline.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.santander.bankline.api.model.Mivimentacao;

public interface MovimentacaoRepository extends JpaRepository<Mivimentacao, Integer>{
	public List<Mivimentacao>findByIdConta(Integer idConta);
}	
