package com.orlando.amazonviewer.model;

import java.util.Date;

public class Film {
	
	private String titulo;
	private String genero;
	private String creador;
	private int duracion;
	private short año;
	private boolean isViewed;
		
	public Film(String titulo, String genero, String creador, int duracion) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.creador = creador;
		this.duracion = duracion;
		
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public short getAño() {
		return año;
	}
		
	public String isViewed() { //Si la movie, chapter o series es visto, retornara el valor "si"
		String visto = "";
		
		if(isViewed == true) {
			visto = "Si";			
		} else
			visto = "No";
		
		return visto;
	}
	
	public boolean getIsViewed() {
		return isViewed;
	}
	
	public void setisViewed(boolean isViewed) {
		this.isViewed = isViewed;
	}

	public void stopToSee(Date dateI, Date dateF) {
		// TODO Auto-generated method stub
		
	}

	
	
	

}
