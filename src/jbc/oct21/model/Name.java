package jbc.oct21.model;

import jbc.oct21.ExtendsType.FirstName;
import jbc.oct21.ExtendsType.LastName;
import jbc.oct21.ExtendsType.MiddleName;

public class Name {
    private FirstName first;
    private MiddleName middle;
    private LastName last;

    public Name() {
    }

    public Name(FirstName first, MiddleName middle, LastName last) {
        this.first = first;
        this.middle = middle;
        this.last = last;
    }

    public FirstName getFirst() {
        return first;
    }

    public void setFirst(FirstName first) {
        this.first = first;
    }

    public MiddleName getMiddle() {
        return middle;
    }

    public void setMiddle(MiddleName middle) {
        this.middle = middle;
    }

    public LastName getLast() {
        return last;
    }

    public void setLast(LastName last) {
        this.last = last;
    }

    @Override
    public String toString() {
        return first+" "+middle+" "+last;
    }
}
