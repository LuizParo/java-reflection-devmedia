package br.com.devmedia.reflection.example.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Collection;

public class ColletionHandler implements InvocationHandler {
    private Collection<?> collection;

    public ColletionHandler(Collection<?> collection) {
        this.collection = collection;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("\nInvoking method: " + method.getName());
        
        long start = System.currentTimeMillis();
        Object object = method.invoke(this.collection, args);
        long end = System.currentTimeMillis();
        
        System.out.println("Invoked method: " + method.getName());
        System.out.println("Execution time: " + (end - start) + " milliseconds");
        return object;
    }
}