package br.com.devmedia.reflection.example.superclass;

import br.com.devmedia.reflection.example.constructor.Pessoa;

public class MainSuperclassManipulation {

    public static void main(String[] args) throws Exception {
        ClienteAssociado associado = new ClienteAssociado(19);
        System.out.println("Customer age: " + associado.getIdade());
        
        Class<? extends ClienteAssociado> clazz = associado.getClass();
        Class<?> superClass = clazz.getSuperclass();
        while(!superClass.isAssignableFrom(Pessoa.class)) {
            superClass = clazz.getSuperclass();
        }
        
        System.out.println(superClass.getSimpleName());
        int age = (int) superClass.getDeclaredMethod("getIdade", new Class[0]).invoke(superClass.newInstance(), new Object[0]);
        System.out.println("Age: " + age);
    }
}