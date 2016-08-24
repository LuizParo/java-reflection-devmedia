package br.com.devmedia.reflection.example.constructor;

public class Pessoa {
    private String nome;
    private Integer idade;
    private String endereco;
    
    public Pessoa() {
    }
    
    public Pessoa(String nome, Integer idade, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    @SuppressWarnings("unused")
    private Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(Integer idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getEndereco() {
        return endereco;
    }
}