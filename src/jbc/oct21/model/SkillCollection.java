package jbc.oct21.model;

import java.util.ArrayList;
import java.util.Collection;

public class SkillCollection extends ArrayList<Skill> {

    public SkillCollection(int initialCapacity) {
        super(initialCapacity);
    }

    public SkillCollection() {
    }

    public SkillCollection(Collection<? extends Skill> c) {
        super(c);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Skills\n");

        this.forEach( (eachSkill) -> {
            sb.append(eachSkill).append("\n");
        });

        sb.append("\n");

        return sb.toString();
    }
}
