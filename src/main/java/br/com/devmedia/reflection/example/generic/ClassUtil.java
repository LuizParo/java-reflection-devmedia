package br.com.devmedia.reflection.example.generic;

import java.lang.reflect.ParameterizedType;

public class ClassUtil {

    @SuppressWarnings("unchecked")
    public static <T> Class<T> getClass(Class<T> clazz, Integer pos) {
        return (Class<T>) ((ParameterizedType)clazz.getGenericSuperclass()).getActualTypeArguments()[0];
    }
}