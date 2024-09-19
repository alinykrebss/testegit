package br.edu.unisep.testegit.model;

public class pao {
    private String nome;
    private int idade;
    private String sexo;
    private int ano;

    public pao(String nome, int idade, String sexo, int ano) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.ano = ano;
    }
    public Boolean ligar(){
        return this.sexo;
    }
}
