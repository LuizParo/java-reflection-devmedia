package br.com.devmedia.reflection.example.generic;

public class MainGenericManipulation {

    public static void main(String[] args) {
        PessoaDao dao = new PessoaDao();
        System.out.println(dao.createInstanceThruReflection());
    }
}