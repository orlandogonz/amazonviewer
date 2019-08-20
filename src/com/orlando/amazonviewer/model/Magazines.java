package com.orlando.amazonviewer.model;

import java.util.Date;

public class Magazines extends Publication{
	
	public Magazines(String titulo, String fechaEdicion, String editorial) {
		super(titulo, fechaEdicion, editorial);
		
	}

	private int id;
	

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return 	"\n :: MAGAZINES ::" +
				"\n Titulo: " + getTitulo() +
				"\n Fecha de Edicion: " + getFechaEdicion() +
				"\n Edicion: " + getEditorial();
				
	}
	
	

}
