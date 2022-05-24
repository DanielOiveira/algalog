package com.algaworks.algalog.domain.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algaworks.algalog.domain.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
	List<Cliente> findByNome(String nome); //método de referência- busca com um nome completo
	List<Cliente> findByNomeContaining(String nome); //método de referência- busca se conter uma letra 
	Optional<Cliente> findByEmail(String email);

}
