package br.com.devmedia.reflection.example.constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class MainConstructorManipulation {
    
    public static void main(String[] args) throws Exception {
        Class<Pessoa> clazz = Pessoa.class;
        System.out.println("Quantity of constructors: " + clazz.getConstructors().length);
        System.out.println("Quantity of declared constructors: " + clazz.getDeclaredConstructors().length);
        
        instantiateClassByConstructor(clazz.getDeclaredConstructor(new Class[]{String.class}));
    }

    private static void instantiateClassByConstructor(Constructor<Pessoa> constructor) throws Exception {
        if(Modifier.isPrivate(constructor.getModifiers())) {
            constructor.setAccessible(true);
        }
        Pessoa pessoa = constructor.newInstance(new Object[]{"Teste"});
        System.out.println("'Name' received from reflection: " + pessoa.getNome());
    }
}