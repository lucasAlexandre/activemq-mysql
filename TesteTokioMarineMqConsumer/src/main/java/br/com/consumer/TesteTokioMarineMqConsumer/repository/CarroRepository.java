package br.com.consumer.TesteTokioMarineMqConsumer.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.consumer.TesteTokioMarineMqConsumer.entities.Carro;


public interface CarroRepository extends CrudRepository<Carro, Integer> {
	
	List<Carro> findByModelo(String marca);
	List<Carro> findByPlaca(String placa);
	
	
	
}
	