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
public class Autor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cpf;
    
    private String nome;
    private int idade;
    private String endereco;

    public Autor(int cpf, String nome, int idade, String endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public Autor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereço) {
        this.endereco = endereço;
    }

    @Override
    public String toString() {
        return "Dados Autor: " +
               "Cpf: \n" + cpf + 
               "Nome: \n" + nome + 
               "Idade: \n" + idade + 
               "Endereço: \n" + endereco;
    }
    
    
}
