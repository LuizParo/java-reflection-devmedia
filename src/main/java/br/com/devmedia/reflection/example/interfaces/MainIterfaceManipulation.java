package br.com.devmedia.reflection.example.interfaces;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class MainIterfaceManipulation {

    public static void main(String[] args) throws Exception {
        ResourceBundle bundle = ResourceBundle.getBundle("comExample");
        Class.forName(bundle.getString("driverClassName"));
        
        Connection connection = DriverManager.getConnection(bundle.getString("url"), bundle.getString("username"), bundle.getString("password"));
        Class<?> clazz = connection.getClass();
        System.out.println("Connection implementation class: " + clazz.getName());
        
        System.out.println("\nShowing interfaces:");
        while(!clazz.getSuperclass().equals(Object.class)) {
            showInterfaces(clazz.getInterfaces());
            clazz = clazz.getSuperclass();
        }
    }

    private static void showInterfaces(Class<?>[] interfaces) throws Exception {
        for (Class<?> intf : interfaces) {
            System.out.println("\nInterface name: " + intf.getSimpleName());
            showFields(intf.getDeclaredFields());
            showMethods(intf.getDeclaredMethods());
            showInterfaces(intf.getInterfaces());
        }
    }

    private static void showFields(Field[] fields) throws Exception {
        System.out.println("\tShowing fields:");
        for (Field field : fields) {
            System.out.println("\tField name: " + field.getName());
            if(Modifier.isStatic(field.getModifiers())) {
                System.out.println("\tField value: " + field.get(null));
            }
        }
    }
    
    private static void showMethods(Method[] methods) {
        System.out.println("\tShowing methods:");
        for (Method method : methods) {
            System.out.println("\tMethod name: " + method.getName());
        }
    }
}