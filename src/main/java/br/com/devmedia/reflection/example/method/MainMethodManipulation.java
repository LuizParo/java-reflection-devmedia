package br.com.devmedia.reflection.example.method;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MainMethodManipulation {

    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName(Loja.class.getName());
        System.out.println("Quantity of methods: " + clazz.getMethods().length);
        System.out.println("Quantity of declared methods: " + clazz.getDeclaredMethods().length);
        
        Loja loja = (Loja) clazz.newInstance();
        setAttributesThruMethod(clazz.getDeclaredMethods(), loja);
        
        System.out.println("\nInvoking getters thru reflection.");
        showAttributesThruMethod(clazz.getDeclaredMethods(), loja);
    }

    private static void setAttributesThruMethod(Method[] methods, Loja loja) throws Exception {
        for (Method method : methods) {
            if(Modifier.isPrivate(method.getModifiers())) {
                method.setAccessible(true);
            }
            if(method.getName().contains("set")) {
                if(method.getName().equals("setNome")) {
                    method.invoke(loja, new Object[]{"Posto Estrela"});
                }
                if(method.getName().equals("setCnpj")) {
                    method.invoke(loja, new Object[]{258955441L});
                }
                if(method.getName().equals("setTipo")) {
                    method.invoke(loja, new Object[]{"Postos de combustível"});
                }
                if(method.getName().equals("setMatriz")) {
                    method.invoke(loja, new Object[]{true});
                }
            }
        }
    }
    
    private static void showAttributesThruMethod(Method[] declaredMethods, Loja loja) throws Exception {
        for (Method method : declaredMethods) {
            if(Modifier.isPrivate(method.getModifiers())) {
                method.setAccessible(true);
            }
            if(method.getName().contains("get") || method.getName().contains("is")) {
                System.out.println("Invoking " + method.getName() + ": " + method.invoke(loja, new Object[0]));
            }
        }
    }
}