package com.orlando.amazonviewer.model;

import java.util.ArrayList;

public class Series extends Film{
	
	

	private int id;
	private int sessionQuantity;
	private ArrayList<Chapters> chapters;
	
	public Series(String titulo, String genero, String creador, int duracion, int sessionQuantity, ArrayList<Chapters> chapters) {
		super(titulo, genero, creador, duracion);
		this.sessionQuantity = sessionQuantity;
		this.chapters = chapters;
		
	}

	public int getId() {
		return id;
	}

	public int getSessionQuantity() {
		return sessionQuantity;
	}

	public void setSessionQuantity(int sessionQuantity) {
		this.sessionQuantity = sessionQuantity;
	}

	public ArrayList<Chapters> getChapters() {
		return chapters;
	}

	public void setChapters(ArrayList<Chapters> chapters) {
		this.chapters = chapters;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n :: SERIES ::" +
				"\n" +
				"\n Titulo: " + getTitulo() + 
				"\n Genero: " + getGenero() +
				"\n Año: " + getAño() +
				"\n Creador: " + getCreador() +
				"\n Duracion: " + getDuracion();
	}
	
	public static ArrayList<Series> makeSeriesList(){
		ArrayList<Series> series = new ArrayList();
		
		for (int i = 1; i <= 5; i++) {
			series.add(new Series("Serie "+i, "Genero "+i, "Creador "+i, 1200, 5, Chapters.makeChaptersList()));
			
		}
		return series;
		
	}
	
	


	

	
	
	
	

}
