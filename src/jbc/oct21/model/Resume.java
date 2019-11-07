package jbc.oct21.model;

import jbc.oct21.ExtendsType.*;

public class Resume {
    private final Name name = new Name();
    private Email email;
    private Phone phone;
    private final EducationCollection educationCollection = new EducationCollection();
    private final ExperienceCollection experinceCollection = new ExperienceCollection();
    private final SkillCollection skillCollection = new SkillCollection();

    public Resume() {
    }

    public Resume(Name name, Email email, Phone phone) {
        this.name.setFirst(name.getFirst());
        this.name.setMiddle(name.getMiddle());
        this.name.setLast(name.getLast());
        this.email = email;
        this.phone = phone;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name.setFirst(name.getFirst());
        this.name.setMiddle(name.getMiddle());
        this.name.setLast(name.getLast());
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public EducationCollection getEducationCollection() {
        return educationCollection;
    }

    public ExperienceCollection getExperinceCollection() {
        return experinceCollection;
    }

    public SkillCollection getSkillCollection() {
        return skillCollection;
    }
}
