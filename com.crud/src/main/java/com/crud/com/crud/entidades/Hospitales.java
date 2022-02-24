package com.crud.com.crud.entidades;


import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;



@Entity
@Table(name="hospitales")
public class Hospitales {
	/*
	 	id int not null AUTO_INCREMENT primary key,
	nombre varchar(50) not null,
	direccion varchar(200) not null,
	insumo varchar(50) not null
*/
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable = false, unique = true)
	private Long id;
	
	@Column(name="nombre", nullable = false, length = 50)
	private String nombre;
	
	@Column(name="direccion", nullable = false, length = 200)
	private String direccion;
	
	@Column(name="insumo", nullable = false, length = 50)
	private String insumo;

	public Hospitales(Long id, String nombre, String direccion, String insumo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.insumo = insumo;
	}
	
	public Hospitales() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getInsumo() {
		return insumo;
	}

	public void setInsumo(String insumo) {
		this.insumo = insumo;
	}
	
	
	
	
	
	
}
