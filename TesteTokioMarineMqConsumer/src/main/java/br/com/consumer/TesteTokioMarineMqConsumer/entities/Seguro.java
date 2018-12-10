package br.com.consumer.TesteTokioMarineMqConsumer.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.consumer.TesteTokioMarineMqConsumer.abstractEntity.AbstractEntity;

@Entity
@Table(name = "seguro")
public class Seguro extends AbstractEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@OneToOne
	private Carro carro;
	
	@ManyToOne
	private Pessoa pessoa;
	
	public Seguro() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Seguro(Carro carro, Pessoa pessoa) {
		super();
		this.carro = carro;
		this.pessoa = pessoa;
	}
	public Carro getCarro() {
		return carro;
	}
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	@Override
	public String toString() {
		
		
		String seg = new String();

		// me perdoe!
		seg = "{\"id\":"+ Integer.toString(this.id) +", \"carro\":{\"marca\":\""
		+this.carro.getMarca()+"\",\"modelo\":\""+this.carro.getModelo()+"\", \"ano\":"
		+Integer.toString(this.carro.getAno())+"},\"pessoa\":{\"nome\":\""
		+this.pessoa.getNome()+"\",\"cpf\":\""+this.pessoa.getCpf()+"\"}}";
		
		return seg;
	}
	
}
