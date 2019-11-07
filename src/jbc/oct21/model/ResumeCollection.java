package jbc.oct21.model;

import java.util.ArrayList;
import java.util.Collection;

public class ResumeCollection extends ArrayList<Resume> {
    public ResumeCollection(int initialCapacity) {
        super(initialCapacity);
    }

    public ResumeCollection() {
    }

    public ResumeCollection(Collection<? extends Resume> c) {
        super(c);
    }
}
