package com.valdir.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valdir.helpdesk.domain.Tecnico;

public interface PessoaRepository extends JpaRepository<Tecnico, Integer>{

}
