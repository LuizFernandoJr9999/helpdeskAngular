package com.valdir.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valdir.helpdesk.domain.Chamado;
import com.valdir.helpdesk.domain.Cliente;
import com.valdir.helpdesk.domain.Tecnico;
import com.valdir.helpdesk.domain.enums.Perfil;
import com.valdir.helpdesk.domain.enums.Prioridade;
import com.valdir.helpdesk.domain.enums.Status;
import com.valdir.helpdesk.repositories.ChamadoRepository;
import com.valdir.helpdesk.repositories.ClienteRepository;
import com.valdir.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;

	public void instanciaDB() {
		Tecnico tec1 = new Tecnico(null, "Valdir Cezar",          "550.482.150-95", "valdir@mail.com",   "123");
		tec1.addPerfil(Perfil.ADMIN);
		Tecnico tec2 = new Tecnico(null, "Richard Stallman",      "336.448.212-83", "stallman@mail.com", "123");
		Tecnico tec3 = new Tecnico(null, "Claude Elwood Shannon", "271.068.470-54", "shannon@mail.com" , "123");
		Tecnico tec4 = new Tecnico(null, "Tim Berners-Lee",       "162.720.120-39", "lee@mail.com",      "123");
		Tecnico tec5 = new Tecnico(null, "Linus Torvalds",        "778.556.170-27", "linus@mail.com",    "123");


		Cliente cli1 = new Cliente(null, "Albert Einstein", "111.661.890-74", "einstein@mail.com", "123");
		Cliente cli2 = new Cliente(null, "Marie Curie",     "322.429.140-06", "curie@mail.com",    "123");
		Cliente cli3 = new Cliente(null, "Charles Darwin",  "792.043.830-62", "darwin@gmail.com",  "123");
		Cliente cli4 = new Cliente(null, "Stephen Hawking", "177.409.680-30", "hawking@mail.com",  "123");
		Cliente cli5 = new Cliente(null, "Max Planck",      "081.399.300-83", "planck@mail.com",   "123");
			
		Chamado cha1=new Chamado(null,Prioridade.MEDIA,Status.ANDAMENTO,"Chamado 01","Teste Chamado 01",tec1, cli1);
		Chamado cha2=new Chamado(null,Prioridade.ALTA, Status.ABERTO,   "Chamado 02","Teste Chamado 02",tec1, cli2);
		Chamado cha3=new Chamado(null,Prioridade.BAIXA,Status.ENCERRADO,"Chamado 03","Teste Chamado 03",tec2, cli3);
		Chamado cha4=new Chamado(null,Prioridade.ALTA, Status.ABERTO,   "Chamado 04","Teste Chamado 04",tec3, cli3);
		Chamado cha5=new Chamado(null,Prioridade.MEDIA,Status.ANDAMENTO,"Chamado 05","Teste Chamado 05",tec2, cli1);
		Chamado cha6=new Chamado(null,Prioridade.BAIXA,Status.ENCERRADO,"Chamado 06","Teste Chamado 06",tec1, cli5);

		tecnicoRepository.saveAll(Arrays.asList(tec1, tec2, tec3, tec4, tec5));
		clienteRepository.saveAll(Arrays.asList(cli1, cli2, cli3, cli4, cli5));
		chamadoRepository.saveAll(Arrays.asList(cha1, cha2, cha3, cha4, cha5, cha6));

		//tecnicoRepository.saveAll(Arrays.asList(tec1, tec2));
		//clienteRepository.saveAll(Arrays.asList(cli1));
		//chamadoRepository.saveAll(Arrays.asList(cha1, cha2));
}
	
}
