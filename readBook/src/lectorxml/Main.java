/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectorxml;

import java.io.File;

import java.io.IOException;

import java.util.ArrayList;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.parsers.SAXParser;
import org.xml.sax.SAXException;


/**
 *
 * @author alvaropl
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws org.xml.sax.SAXException
     * @throws javax.xml.parsers.ParserConfigurationException
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws SAXException, ParserConfigurationException, IOException  {
        
        
        SAXParserFactory spf = SAXParserFactory.newInstance();
        SAXParser sp = spf.newSAXParser();
        
        BooksHandler handler = new  BooksHandler();
        File f = new File("books.xml"); 
     
        sp.parse(f, handler);
        
        ArrayList<Book> v = handler.getBooks(); //Recibimos todos los libros leidos
        
        for(Book b : v){
            System.out.println(b);
        }
         
    }
    
}
