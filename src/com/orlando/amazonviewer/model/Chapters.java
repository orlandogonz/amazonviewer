package com.orlando.amazonviewer.model;
import java.util.ArrayList;

public class Chapters extends Movie{
	
	
	private int id;	
	private int sessionNumber;
	
	public Chapters(String titulo, String genero, String creador, int duracion, short año, int sessionNumber) {
		super(titulo, genero, creador, duracion, año);
		// TODO Auto-generated constructor stub
		this.setSessionNumber(sessionNumber);
		
	}
	
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	public int getSessionNumber() {
		return sessionNumber;
	}

	public void setSessionNumber(int sessionNumber) {
		this.sessionNumber = sessionNumber;
	}
	
	@Override
	public String toString() {
		
		return 	"\n :: CHAPTERS ::" +
				"\n" +
				"\n Titulo: " + getTitulo() + 
				"\n Genero: " + getGenero() +				
				"\n Creador: " + getCreador() +
				"\n Duracion: " + getDuracion();
	}
	
	public static ArrayList<Chapters> makeChaptersList(){
		
				
		ArrayList<Chapters> chapters = new ArrayList();
		
		for (int i = 1; i <=5; i++) {
			chapters.add(new Chapters("Capitulo: " +i, "Genero " +i, "Creador " +i, 45, (short)(2017+i), i));			
		}
		return chapters;
		
	}

	
	
	
	

}
