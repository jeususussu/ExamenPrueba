package com.exam.modelo.alumno;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ALUMNO")
public class Alumno {
	
	@Id
	@Column(name="ID")
	@GeneratedValue
	private int id;
	@Column(name="NOMBRE")
	private String nombre;
	@Column(name="APEPAT")
	private String apepat;
	@Column(name="APEMAT")
	private String apemat;
	@Column(name="MATRICULA")
	private String matricula;
	@Column(name="MATERIA_ID")
	private int materia_id;
	
	public Alumno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Alumno(int id, String nombre, String apepat, String apemat, String matricula, int materia_id) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apepat = apepat;
		this.apemat = apemat;
		this.matricula = matricula;
		this.materia_id = materia_id;
	}

	public Alumno(String nombre, String apepat, String apemat, String matricula, int materia_id) {
		super();
		this.nombre = nombre;
		this.apepat = apepat;
		this.apemat = apemat;
		this.matricula = matricula;
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

	public String getApepat() {
		return apepat;
	}

	public void setApepat(String apepat) {
		this.apepat = apepat;
	}

	public String getApemat() {
		return apemat;
	}

	public void setApemat(String apemat) {
		this.apemat = apemat;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getMateria_id() {
		return materia_id;
	}

	public void setMateria_id(int materia_id) {
		this.materia_id = materia_id;
	}

	
}
