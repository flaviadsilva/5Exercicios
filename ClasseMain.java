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
public class ClasseMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Participante participante1 = new Participante("Flávia Silva");
        participante1.setEmail("flavia.silva@gmail.com");
        
        Participante participante2 = new Participante("Rafael moraes", "rafael.moraes@hotmail.com", "12/03/2025");
        

        System.out.println("Informações do Participante 1:");
        participante1.exibirInformacoes();
        System.out.println("\nInformações do Participante 2:");
        participante2.exibirInformacoes();
    }
    
}
