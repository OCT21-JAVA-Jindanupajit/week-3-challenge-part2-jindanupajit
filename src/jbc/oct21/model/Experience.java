package jbc.oct21.model;

import jbc.oct21.ExtendsType.Company;
import jbc.oct21.ExtendsType.EndDate;
import jbc.oct21.ExtendsType.StartDate;
import jbc.oct21.ExtendsType.Title;

import java.util.Date;

public class Experience {
    private Title title;
    private Company company;
    private StartDate start;
    private EndDate end;
    private final JobDescriptionCollection jobDescriptionCollection = new JobDescriptionCollection();

    public Experience() {
    }

    public Experience(Title title, Company company, StartDate start, EndDate end, JobDescriptionCollection jobDescriptionCollection) {
        this.title = title;
        this.company = company;
        this.start = start;
        this.end = end;
        this.jobDescriptionCollection.addAll(jobDescriptionCollection);
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public StartDate getStart() {
        return start;
    }

    public void setStart(StartDate start) {
        this.start = start;
    }

    public EndDate getEnd() {
        return end;
    }

    public void setEnd(EndDate end) {
        this.end = end;
    }

    public JobDescriptionCollection getJobDescriptionCollection() {
        return jobDescriptionCollection;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(title).append("\n")
                .append(company).append(", ")
                    .append(start).append(" - ")
                    .append(end).append("\n")
                .append(jobDescriptionCollection)
                .append("\n");


        return sb.toString();
    }
}
