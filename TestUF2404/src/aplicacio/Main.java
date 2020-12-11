package aplicacio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import controller.Controller;
import model.Author;
import model.Book;
import utilidades.Utilidades;

public class Main {

	public static void main(String[] args) 
	{
		//Inicializar lista de libros 
		
		Scanner datoPantalla = new Scanner(System.in);
		ArrayList<Book> listaDeBooks = new ArrayList<Book>();
		ArrayList<Author> listaDeAuthors = new ArrayList<Author>();
		
		Utilidades.inicializarDatos();
		listaDeBooks = Utilidades.listaDeBooks;
		listaDeAuthors = Utilidades.listaDeAuthors;
		
		//Imprimir pruebas
		printInformacion( listaDeAuthors);
				
		//Crear libros hasta que el usuario lo decida
		//Alta de libros, se asignan los libros al segundo autor
		Controller.crearListaLibros(datoPantalla, listaDeBooks, listaDeAuthors);

		//Imprimir al crear lista de libros 
		printInformacion( listaDeAuthors);
		
		//Crear libro  hasta que el usuario lo decida
		//Solicitar al usuario que indique a que autor se asignan
		Controller.assign(datoPantalla, listaDeBooks, listaDeAuthors);
		
		//Imprimir asignar a un autor libro/s
		printInformacion( listaDeAuthors);
	}
	
	public static void printInformacion(ArrayList<Author> listaDeAuthors)
	{
		for (Author autor : listaDeAuthors)
			System.out.println(autor);
	}
}
