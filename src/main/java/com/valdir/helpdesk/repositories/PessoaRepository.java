package com.valdir.helpdesk.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valdir.helpdesk.domain.Pessoa;
import com.valdir.helpdesk.domain.Tecnico;

public interface PessoaRepository extends JpaRepository<Tecnico, Integer>{

		Optional<Pessoa> findByCpf(String cpf);
		Optional<Pessoa> findByEmail(String email);
}
