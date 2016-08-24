package br.com.devmedia.reflection.example.generic;

public abstract class GenericDao<T> {
    
    @SuppressWarnings("unchecked")
    public T getInstanceByType() {
        try {
            return (T) ClassUtil.getClass(this.getClass(), 0).newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }
}