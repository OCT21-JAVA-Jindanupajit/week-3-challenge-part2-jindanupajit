package jbc.oct21.ExtendsType;

public class ExtendsTypeString extends ExtendsType<String> {
    public ExtendsTypeString() {
    }

    public ExtendsTypeString(String value) {
        super(value);
    }

    @Override
    public String toString() {
        return this.getValue();
    }
}
