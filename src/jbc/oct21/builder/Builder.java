package jbc.oct21.builder;

import jbc.oct21.Interface.UserInput;
import jdk.internal.util.xml.impl.Input;

import java.io.InputStream;
import java.io.PrintStream;

public abstract class Builder {

    public void auto() {
        this.auto(System.out, System.in);
    }

    public void auto(PrintStream printStream) {
        this.auto(printStream, System.in);
    }

    public void auto(InputStream inputStream) {
        this.auto(System.out, inputStream);
    }

    public abstract void auto(PrintStream printStream, InputStream inputStream) ;
}
