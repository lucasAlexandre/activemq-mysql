package br.com.consumer.TesteTokioMarineMqConsumer.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.consumer.TesteTokioMarineMqConsumer.abstractEntity.AbstractEntity;

@Entity
@Table(name = "pessoa")
public class Pessoa extends AbstractEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "nome")
	private String nome;
	
	@Column(name = "cpf")
	private String cpf;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
}
