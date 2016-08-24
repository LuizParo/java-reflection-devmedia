package br.com.devmedia.reflection.example.method;

public class Loja {
    private String nome;
    private Long cnpj;
    private String tipo;
    private boolean matriz;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isMatriz() {
        return matriz;
    }

    public void setMatriz(boolean matriz) {
        this.matriz = matriz;
    }

    @Override
    public String toString() {
        return "Loja [nome=" + nome + ", cnpj=" + cnpj + ", tipo=" + tipo + ", matriz=" + matriz + "]";
    }
}