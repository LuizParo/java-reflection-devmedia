package br.com.devmedia.reflection.example.superclass;

public class ClienteAssociado extends Cliente {

    public ClienteAssociado(Integer idade) {
        super(idade);
    }

    @Override
    public Integer getIdade() {
        System.out.println("Getting 'idade' from " + this.getClass().getSimpleName());
        return super.getIdade();
    }
}