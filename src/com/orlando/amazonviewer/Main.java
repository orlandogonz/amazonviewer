package com.orlando.amazonviewer;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.orlando.amazonviewer.model.Books;
import com.orlando.amazonviewer.model.Chapters;
import com.orlando.amazonviewer.model.Movie;
import com.orlando.amazonviewer.model.Series;
import com.orlando.makereport.Report;


public class Main {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
	 	showMenu();
		showMovies();
		showSeries();
		showChapters(new ArrayList<Chapters>());
		showBooks();
		showMagazines();
		makeReport();
		makeReport(new Date());
		
	}

	//Iniciamos el menu de opciones del Amazon Viewer
	
	public static void showMenu() {
		
		int exit = 0;
		do {
			System.out.println("BIENVENIDOS A AMAZON VIEWER");
			System.out.println();
			System.out.println("Selecciona el numero de la opcion deseada");
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Books");
			System.out.println("4. Magazines");
			System.out.println("5. Report");
			System.out.println("6. Report Today");
			System.out.println("0. Exit");	
			
			//Damos la opcion al usuario de elegir el numero del menu,
			//uego leemos la respuesta del usuario
			
			Scanner sc = new Scanner (System.in);
			
			int response = Integer.valueOf(sc.nextLine());
			
			switch (response) {
				case 0:
					exit = 0;
					break;
				case 1:
					showMovies();
					break;
				case 2:
					showSeries();
					break;
				case 3:
					showBooks();
					break;
				case 4:
					showMagazines();
					break;
				case 5:
					makeReport();
					break;
				case 6:
					makeReport(new Date());
					break;	
				
				default:
					System.out.println();
					System.out.println("Selecciona una opción");
					System.out.println();
					break;
			}
			
		}while ( exit !=0);
	}
	
	
	static ArrayList<Movie> movies;
	public static void showMovies() {
		int exit = 1;
		movies = Movie.makeMovieList();
		
		do {
			System.out.println();
			System.out.println(":: MOVIES ::");
			System.out.println();
			
			//Aqui recorremos las peliculas que estan dentru del menu Movie e imprimimos en pantalla del usuario
			for (int i = 0; i < movies.size(); i++) {
				System.out.println(i+1 + ". " + movies.get(i).getTitulo() + " Visto: " + movies.get(i).isViewed());
			}
			
			System.out.println("0. Regresar al Menu");
			System.out.println();
			
			//Leer respuesta de usuario
			
			Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.nextLine());
			
			if(response == 0) {
				showMenu();
			}
			
			if (response > 0) {
				
				Movie movieSelected = movies.get(response-1);
				movieSelected.setisViewed(true);
				Date dateI = movieSelected.startToSee(new Date());
				
				for (int i = 0; i <10000; i++) {
					System.out.println("........");				
				}		
				
				//Al terminar de ver la pelicula...
				
				movieSelected.stopToSee(dateI, new Date()); //Recibe la ultima hora de ver la pelicula
				System.out.println();
				System.out.println("Viste  " +  movieSelected);
				System.out.println("Por " +  movieSelected.getTimeViewed() + 	"milisegundos");
				
			}
			
			
			
			
			
		} while (exit != 0);
	} 
	
	public static void showSeries() {
		
		int exit = 1;
		ArrayList<Series> series = Series.makeSeriesList();	//Llamo al metodo 
		
		do {
			System.out.println();
			System.out.println(":: Series ::");
			System.out.println();
			
			for (int i = 0; i < series.size(); i++) {
				System.out.println(i+1 + ". " + series.get(i).getTitulo() + " Visto " + series.get(i).isViewed()); //Muestra si la serie esta vista o no
			}
			
			System.out.println("0. Regresar al Menu");
			System.out.println();
			
			//Leer respuesta de usuario
			
			Scanner sc = new Scanner (System.in);
			int response = Integer.valueOf(sc.nextLine());
			
			if (response == 0) {
				showMenu();
			}
			
			showChapters(series.get(response-1).getChapters()); //Obtenemos el objeto serie en el cual pedimos los capitulos						
						
		} while (exit !=0);
	} 	

	public static void showChapters(ArrayList<Chapters> chaptersOfSeriesSelected) { //Al seleccionar una serie obtengo una lista de capitulos
		
		int exit = 0;		
		
		do {
			System.out.println();
			System.out.println(":: Chapters ::");
			System.out.println();
			
			for (int i = 0; i < chaptersOfSeriesSelected.size(); i++) { // Visualiza los capitulos de la serie seleccionada
				System.out.println(i+1 + ". " + chaptersOfSeriesSelected.get(i).getTitulo() + " Visto " + chaptersOfSeriesSelected.get(i).isViewed());
				
			}
			
			System.out.println("0. Regresar al Menu");
			System.out.println();
			
			//Leer la respuesta de usuario
			Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.nextLine());
			
			if (response ==0) {
				showSeries();
			}
			
			Chapters chapters= chaptersOfSeriesSelected.get(response-1);
			chapters.setisViewed(true); 
			Date dateI = chapters.startToSee(new Date());
			
			for (int i=0; i< 100000; i++) {
				System.out.println(".........");
			}
			
			//Termine de verla
			
			chapters.stopToSee(dateI, new Date());
			System.out.println();
			System.out.println("Viste: " + chapters.getTitulo());
			System.out.println("Por: " + chapters.getTimeViewed() + " milisegundos");
			
		} while (exit !=0);
	} 
	
	public static void showBooks() {
		int exit = 0;
		ArrayList<Books> books = Books.makeBookList();
		
		do {
			System.out.println();
			System.out.println(":: Books ::");
			System.out.println();			
			
		}while (exit !=0);
	} 
	
	public static void showMagazines() {
		int exit = 0;
		do {
			System.out.println();
			System.out.println(":: Magazines ::");
			System.out.println();
			
			
			
			
		}while(exit !=0);
	} 
	
	public static void makeReport() {
		Report report = new Report();
		report.setNombreArchivo("reporte");
		report.setExtension("txt");
		report.setTitulo(":: VISTOS ::");
		String contenidoReport = "";
		
		for (Movie movie : movies) {
			if (movie.getIsViewed()) {
				contenidoReport += movie.toString() + "\n";
				
			}
			
		}
		
		report.setContenido(contenidoReport);
		report.makeReport();
	}
	
	public static void makeReport(Date date) {
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = df.format(date);
		Report report = new Report();
		report.setNombreArchivo("reporte" + dateString);
		report.setExtension("txt");
		report.setTitulo(":: VISTOS ::");
		String contenidoReport = "";
		
		for (Movie movie : movies) {
			if (movie.getIsViewed()) {
				contenidoReport += movie.toString() + "\n";
				
			}
			
		}
		
		report.setContenido(contenidoReport);
		report.makeReport();
		
	}
		
	
}

