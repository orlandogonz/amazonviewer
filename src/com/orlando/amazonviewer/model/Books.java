package com.orlando.amazonviewer.model;

import java.util.ArrayList;
import java.util.Date;

public class Books extends Publication implements IVisualizable {
	
	private int id;	
	private String isbn;
	private boolean isleido;
	private long tiempoLeido;
	
	
	public Books(String titulo, String fechaEditorial, String editorial, String[] autores) {
		super(titulo, fechaEditorial, editorial);		
		setAutores(toString());		
	}	

	

	private void setAutores(String string) {
		// TODO Auto-generated method stub		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}



	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public long getTiempoLeido() {
		return tiempoLeido;
	}


	public void setTiempoLeido(long l) {
		this.tiempoLeido = l;
	}


	@Override
	public Date startToSee(Date dateI) {
		// TODO Auto-generated method stub
		return dateI;
	}


	@Override
	public void stopToSee(Date dateI, Date dateF) {
		
		/*
		 * Aqui a la hora final se restara la hora inicial para que se muestre el resultado
		 * del tiempo total en que se vio la movie
		 */
		
		if (dateF.getTime() > dateI.getTime()) {
			
			setTiempoLeido(dateF.getTime() - dateI.getTime());		
			
		} else {
			setTiempoLeido(0);
		}			
		
	}

	@Override
	public String toString() {	
		
		
		return 	"\n :: BOOK ::" +
				"\n Titulo: " + getTitulo() +
				"\n Fecha de Edicion: " + getFechaEdicion() +
				"\n Editorial: " + getEditorial() +
				"\n Autores: " + getAutores();
	}
	
	public static ArrayList<Books> makeBookList(){
		
		ArrayList<Books> books = new ArrayList();
		
		for (int i = 1; i <= 5; i++) {
			books.add(new Books("Titulo " + i,"Fecha de Edicion " +i , "Editorial " +i, null));
			
		}
		
		return books;		
	}


	private String getAutores() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	

	public void setTiempoLeido(boolean b) {
		// TODO Auto-generated method stub
		
	}

	public void setisTiempoLeido(boolean b) {
		// TODO Auto-generated method stub
		
	}

	public boolean isleido() {
		return isleido;
	}

	public void setIsleido(boolean isleido) {
		this.isleido = isleido;
	}
	
	public void getIsleido(boolean isleido) {
		this.getIsleido(isleido);
	}
	
	public String isLeido() { //Si la movie, chapter o series es visto, retornara el valor "si"
		String leido = "";
		
		if(isleido == true) {
			leido = "Si";			
		} else
			leido = "No";
		
		return leido;
	}
	
	
}
