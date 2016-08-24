package br.com.devmedia.reflection.example.superclass;

import br.com.devmedia.reflection.example.constructor.Pessoa;

public class Cliente extends Pessoa {

    public Cliente(Integer idade) {
        super(idade);
    }
    
    @Override
    public Integer getIdade() {
        System.out.println("Getting 'idade' from " + this.getClass().getSimpleName());
        return super.getIdade();
    }
}