package br.com.devmedia.reflection.example.field;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;

public class MainFieldManipulation {

    public static void main(String[] args) throws Exception {
        Vehicle vehicle = new Vehicle();
        vehicle.setBrand("FIAT");
        vehicle.setWeight(550.0);
        vehicle.setPotency(1.2);
        vehicle.setMaxCapacityPassengers(5);
        vehicle.setPrice(new BigDecimal("20450.0"));
        
        Class<? extends Vehicle> clazz = vehicle.getClass();
        System.out.println("Quantity of fields: " + clazz.getFields().length);
        System.out.println("Quantity of declared fields: " + clazz.getDeclaredFields().length);
        
        showValuesInFields(clazz.getDeclaredFields(), vehicle);
    }

    private static void showValuesInFields(Field[] fields, Object obj) throws IllegalArgumentException, IllegalAccessException {
        System.out.println("\nValues of properties from " + obj.getClass().getName() + ":");
        for (Field field : fields) {
            if(Modifier.isPrivate(field.getModifiers())) {
                field.setAccessible(true);
            }
            System.out.println(field.getName() + ": " + field.get(obj));
        }
    }
}