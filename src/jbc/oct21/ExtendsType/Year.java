package jbc.oct21.ExtendsType;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Year extends ExtendsType<java.time.Year> {
    public Year() {
    }

    public Year(java.time.Year value) {
        super(value);
    }

    @Override
    public String guide() {
        return "YYYY ex: '2019'";
    }

    @Override
    public java.time.Year store(String string)  {
        java.time.Year year;

        year = java.time.Year.parse(string);

        this.setValue(year);
        return year;
    }

    @Override
    public boolean isValidValue(String string) {
        return string.matches("^[1-2][0-9]{3}$");
    }

    @Override
    public String toString() {

        return  getValue().toString();
    }
}
