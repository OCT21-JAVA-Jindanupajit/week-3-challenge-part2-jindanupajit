package jbc.oct21.builder;

import jbc.oct21.ExtendsType.SkillName;
import jbc.oct21.model.Skill;

public class SkillBuilder extends Builder {
    Skill skill = new Skill();

    public SkillBuilder() {
    }

    public SkillBuilder(Skill skill) {
        this.skill = skill;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public SkillBuilder set(SkillName skillName) {
        this.skill.setName(skillName);
        return this;
    }

    public SkillBuilder set(Skill.Proficiency skillProficiency) {
        this.skill.setProficiency(skillProficiency);
        return this;
    }

    public Skill toSkill() {
        return skill;
    }
}
