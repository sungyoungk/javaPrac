package javaPrac.generic;

public class CastingGenericDTO<T> {
    private T object;

    public void setObject(T object){
        this.object = object;
    }

    public T getObject() {
        return object;
    }
}
