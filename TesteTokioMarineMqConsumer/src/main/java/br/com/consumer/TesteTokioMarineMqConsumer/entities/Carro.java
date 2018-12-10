package br.com.consumer.TesteTokioMarineMqConsumer.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.consumer.TesteTokioMarineMqConsumer.abstractEntity.AbstractEntity;



@Entity
@Table(name = "carro")
public class Carro  extends AbstractEntity implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	@Column(name = "marca")
	private String marca;
	
	@Column(name = "modelo")
	private String modelo;
	
	@Column(name = "ano")
	private Integer ano;
	
	@Column(name = "placa")
	private String placa;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	
	public Carro(String marca, String modelo, Integer ano) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}
	public Carro() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String toString() {
		return "{\"marca\":\"" + marca + "\", \"modelo\":\"" + modelo + "\", \"ano\":" + ano + "}";
	}
}