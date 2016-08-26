package br.com.devmedia.reflection.example.proxy;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;

public class MainProxyManipulation {

    public static void main(String[] args) {
        Collection<Object> collectionNotProxied = new ArrayList<>();
        
        @SuppressWarnings("unchecked")
        Collection<Object> collectionProxied = (Collection<Object>) Proxy
                .newProxyInstance(collectionNotProxied.getClass().getClassLoader(),
                        new Class[]{Collection.class},
                        new ColletionHandler(collectionNotProxied)
                );
        
        collectionProxied.add("TEST");
        collectionProxied.add("TEST1");
        collectionProxied.add("TEST2");
        collectionProxied.add("TEST3");
    }
}