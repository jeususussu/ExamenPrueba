package com.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.modelo.alumno.Alumno;
import com.exam.modelo.calificacion.Calificacion;
import com.exam.repository.alumno.AlumnoRepository;
import com.exam.repository.calificacion.CalificacionRepository;


@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({ "exam" })
public class ExamController {
	
	@Autowired
	AlumnoRepository alumnoRepository;
	
	@Autowired
	CalificacionRepository calificacionRepository;
	
	@PostMapping("/addAlumno")
	public Alumno altaAlumno(@RequestBody Alumno alumno) {
		return alumnoRepository.save(alumno);
	}
	
	@GetMapping("/selectAlumnos")
	public List<Alumno> listarAlumno(){
		List<Alumno> alumnos = (List<Alumno>) alumnoRepository.findAll();
		return alumnos;
	}
	
	@PostMapping("/addCalificacion")
	public Calificacion altaCalificacion(@RequestBody Calificacion calificacion) {
		return calificacionRepository.save(calificacion);
	}
	
	@PutMapping("/updateCalificacion/{id}")
	public Calificacion updateCalificacion(@RequestBody Calificacion calificacion, @PathVariable("id") int id) {
		calificacion.setId(id);
		return calificacionRepository.save(calificacion);
	}
	
	@DeleteMapping("/deleteCalificacion/{id}")
	public void deleteCalificacion(@PathVariable int id) {
		calificacionRepository.deleteById(id);
	}
	
	@GetMapping("/selectAlumnosCalificaciones")
	public List<Calificacion> listarAlumnoCalificacion(){
		List<Calificacion> alumnos = (List<Calificacion>) calificacionRepository.findAll();
		return alumnos;
	}
	
}