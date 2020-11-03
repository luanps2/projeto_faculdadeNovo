/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.JOptionPane;

/**
 *
 * @author Luan Costa
 */
public class Paciente extends Pessoa{
    
    private int codConsulta;
    private String dataConsulta;
    private String horaConsulta;

    public Paciente() {
    }    

    public int getCodConsulta() {
        return codConsulta;
    }

    public void setCodConsulta(int codConsulta) {
        this.codConsulta = codConsulta;
    }

    public String getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getHoraConsulta() {
        return horaConsulta;
    }

    public void setHoraConsulta(String horaConsulta) {
        this.horaConsulta = horaConsulta;
    }

 
    public Paciente(String nome, String cpf, int idade, String endereco, String telefone, String tipoUsuario, String usuario, String senha) {
        super(nome, cpf, idade, endereco, telefone, tipoUsuario, usuario, senha);
    }
    
    public void ImprimeDadosPaciente(){
        JOptionPane.showMessageDialog(null, "Nome: " + getNome() + 
                "CPF: " + getCpf() + 
                "Idade: " + getIdade()+ 
                "Endereço: " + getEndereco() + 
                "Telefone: " + getTelefone() + 
                "Tipo de Usuário: " + getTipoUsuario() + 
                "Usuario: " + getUsuario() + 
                "Senha: " + getSenha() + 
                "Data da Consulta: " + getDataConsulta() + 
                "Hora da Consulta: " + getHoraConsulta());
    }
    
    
    
    
    
}
