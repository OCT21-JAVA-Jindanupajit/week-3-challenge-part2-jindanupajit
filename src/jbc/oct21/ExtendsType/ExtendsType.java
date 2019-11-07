package jbc.oct21.ExtendsType;

public class ExtendsType <T> {
    private T value;

    public ExtendsType() {
    }

    public ExtendsType(T value) {
        this.setValue(value);
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
