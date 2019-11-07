package jbc.oct21.model;

public class DegreeType {
    private String label;

    public DegreeType() {
    }

    public DegreeType(String label) {
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
