/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classemain2;

/**
 *
 * @author aluno.saolucas
 */
public class ClasseMain2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Livro l1 = new Livro("O Hobbit", "J.R.R. Tolkien");
        System.out.println("Livro: " + l1.getTitulo() + ", Disponível: " + l1.isDisponivel());
        l1.emprestar();
        System.out.println("Após empréstimo: " + l1.isDisponivel());
        l1.devolver();
        System.out.println("Após devolução: " + l1.isDisponivel());
    }
    }

