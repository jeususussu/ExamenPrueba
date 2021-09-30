package com.exam.modelo.calificacion;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="CALIFICACION")
public class Calificacion {
	
		@Id
		@Column(name="ID")
		@GeneratedValue
		private int id;
		@Column(name="CALIFICACION")
		private double calificacion;
		@Column(name="ALUMNO_ID")
		private int alumno_id;
		@Column(name="MATERIA_ID")
		private int materia_id;
		
		public Calificacion() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public Calificacion(int id, double calificacion, int alumno_id, int materia_id) {
			super();
			this.id = id;
			this.calificacion = calificacion;
			this.alumno_id = alumno_id;
			this.materia_id = materia_id;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public double getCalificacion() {
			return calificacion;
		}
		public void setCalificacion(double calificacion) {
			this.calificacion = calificacion;
		}
		public int getAlumno_id() {
			return alumno_id;
		}
		public void setAlumno_id(int alumno_id) {
			this.alumno_id = alumno_id;
		}
		public int getMateria_id() {
			return materia_id;
		}
		public void setMateria_id(int materia_id) {
			this.materia_id = materia_id;
		}
		
		
}
