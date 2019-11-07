package jbc.oct21.ExtendsType;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class MonthYear extends ExtendsType<java.time.YearMonth> {
    public MonthYear() {
    }

    public MonthYear(YearMonth value) {
        super(value);
    }

    @Override
    public String guide() {
        return "YYYY.MM ex: '2019-11'";
    }

    @Override
    public YearMonth store(String string)  {
        YearMonth yearMonth;

        yearMonth = YearMonth.parse(string);

        this.setValue(yearMonth);

        return yearMonth;
    }

    @Override
    public boolean isValidValue(String string) {
        return string.matches("^[1-2][0-9]{3}-(1[0-2]|0[1-9])$");
    }

    @Override
    public String toString() {

        return  this.getValue().format(DateTimeFormatter.ofPattern("MMM yyyy"));
    }
}
