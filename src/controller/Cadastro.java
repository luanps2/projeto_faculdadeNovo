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

    public Cadastro(String nome, String cpf, int idade, String endereco, String telefone, String tipoUsuario, String usuario, String senha) {
        super(nome, cpf, idade, endereco, telefone, tipoUsuario, usuario, senha);
    }

    public void CadastrarPaciente(String nome, String cpf, int idade, String endereco, String telefone, String tipo, String usuario, String senha) {
//
//        Paciente p = new Paciente(nome, cpf, data, endereco, telefone, tipo, usuario, senha);
//        paciente.add(p);
        CadastroTexto(nome, cpf, idade, endereco, telefone, tipo, usuario, senha);

        JOptionPane.showMessageDialog(null, "Dados cadastrados com Sucesso " + nome
                + "\nSeu usuário é: " + nome
                + "\nSua Senha é: " + senha);

    }

    public void Cadastrar(String nome, String cpf, int idade, String endereco, String telefone, String tipo, String usuario, String senha, String cod) {
//
//        Paciente p = new Paciente(nome, cpf, data, endereco, telefone, tipo, usuario, senha);
//        paciente.add(p);
        CadastroTexto(nome, cpf, idade, endereco, telefone, tipo, usuario, senha);

        JOptionPane.showMessageDialog(null, "Dados cadastrados com Sucesso " + nome
                + "\nSeu usuário é: " + nome
                + "\nSua Senha é: " + senha);

    }

    public void CadastrarCod(String nome, String cpf, int idade, String endereco, String telefone, String tipo, String usuario, String senha, String cod) {
//
//        Paciente p = new Paciente(nome, cpf, idade, endereco, telefone, tipo, usuario, senha);
//        paciente.add(p);
        CadastroTextoCod(nome, cpf, idade, endereco, telefone, tipo, usuario, senha, cod);

        JOptionPane.showMessageDialog(null, "Dados cadastrados com Sucesso "
                + "\nSeu usuário é: " + usuario
                + "\nSua Senha é: " + senha);

    }

//    public void DadosPaciente() {
//        JOptionPane.showMessageDialog(null, "Dados do Paciente"
//                + "\n Nome: " + getNome()
//                + "\nCPF: " + getCpf()
//                + "\nIdade: " + getIdade()
//                + "\nEndereço: " + getEndereco()
//                + "\nTelefone: " + getTelefone()
//                + "\nTipo: " + getTipoUsuario()
//                + "\nUsuário: " + getUsuario()
//                + "\nSenha do Usuário: " + getSenha());
//
//        
//        setNome(nome);
//        setCpf(cpf);
//        setDataNacimento(data);
//        setEndereco(endereco);
//        setTelefone(telefone);
//        setTipoUsuario(tipo);
//        setUsuario(usuario);
//        setSenha(senha);
//    }

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

    public void CadastroTexto(String nome, String cpf, int idade, String endereco, String telefone, String tipoUsuario, String usuario, String senha) {

        ListaPacientes(nome);
        
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

            gravarArq.write(usuario + " " + senha + " " + tipoUsuario + " " + nome + " " + cpf + " " + idade + " " + endereco + " " + telefone);
//            for (i = 1; i <= 10; i++) {
//                gravarArq.printf("| %2d X %d = %2d |%n", i, 10, (i * 10));
//            }

            arq.close();

            System.out.print("\nDados do usuario " + usuario + " (Inseridos com sucesso! \"C:\\SistemaVacinas\\usuarios.txt\".\n)");
        } catch (Exception e) {
        }

    }

    public void CadastroTextoCod(String nome, String cpf, int idade, String endereco, String telefone, String tipoUsuario, String usuario, String senha, String cod) {

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

            gravarArq.write(usuario + " " + senha + " " + tipoUsuario + " " + nome + " " + cpf + " " + idade + " " + endereco + " " + telefone + " " + cod);
//            for (i = 1; i <= 10; i++) {
//                gravarArq.printf("| %2d X %d = %2d |%n", i, 10, (i * 10));
//            }

            arq.close();

            System.out.printf("\nDados do usuario " + usuario + " (Inseridos com sucesso! \"C:\\SistemaVacinas\\usuarios.txt\".\n)");
        } catch (Exception e) {
        }

    }

    public void logintexto(String user, String pass) {

        Session s = new Session();
        
        try {
            FileReader arq = new FileReader("C:\\SistemaVacinas\\usuarios.txt");
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine(); // lê a primeira linha
// a variável "linha" recebe o valor "null" quando o processo
// de repetição atingir o final do arquivo texto
            while (linha != null) {

                String[] lista = linha.split(" ");

                if (lista[0].equals(user) && lista[1].equals(pass)) {
                    s.sessao(linha);
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

                System.out.printf("%s\n", linha);//imprime todos usuarios no console para facilitar o acesso

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

    public void ListaPacientes(String nome) {
        try {
            File f = new File("C:\\SistemaVacinas");

            if (!f.exists()) {
                f.mkdirs();
            }

            f = new File("C:\\SistemaVacinas\\pacientes.txt");

            if (!f.exists()) {
                f.createNewFile();
            }

            FileReader ler = new FileReader("C:\\SistemaVacinas\\pacientes.txt");
            BufferedReader lerArq = new BufferedReader(ler);
            String linha = lerArq.readLine();

            FileWriter arq = new FileWriter("C:\\SistemaVacinas\\pacientes.txt");
            int i;
            PrintWriter gravarArq = new PrintWriter(arq);

            while (linha != null) {
                gravarArq.println(linha);
                linha = lerArq.readLine();
            }

            gravarArq.write(nome);
//            for (i = 1; i <= 10; i++) {
//                gravarArq.printf("| %2d X %d = %2d |%n", i, 10, (i * 10));
//            }

            arq.close();

            System.out.printf("\nDados do usuario " + nome + " (Inseridos com sucesso! \"C:\\SistemaVacinas\\pacientes.txt\".\n)");
        } catch (Exception e) {
        }

    }
    
 
    
    public void geracodconsulta(){
    
    

}

}
