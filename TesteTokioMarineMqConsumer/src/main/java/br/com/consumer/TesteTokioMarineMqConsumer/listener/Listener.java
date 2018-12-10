package br.com.consumer.TesteTokioMarineMqConsumer.listener;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.consumer.TesteTokioMarineMqConsumer.entities.Carro;
import br.com.consumer.TesteTokioMarineMqConsumer.entities.Pessoa;
import br.com.consumer.TesteTokioMarineMqConsumer.entities.Seguro;
import br.com.consumer.TesteTokioMarineMqConsumer.repository.CarroRepository;
import br.com.consumer.TesteTokioMarineMqConsumer.repository.PessoaRepository;
import br.com.consumer.TesteTokioMarineMqConsumer.repository.SeguroRepository;



@Component
public class Listener {
	
	@Autowired
	CarroRepository carroDAO;
	
	@Autowired
	PessoaRepository pessoaDAO;
	
	@Autowired
	SeguroRepository seguroDAO;
	
	
	@JmsListener(destination = "fila.seguro")
    public void receiveMessage(String seguroReceived) throws IOException {
   
	Seguro seguro = new Seguro();
    ObjectMapper objectMapper = new ObjectMapper();
    seguro = objectMapper.readValue(seguroReceived, Seguro.class); 
    
    carroDAO.save(seguro.getCarro());
    pessoaDAO.save(seguro.getPessoa());

    List<Carro> carros = carroDAO.findByPlaca(seguro.getCarro().getPlaca());
    List<Pessoa> pessoas= pessoaDAO.findByCpf(seguro.getPessoa().getCpf());
	
    Seguro seguroTO = new Seguro();
    seguroTO.setCarro(carros.get(0));
    seguroTO.setPessoa(pessoas.get(0));
    
    seguroDAO.save(seguroTO);
    
	};

}