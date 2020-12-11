package utilidades;

import java.util.ArrayList;

import model.Author;
import model.Book;

public class Utilidades 
{
	public static ArrayList<Book> listaDeBooks = new ArrayList<Book>();
	public static ArrayList<Author> listaDeAuthors = new ArrayList<Author>();
	
	public Utilidades() 
	{
		// TODO Auto-generated constructor stub
	}

	// public Author(String name, String email, char gender) {
	//	public Book(String title, String author, int year, String publisher, double cost) {
	
	
	// UTILIDADES DE ENTRADA Y SALIDA
	public static void inicializarDatos()
	{
		listaDeBooks.add(new Book("El señor sin anillos", "Pedro Diaz", 2000, "Planeta Agostini", 10.75));
		listaDeBooks.add(new Book("El paraiso", "Sandra Berran", 1990, "Circulo", 9.25));
		listaDeBooks.add(new Book("Amanecer", "Sofia Bluis", 2005, "Alfaguara", 15.15));
		
		listaDeAuthors.add(new Author("Sofia Bluis", "a.bl@gail.com", 'A'));
		listaDeAuthors.add(new Author("Pedro Diaz", "p.di@gail.com", 'F'));
		listaDeAuthors.add(new Author("Sara Parez", "s.pe@gail.com", 'C'));
		
		listaDeAuthors.get(1).setBooks(listaDeBooks);
		
	}
	
	

}
