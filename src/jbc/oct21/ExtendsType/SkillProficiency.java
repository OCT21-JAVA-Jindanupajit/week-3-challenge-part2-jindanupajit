package jbc.oct21.ExtendsType;

import jbc.oct21.model.Skill;

public class SkillProficiency extends ExtendsType<Skill.Proficiency> {
    public SkillProficiency() {
    }

    public SkillProficiency(Skill.Proficiency value) {
        super(value);
    }

    @Override
    public String guide() {
        return "[F]undamental, [N]ovice, [I]ntermediate, [A]dvance, [E]xpert answer: 'f','n','i','a', or 'e'";
    }

    @Override
    public String toString() {
        return this.getValue().toString();
    }

    @Override
    public Skill.Proficiency store(String string) {
        switch(string.toLowerCase()) {
            case "f": setValue(Skill.Proficiency.FUNDAMENTAL);
                    return Skill.Proficiency.FUNDAMENTAL;
            case "n": setValue(Skill.Proficiency.NOVICE);
                return Skill.Proficiency.NOVICE;
            case "i": setValue(Skill.Proficiency.INTERMEDIATE);
                return Skill.Proficiency.INTERMEDIATE;
            case "a": setValue(Skill.Proficiency.ADVANCED);
                return Skill.Proficiency.ADVANCED;
            case "e": setValue(Skill.Proficiency.EXPERT);
                return Skill.Proficiency.EXPERT;
        }

        return Skill.Proficiency.FUNDAMENTAL;
    }

    @Override
    public boolean isValidValue(String string) {
        switch(string.toLowerCase()) {
            case "f":
            case "n":
            case "i":
            case "a":
            case "e":
                return true;
            default:
                return false;
        }
    }
}
