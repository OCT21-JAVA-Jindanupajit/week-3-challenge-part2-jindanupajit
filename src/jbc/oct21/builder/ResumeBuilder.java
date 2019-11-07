package jbc.oct21.builder;

import jbc.oct21.ExtendsType.*;
import jbc.oct21.Interface.UserInput;
import jbc.oct21.model.*;

import java.io.InputStream;
import java.io.PrintStream;

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


    // This method will auto populate data from user input
    // and hand over to appropriate builder, if needed
    @Override // see super class for more information
    public void auto(PrintStream printStream, InputStream inputStream) {
        YesNo askUserYesOrNo = new YesNo();

        printStream.println("\nResume Input\n");


        FirstName firstName = new FirstName();
        firstName.retrieve(printStream, inputStream);

        MiddleName middleName = new MiddleName();
        middleName.retrieve(printStream, inputStream);

        LastName lastName = new LastName();
        lastName.retrieve(printStream, inputStream);

        this.set(new Name(firstName, middleName, lastName));

        Email email = new Email();
        email.retrieve(printStream, inputStream);

        this.set(email);

        Phone phone = new Phone();
        phone.retrieve(printStream, inputStream);

        this.set(phone);

        printStream.println("\nEducation Input\n");
        do {
            EducationBuilder educationBuilder = new EducationBuilder();
            educationBuilder.auto(printStream, inputStream);
            this.append(educationBuilder.toEducation());
            printStream.print("\nMore Education ");
            askUserYesOrNo.retrieve(printStream, inputStream);
        } while(askUserYesOrNo.isYes());

        printStream.println("\nExperience Input\n");
        do {
            ExperienceBuilder experienceBuilder = new ExperienceBuilder();
            experienceBuilder.auto(printStream, inputStream);
            this.append(experienceBuilder.toExperience());
            printStream.print("\nMore Experience ");
            askUserYesOrNo.retrieve(printStream, inputStream);
        } while(askUserYesOrNo.isYes());

        printStream.println("\nSkill Input\n");
        do {
            SkillBuilder skillBuilder = new SkillBuilder();
            skillBuilder.auto(printStream, inputStream);
            this.append(skillBuilder.toSkill());

            do {
                printStream.print("\nMore Skill ");
                askUserYesOrNo.retrieve(printStream, inputStream);
                if (askUserYesOrNo.isNo() && this.resume.getSkillCollection().size() < 3)
                    printStream.printf("\n * You need at least 3 skills, now %d!\n", this.resume.getSkillCollection().size());
                else
                    break;
            } while(true);

        } while(askUserYesOrNo.isYes());

    }
}
