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
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Paciente;
import model.Pessoa;
import view.frmAgendarConsulta;
import view.frmAplicarVacina;
import view.frmReceitarVacina;

/**
 *
 * @author Luan Costa
 */
public class Cadastro extends Pessoa {

    ArrayList<Paciente> paciente = new ArrayList<>();

    public Cadastro() {
    }

    public Cadastro(String nome, String cpf, String dataNacimento, String endereco, String telefone, String tipoUsuario, String usuario, String senha) {
        super(nome, cpf, dataNacimento, endereco, telefone, tipoUsuario, usuario, senha);
    }

    public void CadastrarPaciente(String nome, String cpf, String data, String endereco, String telefone, String tipo, String usuario, String senha) {
//
//        Paciente p = new Paciente(nome, cpf, data, endereco, telefone, tipo, usuario, senha);
//        paciente.add(p);
        CadastroTexto(nome, cpf, data, endereco, telefone, tipo, usuario, senha);

        JOptionPane.showMessageDialog(null, "Dados cadastrados com Sucesso " + nome
                + "\nSeu usuário é: " + nome
                + "\nSua Senha é: " + senha);

    }

    public void Cadastrar(String nome, String cpf, String data, String endereco, String telefone, String tipo, String usuario, String senha, String cod) {
//
//        Paciente p = new Paciente(nome, cpf, data, endereco, telefone, tipo, usuario, senha);
//        paciente.add(p);
        CadastroTexto(nome, cpf, data, endereco, telefone, tipo, usuario, senha);

        JOptionPane.showMessageDialog(null, "Dados cadastrados com Sucesso " + nome
                + "\nSeu usuário é: " + nome
                + "\nSua Senha é: " + senha);

    }

    public void CadastrarCod(String nome, String cpf, String data, String endereco, String telefone, String tipo, String usuario, String senha, String cod) {
//
//        Paciente p = new Paciente(nome, cpf, data, endereco, telefone, tipo, usuario, senha);
//        paciente.add(p);
        CadastroTextoCod(nome, cpf, data, endereco, telefone, tipo, usuario, senha, cod);

        JOptionPane.showMessageDialog(null, "Dados cadastrados com Sucesso "
                + "\nSeu usuário é: " + usuario
                + "\nSua Senha é: " + senha);

    }

    public void DadosPaciente() {
        JOptionPane.showMessageDialog(null, "Dados do Paciente"
                + "\n Nome: " + getNome()
                + "\nCPF: " + getCpf()
                + "\nData de Nascimento: " + getDataNacimento()
                + "\nEndereço: " + getEndereco()
                + "\nTelefone: " + getTelefone()
                + "\nTipo: " + getTipoUsuario()
                + "\nUsuário: " + getUsuario()
                + "\nSenha do Usuário: " + getSenha());

        //
//        setNome(nome);
//        setCpf(cpf);
//        setDataNacimento(data);
//        setEndereco(endereco);
//        setTelefone(telefone);
//        setTipoUsuario(tipo);
//        setUsuario(usuario);
//        setSenha(senha);
    }

    public boolean LoginPaciente(String user, String senha) {

//        {
//        Aluno contato = null;
//        for (Aluno al : aluno) {
//            if (rgm.equals(al.getRgm())) {
//                return al;
//            }
//        }
//        return contato;
        logintexto(user, senha);

//        for (Paciente p : paciente) {
//            if (user.equals(p.getUsuario()) && senha.equals(p.getSenha())) {
//                JOptionPane.showMessageDialog(null, "Bem vindo " + p.getUsuario());
//                frmInfo menu = new frmInfo();
//                menu.setVisible(true);
//
//            } else {
//                JOptionPane.showMessageDialog(null, "Dados Inválidos!" + p.getUsuario());
//            }
//        }
        return true;
    }

    public void CadastroTexto(String nome, String cpf, String dataNacimento, String endereco, String telefone, String tipoUsuario, String usuario, String senha) {

        try {

            File f = new File("C:\\SistemaVacinas");

            if (!f.exists()) {
                f.mkdirs();
            }

            f = new File("C:\\SistemaVacinas\\usuarios.txt");

            if (!f.exists()) {
                f.createNewFile();
            }

            FileReader ler = new FileReader("C:\\SistemaVacinas\\usuarios.txt");
            BufferedReader lerArq = new BufferedReader(ler);
            String linha = lerArq.readLine();

            FileWriter arq = new FileWriter("C:\\SistemaVacinas\\usuarios.txt");
            int i;
            PrintWriter gravarArq = new PrintWriter(arq);

            while (linha != null) {
                gravarArq.println(linha);
                linha = lerArq.readLine();
            }

            gravarArq.write(usuario + " " + senha + " " + tipoUsuario + " " + nome + " " + cpf + " " + dataNacimento + " " + endereco + " " + telefone);
//            for (i = 1; i <= 10; i++) {
//                gravarArq.printf("| %2d X %d = %2d |%n", i, 10, (i * 10));
//            }

            arq.close();

            System.out.print("\nDados do usuario " + usuario + " (Inseridos com sucesso! \"C:\\SistemaVacinas\\usuarios.txt\".\n)");
        } catch (Exception e) {
        }

    }

    public void CadastroTextoCod(String nome, String cpf, String dataNacimento, String endereco, String telefone, String tipoUsuario, String usuario, String senha, String cod) {

        try {
            File f = new File("C:\\SistemaVacinas");

            if (!f.exists()) {
                f.mkdirs();
            }

            f = new File("C:\\SistemaVacinas\\usuarios.txt");

            if (!f.exists()) {
                f.createNewFile();
            }

            FileReader ler = new FileReader("C:\\SistemaVacinas\\usuarios.txt");
            BufferedReader lerArq = new BufferedReader(ler);
            String linha = lerArq.readLine();

            FileWriter arq = new FileWriter("C:\\SistemaVacinas\\usuarios.txt");
            int i;
            PrintWriter gravarArq = new PrintWriter(arq);

            while (linha != null) {
                gravarArq.println(linha);
                linha = lerArq.readLine();
            }

            gravarArq.write(usuario + " " + senha + " " + tipoUsuario + " " + nome + " " + cpf + " " + dataNacimento + " " + endereco + " " + telefone + " " + cod);
//            for (i = 1; i <= 10; i++) {
//                gravarArq.printf("| %2d X %d = %2d |%n", i, 10, (i * 10));
//            }

            arq.close();

            System.out.printf("\nDados do usuario " + usuario + " (Inseridos com sucesso! \"C:\\SistemaVacinas\\usuarios.txt\".\n)");
        } catch (Exception e) {
        }

    }

    public void logintexto(String user, String pass) {

        try {
            FileReader arq = new FileReader("C:\\SistemaVacinas\\usuarios.txt");
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine(); // lê a primeira linha
// a variável "linha" recebe o valor "null" quando o processo
// de repetição atingir o final do arquivo texto
            while (linha != null) {

                String[] lista = linha.split(" ");

                if (lista[0].equals(user) && lista[1].equals(pass)) {
                    sessao(linha);
                    JOptionPane.showMessageDialog(null, "Bem vindo " + user);
                    if (lista[2].equals("Paciente")) {
                        frmAgendarConsulta agendar = new frmAgendarConsulta();
                        agendar.setVisible(true);
                    } else if (lista[2].equals("Enfermeira")) {
                        frmAplicarVacina aplicar = new frmAplicarVacina();
                        aplicar.setVisible(true);
                    } else if (lista[2].equals("Medico")) {
                        frmReceitarVacina receitar = new frmReceitarVacina();
                        receitar.setVisible(true);
                    }else{
                        JOptionPane.showMessageDialog(null, "Dados Inválidos!");
                    }
                }

                System.out.printf("%s\n", linha);

                linha = lerArq.readLine(); // lê da segunda até a última linha
            }

            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }

//        for (Paciente p : paciente) {
//            if (user.equals(p.getUsuario()) && senha.equals(p.getSenha())) {
//                JOptionPane.showMessageDialog(null, "Bem vindo " + p.getUsuario());
//                frmInfo menu = new frmInfo();
//                menu.setVisible(true);
//
//            } else {
//                JOptionPane.showMessageDialog(null, "Dados Inválidos!" + p.getUsuario());
//            }
//        }
//        return true;
    }

    public void sessao(String l) {
        try {
            File f = new File("C:\\SistemaVacinas");

            if (!f.exists()) {
                f.mkdirs();
            }
            

            FileWriter arq = new FileWriter("C:\\SistemaVacinas\\sessao.txt");
            int i;
            PrintWriter gravarArq = new PrintWriter(arq);

            gravarArq.println(l);
           
//            for (i = 1; i <= 10; i++) {
//                gravarArq.printf("| %2d X %d = %2d |%n", i, 10, (i * 10));
//            }

            arq.close();

            System.out.printf("\nDados gravados em sessão! " + "(Inseridos com sucesso! \"C:\\SistemaVacinas\\sessao.txt\".\n)");
        } catch (Exception e) {
        }

    }
    
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
    
    public void geracodconsulta(){
    
    

}

}
