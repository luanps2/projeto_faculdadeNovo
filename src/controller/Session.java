/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import model.Pessoa;

/**
 *
 * @author Luan Costa
 */
public class Session extends Pessoa {

    public void sessao(String s) {
        try {
            File f = new File("C:\\SistemaVacinas");

            if (!f.exists()) {
                f.mkdirs();
            }

            FileWriter arq = new FileWriter("C:\\SistemaVacinas\\sessao.txt");
            int i;
            PrintWriter gravarArq = new PrintWriter(arq);

            gravarArq.println(s);

//            for (i = 1; i <= 10; i++) {
//                gravarArq.printf("| %2d X %d = %2d |%n", i, 10, (i * 10));
//            }
            arq.close();

            System.out.printf("\nDados gravados em sessão! " + "(Inseridos com sucesso! \"C:\\SistemaVacinas\\sessao.txt\".\n)");
        } catch (Exception e) {
        }

    }

}
