package br.com.devmedia.reflection.example.generic;

import br.com.devmedia.reflection.example.constructor.Pessoa;

public class PessoaDao extends GenericDao<Pessoa> {

    public Pessoa createInstanceThruReflection() {
        return this.getInstanceByType();
    }
}