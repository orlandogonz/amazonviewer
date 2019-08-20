package com.orlando.amazonviewer.model;

import java.util.Date;

public class Publication {
	
	private String titulo;
	private String fechaEdicion;
	private String editorial;
	private String [] autores;
	private boolean isLeido;
	
	
	
	public Publication(String titulo, String fechaEdicion, String editorial) {
		super();
		this.titulo = titulo;
		this.fechaEdicion = fechaEdicion;
		this.editorial = editorial;
		
	}



	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getFechaEdicion() { 
		return fechaEdicion;
	}


	public void setFechaEdicion(Date fechaEdicion) {
		fechaEdicion = fechaEdicion;
	}


	public String getEditorial() {
		return editorial;
	}


	public void setEditorial(String editorial) {
		editorial = editorial;
	}
	
	
	
	public void setLeido(boolean isLeido) {
		this.isLeido = isLeido;
	}

	public String isLeido() { //Si la movie, chapter o series es visto, retornara el valor "si"
		String leido = "";
		
		if(isLeido == true) {
			leido = "Si";			
		} else
			leido = "No";
		
		return leido;
	}

	private void setTiempoLeido(long l) {
		// TODO Auto-generated method stub
		
	}
	
	

	
	
	
	
	
	

}
