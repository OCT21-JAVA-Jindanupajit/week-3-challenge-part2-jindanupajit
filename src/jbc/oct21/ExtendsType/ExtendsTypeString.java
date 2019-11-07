package jbc.oct21.ExtendsType;

import java.io.InputStream;

public class ExtendsTypeString extends ExtendsType<String> {
    public ExtendsTypeString() {
    }

    public ExtendsTypeString(String value) {
        super(value);
    }

    @Override
    public String toString() {
        if (this.getValue() == null)
            return "";
        else
            return this.getValue();
    }


    @Override
    public String store(String string) {
        setValue(string);
        return getValue();
    }

    @Override
    public boolean isValidValue(String string) {
        return true;
    }
}
