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
public abstract class Projeto {

    private String titulo;
    private String dataInicio;
    private double orcamento;


    public Projeto(String titulo, String dataInicio, double orcamento) {
        this.titulo = titulo;
        this.dataInicio = dataInicio;
        this.orcamento = orcamento;
    }


    public String getTitulo() {
        return titulo;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }

    public abstract int calcularPrazo();
}

    

