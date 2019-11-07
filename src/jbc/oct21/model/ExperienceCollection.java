package jbc.oct21.model;

import java.util.ArrayList;
import java.util.Collection;

public class ExperienceCollection extends ArrayList<Experience> {
    public ExperienceCollection(int initialCapacity) {
        super(initialCapacity);
    }

    public ExperienceCollection() {
    }

    public ExperienceCollection(Collection<? extends Experience> c) {
        super(c);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Experience\n");

        // Java 8 style for-enhanced
        this.forEach( (eachExperience)->{
            sb.append(eachExperience);
        });

        sb.append("\n");

        return sb.toString();
    }


}
