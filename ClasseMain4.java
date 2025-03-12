/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classemain4;

/**
 *
 * @author aluno.saolucas
 */
public class ClasseMain4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Filme filme = new Filme("O Filme", "12/03/2025", 500000.0, 120);
        

        Musica musica = new Musica("A Canção ", "12/03/2025", 5000.0, 200);

        System.out.println("Prazo do Filme: " + filme.calcularPrazo() + " dias");
        System.out.println("Prazo da Música: " + musica.calcularPrazo() + " dias");
    }
}


