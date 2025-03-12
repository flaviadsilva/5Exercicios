/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classemain3;

/**
 *
 * @author aluno.saolucas
 */
public class ClasseMain3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Bicicleta bicicleta = new Bicicleta("Bicicleta de Montanha", 30.0, "Montanha");

        Bola bola = new Bola("Bola de Futebol", 15.0, "Couro");


        System.out.println("Durabilidade da " + bicicleta.getNome() + ": " + bicicleta.definirDurabilidade() + " horas");
        System.out.println("Durabilidade da " + bola.getNome() + ": " + bola.definirDurabilidade() + " horas");
    }
}

    
    

