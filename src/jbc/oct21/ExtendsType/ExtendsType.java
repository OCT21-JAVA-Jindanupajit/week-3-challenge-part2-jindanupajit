package jbc.oct21.ExtendsType;

import jbc.oct21.Interface.UserInput;

import java.io.InputStream;

public abstract class ExtendsType <T> implements UserInput<T> {
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
