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
public class Bicicleta extends Equipamento{

    private String tipo;

    public Bicicleta(String nome, double precoAluguel, String tipo) {
        super(nome, precoAluguel);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public int definirDurabilidade() {

        return 50;
    }
}


    

