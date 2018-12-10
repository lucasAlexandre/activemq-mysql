package br.com.consumer.TesteTokioMarineMqConsumer.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.consumer.TesteTokioMarineMqConsumer.entities.Pessoa;


public interface PessoaRepository extends CrudRepository<Pessoa, Integer> {
	
	List<Pessoa> findByCpf(String cpf);
	
}
	