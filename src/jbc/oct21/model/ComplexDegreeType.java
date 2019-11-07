package jbc.oct21.model;

public class ComplexDegreeType {
    private String label;

    public ComplexDegreeType() {
    }

    public ComplexDegreeType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
