package com.valdir.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valdir.helpdesk.domain.Pessoa;

public interface ClienteRepository extends JpaRepository<Pessoa, Integer>{

}
