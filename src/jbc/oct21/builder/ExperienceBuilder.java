package jbc.oct21.builder;

import jbc.oct21.ExtendsType.*;
import jbc.oct21.model.DegreeType;
import jbc.oct21.model.Experience;

public class ExperienceBuilder extends Builder {

    private Experience experience = new Experience();

    public ExperienceBuilder() {
    }

    public ExperienceBuilder(Experience experience) {
        this.experience = experience;
    }

    public Experience getExperience() {
        return experience;
    }

    public void setExperience(Experience experience) {
        this.experience = experience;
    }

    public ExperienceBuilder set(Title title) {
        this.experience.setTitle(title);
        return this;
    }

    public ExperienceBuilder set(Company company) {
        this.experience.setCompany(company);
        return this;
    }

    public ExperienceBuilder set(StartDate startDate) {
        this.experience.setStart(startDate);
        return this;
    }

    public ExperienceBuilder set(EndDate endDate) {
        this.experience.setEnd(endDate);
        return this;
    }

    public ExperienceBuilder append(JobDescription jobDescription) {
        this.experience.getJobDescriptionCollection().add(jobDescription);
        return this;
    }

    public Experience toExperience() {
        return experience;
    }
}
