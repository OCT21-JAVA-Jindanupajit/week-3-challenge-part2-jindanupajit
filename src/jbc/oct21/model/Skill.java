package jbc.oct21.model;

import jbc.oct21.ExtendsType.SkillName;
import jbc.oct21.ExtendsType.SkillProficiency;

public class Skill {

    public enum Proficiency {
        FUNDAMENTAL("Fundamental"),
        NOVICE("Novice"),
        INTERMEDIATE("Intermediate"),
        ADVANCED("Advanced"),
        EXPERT("Expert");

        private String label;

        Proficiency(String label) {
            this.label = label;
        }

        @Override
        public String toString() {
            return label;
        }
    }

    private SkillName name;
    private Proficiency proficiency;

    public Skill() {
    }

    public Skill(SkillName name, Proficiency proficiency) {
        this.name = name;
        this.proficiency = proficiency;
    }

    public Skill(SkillName name, SkillProficiency proficiency) {
        this.name = name;
        this.proficiency = proficiency.getValue();
    }

    public SkillName getName() {
        return name;
    }

    public void setName(SkillName name) {
        this.name = name;
    }

    public Proficiency getProficiency() {
        return proficiency;
    }

    public void setProficiency(Proficiency proficiency) {
        this.proficiency = proficiency;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(name).append(", ").append(proficiency);

        return sb.toString();
    }
}
