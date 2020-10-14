package br.com.isidrocorp.projetoferiado.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.isidrocorp.projetoferiado.model.Feriado;

public interface FeriadoDAO extends CrudRepository<Feriado, Integer> {

}
