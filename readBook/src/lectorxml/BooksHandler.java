/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectorxml;

import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * Clase Manejadora
 * @author alvaropl
 */
public class BooksHandler extends DefaultHandler{
    
    private ArrayList<Book> books = new ArrayList(); //Array de libros
    private Book libro; //Para manejar cada libro
    private StringBuilder buffer = new StringBuilder(); //Buffer para guardar texto simple

    public ArrayList<Book> getBooks() {
        return books;
    }
   
    @Override
    public void characters(char[] chars, int i, int i1) throws SAXException {
        buffer.append(chars, i, i1);
    }

    @Override
    public void endElement(String string, String string1, String string2) throws SAXException {
        switch(string2){
            case "catalog"://Elemento raiz, lo que importa son sus hijos
                break;
            case "book":
                break;
            case "author":
                libro.setAuthor(buffer.toString());
                break;
            case "title":
                libro.setTitle(buffer.toString());
                break;
            case "genre":
                libro.setGenre(buffer.toString());
                break;
            case "price":
                libro.setPrice(Double.parseDouble(buffer.toString()));
                break;
            case "publish_date":
                libro.setPublish_data(buffer.toString());
                break;
            case "description":
                libro.setDescription(buffer.toString());
                break;
        }
        
    }

    @Override
    public void startElement(String string, String string1, String string2, Attributes atrbts) throws SAXException {
        switch(string2){
            case "catalog"://Elemento raiz, lo que importa son sus hijos
                break;
            case "book":
                libro = new Book();// Un libro tiene un atributo llamado id
                libro.setId(atrbts.getValue("id"));
                books.add(libro);
                break;
            default:
                buffer.delete(0, buffer.length()); //Limpiamos el buffer si nos enocntramos otras etiquetas para poder leer su contenido
                break;     
        }
    }
    
}
