/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Paciente;

/**
 *
 * @author Luan Costa
 */
public interface Interface {
    
      boolean inserir(Paciente p);
    Paciente seleciona(String rgm);
    Paciente loga(String usuario, String senha);
    List<Paciente> selecionaTodos(); 
    
}
