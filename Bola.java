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
public class Bola extends Equipamento{

    private String material;


    public Bola(String nome, double precoAluguel, String material) {
        super(nome, precoAluguel);
        this.material = material;
    }


    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }


    @Override
    public int definirDurabilidade() {

        return 20;
    }
}

    

