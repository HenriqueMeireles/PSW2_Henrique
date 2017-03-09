/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atores;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author RA21553404
 */
public class Livro {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idLivro;
    
    private String Titulo;
    private String Editora;
    private String Autor;

    
    public Livro(int idLivro, String Titulo, String Editora, String Autor) {
        this.idLivro = idLivro;
        this.Titulo = Titulo;
        this.Editora = Editora;
        this.Autor = Autor;
    }

    public Livro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getEditora() {
        return Editora;
    }

    public void setEditora(String Editora) {
        this.Editora = Editora;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    @Override
    public String toString() {
        return "Dados Livro: \n" + 
               "ID: \n" + idLivro + 
               "Título: " + Titulo + 
               "Editora: " + Editora + 
               "Autor: " + Autor;
    }

    public void getIdLivro(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getTitulo(String ozob) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getEditora(String nerd_Books) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getAutor(String leonel_e_Azaghal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
  
}
