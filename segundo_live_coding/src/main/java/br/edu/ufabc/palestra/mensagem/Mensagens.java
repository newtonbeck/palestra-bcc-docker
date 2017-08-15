package br.edu.ufabc.palestra.mensagem;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Mensagens extends CrudRepository<Mensagem, Long> {

}
