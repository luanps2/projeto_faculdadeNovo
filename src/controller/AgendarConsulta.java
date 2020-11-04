/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;
import javax.swing.JOptionPane;
import model.Paciente;

/**
 *
 * @author Luan Costa
 */
public class AgendarConsulta extends Paciente {
    
       public String[] preencher(){
        
        try {
            FileReader arq = new FileReader("C:\\SistemaVacinas\\sessao.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = lerArq.readLine();
            String[] lista = linha.split(" ");
            
            return lista;
            
            
        } catch (Exception e) {
        }
    return null;
    }
    
   

    public void Agendar(String codconsulta, String nome, String idade, String dataconsulta, String horaconsulta,  String cpf,  String endereco, String telefone, String tipoUsuario, String usuario) {
        try {
            File f = new File("C:\\SistemaVacinas");

            if (!f.exists()) {
                f.mkdirs();
            }

            f = new File("C:\\SistemaVacinas\\agendamentos.txt");

            if (!f.exists()) {
                f.createNewFile();
            }

            FileReader ler = new FileReader("C:\\SistemaVacinas\\agendamentos.txt");
            BufferedReader lerArq = new BufferedReader(ler);
            String linha = lerArq.readLine();

            FileWriter arq = new FileWriter("C:\\SistemaVacinas\\agendamentos.txt");
            int i;
            PrintWriter gravarArq = new PrintWriter(arq);

            while (linha != null) {
                gravarArq.println(linha);
                linha = lerArq.readLine();
            }

            gravarArq.write(codconsulta + " " + 
                    nome + " " + 
                    idade + " " + 
                    dataconsulta + " " + 
                    horaconsulta + " " + 
                    cpf + " " + 
                    endereco + " " + 
                    telefone + " " + 
                    tipoUsuario + " " + 
                    usuario);
//            for (i = 1; i <= 10; i++) {
//                gravarArq.printf("| %2d X %d = %2d |%n", i, 10, (i * 10));
//            }

            arq.close();
            
            JOptionPane.showMessageDialog(null, "\nDados do Agendamento" + "\nCód da Consulta: " + codconsulta +  "\n Nome:" + usuario + "\nCPF: " + cpf + "" + "\nIdade: " + idade + "\nEndereço: " + endereco + "\nTelefone" + telefone + "\nData da Consulta: " + dataconsulta + "\nHora da Consulta: " + horaconsulta + "(Inseridos com sucesso! \"C:\\SistemaVacinas\\agendamentos.txt");

            System.out.printf("\nDados do Agendamento" + "\nCód da Consulta: " + codconsulta +  "\n Nome:" + usuario + "\nCPF: " + cpf + "" + "\nIdade: " + idade + "\nEndereço: " + endereco + "\nTelefone" + telefone + "\nData da Consulta: " + dataconsulta + "\nHora da Consulta: " + horaconsulta + "\n(Inseridos com sucesso! \"C:\\SistemaVacinas\\agendamentos.txt\".\n)");
        } catch (Exception e) {
        }

    }

}
