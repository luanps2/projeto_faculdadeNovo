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
public class AplicarVacina {

    double dose;

    public void Aplicar(String senhafila, String nome, String vacina, int idade) {

        //Vacina Sarampo
        if (vacina.equals("Sarampo")) {
            if (idade >= 0 && idade <= 2) {
                dose = 0.40;
            } else if (idade >= 3 && idade <= 9) {
                dose = 0.60;
            } else if (idade >= 10 && idade <= 18) {
                dose = 0.80;
            } else if (idade > 18) {
                dose = 1;
            }

        }

        //Vacina H1N1
        if (vacina.equals("H1N1")) {
            if (idade >= 0 && idade <= 2) {
                dose = 0.30;
            } else if (idade >= 3 && idade <= 9) {
                dose = 0.60;
            } else if (idade >= 10 && idade <= 18) {
                dose = 0.90;
            } else if (idade > 18) {
                dose = 1.20;
            }
        }

        //Vacina Meningite
        if (vacina.equals("Meningite")) {
            if (idade >= 0 && idade <= 2) {
                dose = 0.1;
            } else if (idade >= 3 && idade <= 9) {
                dose = 0.4;
            } else if (idade >= 10 && idade <= 18) {
                dose = 0.6;
            } else if (idade > 18) {
                dose = 0.9;
            }
        }

        //Vacina Malária
        if (vacina.equals("Malária")) {
            if (idade >= 0 && idade <= 2) {
                dose = 0.25;
            } else if (idade >= 3 && idade <= 9) {
                dose = 0.35;
            } else if (idade >= 10 && idade <= 18) {
                dose = 0.75;
            } else if (idade > 18) {
                dose = 0.8;
            }
        }

        //Vacina Covid-19
        if (vacina.equals("Covid-19")) {
            if (idade >= 0 && idade <= 2) {
                dose = 0.20;
            } else if (idade >= 3 && idade <= 9) {
                dose = 0.55;
            } else if (idade >= 10 && idade <= 18) {
                dose = 0.75;
            } else if (idade > 18) {
                dose = 0.85;
            }
        }

        //Vacina Outra Vacina
        if (vacina.equals("Outra Vacina")) {
            if (idade >= 0 && idade <= 2) {
                dose = 0.45;
            } else if (idade >= 3 && idade <= 9) {
                dose = 0.55;
            } else if (idade >= 10 && idade <= 18) {
                dose = 0.70;
            } else if (idade > 18) {
                dose = 0.95;
            }
        }
        InserirVacina(senhafila, nome, vacina, idade,  dose); //Registra aplicação da vacina no sistema
        JOptionPane.showMessageDialog(null, "O Paciente " + nome + " tem " + idade + " Ano(s), "
                + "\nVacina de  " + vacina + " com dosagem de " + dose + "ML Aplicada com Sucesso!");

    }

    public void CriarVacinas() {

        try {
            File f = new File("C:\\SistemaVacinas");

            if (!f.exists()) {
                f.mkdirs();
            }

            f = new File("C:\\SistemaVacinas\\vacinas.txt");

            if (!f.exists()) {
                f.createNewFile();
            }

            FileReader ler = new FileReader("C:\\SistemaVacinas\\vacinas.txt");
            BufferedReader lerArq = new BufferedReader(ler);
            String linha = lerArq.readLine();

            FileWriter arq = new FileWriter("C:\\SistemaVacinas\\vacinas.txt");
            int i;
            PrintWriter gravarArq = new PrintWriter(arq);

            while (linha == null) {
                gravarArq.println(linha);
                linha = lerArq.readLine();
            }

            gravarArq.write("Sarampo" + "\n" + "H1N1" + "\n" + "Meningite" + "\n" + "Malária" + "\n" + "Covid-19" + "\n" + "Outra Vacina");
//            for (i = 1; i <= 10; i++) {
//                gravarArq.printf("| %2d X %d = %2d |%n", i, 10, (i * 10));
//            }

            arq.close();

            System.out.print("Sarampo" + " "
                    + "H1N1" + " "
                    + "Meningite" + " "
                    + "Malária" + " "
                    + "Covid-19" + " "
                    + "Outra Vacina "
                    + "\n(Inseridos com sucesso! \"C:\\SistemaVacinas\\vacinas.txt)");
        } catch (Exception e) {
        }
    }

    public void InserirVacina(String senhafila, String nome, String vacina, int idade, double dosagem) {
        try {

            File f = new File("C:\\SistemaVacinas");

            if (!f.exists()) {
                f.mkdirs();
            }

            f = new File("C:\\SistemaVacinas\\vacinasaplicadas.txt");

            if (!f.exists()) {
                f.createNewFile();
            }

            FileReader ler = new FileReader("C:\\SistemaVacinas\\vacinasaplicadas.txt");
            BufferedReader lerArq = new BufferedReader(ler);
            String linha = lerArq.readLine();

            FileWriter arq = new FileWriter("C:\\SistemaVacinas\\vacinasaplicadas.txt");
            int i;
            PrintWriter gravarArq = new PrintWriter(arq);

            while (linha != null) {
                gravarArq.println(linha);
                linha = lerArq.readLine();
            }

            gravarArq.write(senhafila + " " + nome + " " + vacina + " " + idade + " " + dosagem);
//            for (i = 1; i <= 10; i++) {
//                gravarArq.printf("| %2d X %d = %2d |%n", i, 10, (i * 10));
//            }

            arq.close();

            System.out.print("\nAplicação registrada no sistema \n(dados inseridos em Inseridos com sucesso! \"C:\\SistemaVacinas\\vacinasaplicadas.txt\".\n)");
        } catch (Exception e) {
        }
    }
    
    public void VacinasAplicadas(){
    
    }

}
