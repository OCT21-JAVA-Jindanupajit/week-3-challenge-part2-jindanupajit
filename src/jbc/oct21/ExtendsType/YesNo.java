package jbc.oct21.ExtendsType;

public class YesNo extends ExtendsTypeString {
    public YesNo() {
    }

    public YesNo(String value) {
        super(value);
    }

    public boolean isYes() {
        if (getValue() == null) return false;

        if (getValue().equalsIgnoreCase("yes"))
            return true;
        else
            return false;
    }

    public boolean isNo() {
        if (getValue() == null) return false;

        if (getValue().equalsIgnoreCase("no"))
            return true;
        else
            return false;
    }

    @Override
    public String typeName() {
        return "Yes/No ?";
    }

    @Override
    public String guide() {
        return "answer: y or n";
    }

    @Override
    public String store(String string) {
        string = string.toLowerCase();
        switch(string) {
            case "y":
                return super.store("yes");

            case "yes":
            case "no":
                return super.store(string);
            case "n":
            default:
                return super.store("no");
        }

    }

    @Override
    public boolean isValidValue(String string) {
        string = string.toLowerCase();
        switch(string) {
            case "y":
            case "yes":
            case "n":
            case "no":
                return true;
        }
        return false;
    }
}
