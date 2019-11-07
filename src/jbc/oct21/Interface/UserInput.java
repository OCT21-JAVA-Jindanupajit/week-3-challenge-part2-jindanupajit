package jbc.oct21.Interface;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public interface UserInput <T> {

    default String  prompt() {
        StringBuilder sb = new StringBuilder();
        String guide = guide();

        sb.append( typeName() );
        sb.append( guide==null?"":" ("+guide+")" );
        sb.append(" > ");

        return sb.toString();
    }

    default T retrieve(PrintStream printStream, InputStream inputStream) {
        Scanner scanner = new Scanner(inputStream);


        String value = "";
        do {
            printStream.print(prompt());
            try {
                value = scanner.nextLine();
                // Flush input buffer
                while (inputStream.available() > 0) {
                    inputStream.read();
                }

            } catch (IOException e) {
                value = "";
            } finally {
                if (value.equalsIgnoreCase("abort")) {
                    System.err.println("User abort");
                    System.exit(1);
                }
            }

            if (! isValidValue(value)) {
                System.err.println(" * Not a valid input\n");
            }
        } while (! isValidValue(value));

        return store(value);
    }

    default String typeName() {
        return getClass().getSimpleName();
    }
    default String guide() {
        return null;
    }

    public T store(String string) ;

    public boolean isValidValue(String string);
}
