package jbc.oct21.builder;

import jbc.oct21.ExtendsType.*;
import jbc.oct21.model.*;

public class ResumeBuilder extends Builder {

    private Resume resume = new Resume();


    public ResumeBuilder() {

    }

    public ResumeBuilder(Resume resume) {
        this.resume = resume;
    }

    public Resume getResume() {
        return resume;
    }

    public void setResume(Resume resume) {
        this.resume = resume;
    }

    public ResumeBuilder set(Name name) {
        this.resume.setName(name);
        return this;
    }

    public ResumeBuilder set(Email email) {
        this.resume.setEmail(email);
        return this;
    }

    public ResumeBuilder set(Phone phone) {
        this.resume.setPhone(phone);
        return this;
    }
    public ResumeBuilder append(Education education) {
        this.resume.getEducationCollection().add(education);
        return this;
    }

    public ResumeBuilder append(Experience experience) {
        this.resume.getExperinceCollection().add(experience);
        return this;
    }

    public ResumeBuilder append(Skill skill) {
        this.resume.getSkillCollection().add(skill);
        return this;
    }

    public Resume toResume() {
        return resume;
    }
}
