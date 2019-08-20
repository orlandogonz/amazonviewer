package com.orlando.amazonviewer.model;

import java.util.ArrayList;
import java.util.Date;

public class Movie extends Film implements IVisualizable{ //Declaramos la herencia e implementamos la interfaz	

	private int id;	
	private boolean isViewed;
	private int timeViewed;
	
	public Movie(String titulo, String genero, String creador, int duracion, short año) {
		super(titulo, genero, creador, duracion);
		setAño();
	}	

	public void setAño() {	
		
	}

	public void showData() {
		//System.out.println("Titulo:  " + this.titulo);
		//System.out.println("Genero:  " + this.genero);
		//System.out.println("Año:  " + this.año);		
	}	
	
	public int getId() {
		return id;
	}		
	
	public int getTimeViewed() {
		return timeViewed;
	}
	
	
	
	public boolean getIsViewed() {
		return isViewed;
	}

	public void setIsViewed(boolean isViewed) {
		this.isViewed = isViewed;
	}

	public void setTimeViewed(long l) {
		this.timeViewed = (int) l;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return 	"\n :: MOVIE ::" +
				"\n" +
				"\n Titulo: " + getTitulo() + 
				"\n Genero: " + getGenero() +				
				"\n Creador: " + getCreador() +
				"\n Duracion: " + getDuracion();
	}

	/*	 
	 * Implementacion de la interfaz IVisualizable en Movie
	 */
	
	@Override
	public Date startToSee(Date dateI) {
		
		return dateI; //Retornara el dato "chekin" de movie
	}


	@Override
	public void stopToSee(Date dateI, Date dateF) {
		
		/*
		 * Aqui a la hora final se restara la hora inicial para que se muestre el resultado
		 * del tiempo total en que se vio la movie
		 */
		
		if (dateF.getTime() > dateI.getTime()) {
			
			setTimeViewed(dateF.getTime() - dateI.getTime());		
			
		} else {
			setTimeViewed(0);
		}			
		
	}
	
	public static ArrayList<Movie> makeMovieList(){
		ArrayList<Movie> movies = new ArrayList();
		
		for (int i = 1; i <= 5; i++) {
			movies.add(new Movie("Movie " + i,  "Genero "+i , "Duracion " +i,  120,  (short)(2019 +i)));
			
		}		
		return movies;
		
	}

		
	

	

	
	
	
	

}