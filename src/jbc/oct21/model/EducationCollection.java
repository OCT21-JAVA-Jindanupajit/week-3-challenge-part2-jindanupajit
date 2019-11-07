package jbc.oct21.model;

import java.util.ArrayList;
import java.util.Collection;

public class EducationCollection extends ArrayList<Education> {

    public EducationCollection(int initialCapacity) {
        super(initialCapacity);
    }

    public EducationCollection() {
    }

    public EducationCollection(Collection<? extends Education> c) {
        super(c);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Education\n");

        // Java 8 style, Equivalent to for-enhanced
        this.forEach( (eachEducation) -> {
            sb.append(eachEducation)
                    .append("\n");
        });

        return sb.toString();
    }
}
