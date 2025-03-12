/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classemain;

/**
 *
 * @author aluno.saolucas
 */
public class Participante {

    private String nomeCompleto;
    private String email;
    private String dataInscricao;

    public Participante(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
        this.dataInscricao = "12/03/2025";
    }

    public Participante(String nomeCompleto, String email, String dataInscricao) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.dataInscricao = dataInscricao;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public String getDataInscricao() {
        return dataInscricao;
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Erro: O email deve conter '@'.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nomeCompleto);
        System.out.println("Email: " + email);
        System.out.println("Data de Inscrição: " + dataInscricao);
    }
}

