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
import javax.swing.JOptionPane;

/**
 *
 * @author Luan Costa
 */
public class ReceitarVacina {

    public String[] PopularPaciente() {
        try {
            FileReader arq = new FileReader("C:\\SistemaVacinas\\usuarios.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = lerArq.readLine();
            String[] lista = linha.split(" ");

            return lista;

        } catch (Exception e) {
        }
        return null;
    }
    
    public void Receitar(String cod, String nome, String vacina, String idade){
    try {
            File f = new File("C:\\SistemaVacinas");

            if (!f.exists()) {
                f.mkdirs();
            }

            f = new File("C:\\SistemaVacinas\\receitas.txt");

            if (!f.exists()) {
                f.createNewFile();
            }

            FileReader ler = new FileReader("C:\\SistemaVacinas\\receitas.txt");
            BufferedReader lerArq = new BufferedReader(ler);
            String linha = lerArq.readLine();

            FileWriter arq = new FileWriter("C:\\SistemaVacinas\\receitas.txt");
            int i;
            PrintWriter gravarArq = new PrintWriter(arq);

            while (linha != null) {
                gravarArq.println(linha);
                linha = lerArq.readLine();
            }

            gravarArq.write(cod + " " + nome + " " + vacina + " " + idade);
//            for (i = 1; i <= 10; i++) {
//                gravarArq.printf("| %2d X %d = %2d |%n", i, 10, (i * 10));
//            }

            arq.close();
            
            JOptionPane.showMessageDialog(null, "\nDados do Agendamento \nCód da Consulta:" + cod + " \nNome: " + nome + "\nVacina: " + vacina + "\nIdade" + idade + "\n(Dados Inseridos com sucesso em \"C:\\SistemaVacinas\\receitas.txt");

            System.out.printf("\nDados do Agendamento" + "\nCód da Consulta:" + cod + "\nNome: " + nome + "\nVacina: " + vacina + "\nIdade" + idade +  "\n(Dados Inseridos com sucesso em\"C:\\SistemaVacinas\\receitas.txt");
        } catch (Exception e) {
        }

    }
    
    
}

//    String[] nome = a.preencher();
//
//        File arquivo = new File("C:\\SistemaVacinas\\usuarios.txt");
//
//        try {
//            FileReader fr = new FileReader(arquivo);
//            BufferedReader br = new BufferedReader(fr);
//            String linha = br.readLine();
//            
//                for (String string : nome) {
//                    comboPaciente.addItem(nome[0]);
//                linha = br.readLine();
//                }
//            fr.close();
//
//        } catch (IOException e) {
//            System.err.printf("Erro na leitura do Arquivo: %s.\n",
//                    e.getMessage());
//        }
//}
//
//}
