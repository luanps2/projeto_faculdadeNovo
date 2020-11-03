/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


/**
 *
 * @author Luan Costa
 */
public class Pessoa {
    
    private String nome;
    private String cpf;
    private int idade;
    private String endereco;
    private String telefone;
    private String tipoUsuario;
    private String usuario;
    private String senha;
//    private boolean acesso;
//    private String[] vacina;

    
    
//    public void Pessoa(){};
//    

    public Pessoa() {
    }
    
    
    

    public Pessoa(String nome, String cpf, int idade, String endereco, String telefone, String tipoUsuario, String usuario, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.endereco = endereco;
        this.telefone = telefone;
        this.tipoUsuario = tipoUsuario;
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(String Idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

  
    
    
   
    
    
    
    
}
