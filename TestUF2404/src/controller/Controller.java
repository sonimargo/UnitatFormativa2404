package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Author;
import model.Book;
import utilidades.UtilidadesGenerales;


public class Controller 
{

	public Controller() 
	{
		// TODO Auto-generated constructor stub
	}


	public static void crearListaLibros(Scanner datoPantalla, ArrayList<Book> listaDeBooks, ArrayList<Author> listaDeAuthors)
	{
		createBook(datoPantalla, listaDeBooks, listaDeAuthors);
		//Se asignan los libros al segundo autor
		listaDeAuthors.get(1).setBooks(listaDeBooks);
	}
	
	public static void createBook(Scanner datoPantalla, ArrayList<Book> listaDeBooks, ArrayList<Author> listaDeAuthors)
	{
		String titulo;
		String autor ;
		String cadenaAny =""; 
		int any =0;
		String editorial; 
		Double coste ;
		String masLibros;
		Scanner scanner = new Scanner(System.in);
		
		
		while (true)
		{
			System.out.println("Introducir Titulo: ");
			titulo =  datoPantalla.nextLine();

			System.out.println("Introducir Autor: ");
			autor =  datoPantalla.nextLine();
			
			while (UtilidadesGenerales.isNumeric(cadenaAny) == false)
			{
				System.out.println("Introducir Año: ");
				cadenaAny =  datoPantalla.nextLine();
				if (UtilidadesGenerales.isNumeric(cadenaAny) == true &&
					UtilidadesGenerales.isUnAño(any))
					{
						any = Integer.parseInt(cadenaAny);
						break;
					}
	        }
			
			
			System.out.println("Introducir Editorial: ");
			editorial =  datoPantalla.nextLine();			
		
			System.out.println("Introducir coste ");
			System.out.println("con la coma como separador decimal: ");
			coste = scanner.nextDouble();
						  
			
			listaDeBooks.add(crearObjetoBook(titulo, autor, any, editorial, coste));

			System.out.println("Desea introducir mas libros S/N? ");
			masLibros =  datoPantalla.nextLine();
			
			if (masLibros.equals("N"))
					break;
		}

	}
	
	public static void assign(Scanner datoPantalla, ArrayList<Book> listaDeBooks, ArrayList<Author> listaDeAuthors)
	{
		createBook( datoPantalla, listaDeBooks, listaDeAuthors);
		String asignarAutor;		
		System.out.println("A que autor se asigan el/los libro/s? ");
		asignarAutor =  datoPantalla.nextLine();
		
		for (Author autor : listaDeAuthors)
		{
			if (autor.getName().equals(asignarAutor))
			{
				listaDeAuthors.get(listaDeAuthors.indexOf(autor)).setBooks(listaDeBooks);
				break;
			}
		}
	}
	
	public static Book crearObjetoBook(String title, String author, int year, String publisher, double cost)
	{
		return new Book( title,  author,  year,  publisher,  cost);
	}
}






