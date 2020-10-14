package br.com.isidrocorp.projetoferiado.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.isidrocorp.projetoferiado.dao.FeriadoDAO;
import br.com.isidrocorp.projetoferiado.model.Feriado;

@RestController
public class FeriadoController {
	
	@Autowired
	private FeriadoDAO dao;
	
	
	@GetMapping("/feriados")
	public ArrayList<Feriado> listarTudo(){
		ArrayList<Feriado> lista;
		lista = (ArrayList<Feriado>)dao.findAll();
		return lista;
	}
	
	@PostMapping("/feriados/novo")
	public ResponseEntity<Feriado> adicionarNovo(@RequestBody Feriado novo){
		try {
			dao.save(novo);
			return ResponseEntity.status(201).body(novo);
		}
		catch(Exception ex) {
			return ResponseEntity.status(400).build();
		}
	}

}
