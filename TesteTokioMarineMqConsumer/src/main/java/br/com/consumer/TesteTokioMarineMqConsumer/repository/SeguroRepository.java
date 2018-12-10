package br.com.consumer.TesteTokioMarineMqConsumer.repository;


import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.consumer.TesteTokioMarineMqConsumer.entities.Seguro;


public interface SeguroRepository extends PagingAndSortingRepository<Seguro, Integer> {
	
	
}
	