package jbc.oct21.builder;


import java.io.InputStream;
import java.io.PrintStream;

// Builder interact with user and model via interface "UserInput"
// see jbc.oct21.Interface.UserInput for more information

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
