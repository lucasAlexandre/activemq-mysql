package br.com.consumer.TesteTokioMarineMqConsumer.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.consumer.TesteTokioMarineMqConsumer.repository.SeguroRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping(value = "seguros")
@Api(value = "API rest TesteTokioMarineConsumer")
@CrossOrigin(origins="*")
public class SeguroController {
	
	SeguroRepository seguroDAO;
	
	@Autowired
	public SeguroController(SeguroRepository seguroDAO) {
		this.seguroDAO = seguroDAO;
	
	}
	
	@RequestMapping(value = "/listaSeguros",  method = RequestMethod.GET)
	@ApiOperation(value="Retorna a todos os seguros gravados paginados")
	public ResponseEntity<?> listAll(Pageable pageable) {
		
	    
	    return new ResponseEntity<>(seguroDAO.findAll(pageable), HttpStatus.OK);
	}
}
