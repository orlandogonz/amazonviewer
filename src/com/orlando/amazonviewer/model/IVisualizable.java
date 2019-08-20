package com.orlando.amazonviewer.model;

import java.util.Date;

	//Creación de interfaz que recibira la declaración de los métodos

public interface IVisualizable { 
		
	/*
	 * Aqui calcularemos el tiempo visto de movie, series, chapter y book
	 */
	
	
	//Valor de retorno del checkin - Tiempo de inicio en que se empieza a ver la pelicula, serie, capitulo y libro
	Date startToSee(Date dateI); 
	
	//Tiempo en que nos detuvimos ver movie, series, etc
	void stopToSee(Date dateI, Date dateF);
}
