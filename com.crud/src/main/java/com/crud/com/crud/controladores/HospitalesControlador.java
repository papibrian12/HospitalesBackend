package com.crud.com.crud.controladores;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.crud.com.crud.entidades.Hospitales;
import com.crud.com.crud.repositorios.HospitalesRepositorio;

@RestController
@RequestMapping("/api/v1")
// http://localhost:8084/api/v1
@CrossOrigin(origins = "http://localhost:4200/", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
public class HospitalesControlador {
	
	// http://localhost:8084/api/v1

	@Autowired
	HospitalesRepositorio hospitalRepositorio;
	
	// http://localhost:8084/api/v1/hospitales/hospital/crear
	// @ResponseStatus(HttpStatus.OK)
	@GetMapping(value = "/hospitales", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Hospitales> listaHospitales(){	
		return hospitalRepositorio.findAll();
	}
	
	//http://localhost:8084/api/v1/hospitales/2
	@GetMapping(value = "/hospitales/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Optional<Hospitales> obtenerHospitalPorId(@PathVariable Long id) {
		return hospitalRepositorio.findById(id);
	}
	
	/* GET -> Obtener, PUT-> ACTUALIZAR, DELETE-> ELIMINAR, POST-> INSERTAR*/
	
	@PostMapping(value = "/hospital/crear", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE )
	public Hospitales crearHospital(@RequestBody Hospitales hospital) {
		return hospitalRepositorio.save(hospital);
	}
	
	
	// http://localhost:8084/api/vi/hospital/eliminar/{id}
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/hospital/eliminar/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE )
	public void eliminarhospital(@PathVariable Long id) {
		hospitalRepositorio.deleteById(id);
	}
	

}
