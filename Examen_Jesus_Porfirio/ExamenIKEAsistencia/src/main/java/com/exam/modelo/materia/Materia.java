package com.exam.modelo.materia;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MATERIA")
public class Materia {
	
	@Id
	@Column(name="ID")
	@GeneratedValue
	private int id;
	@Column(name="NOMBRE")
	private String nombre;
	
	public Materia() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Materia(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
