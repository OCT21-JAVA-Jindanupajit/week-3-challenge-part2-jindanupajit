package jbc.oct21.model;

import jbc.oct21.ExtendsType.DegreeType;
import jbc.oct21.ExtendsType.GraduationYear;
import jbc.oct21.ExtendsType.Major;
import jbc.oct21.ExtendsType.University;


public class Education {
    private DegreeType degreeType = new DegreeType();
    private Major major = new Major();
    private University university = new University();
    private GraduationYear graduationYear = new GraduationYear();

    public Education() {
    }

    public Education(DegreeType degreeType, Major major, University university, GraduationYear graduationYear) {
        this.degreeType = degreeType;
        this.major = major;
        this.university = university;
        this.graduationYear = graduationYear;
    }

    public DegreeType getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(DegreeType degreeType) {
        this.degreeType = degreeType;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public GraduationYear getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(GraduationYear graduationYear) {
        this.graduationYear = graduationYear;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(degreeType)
                .append(" in ")
                .append(major)
                .append("\n")
          .append(university)
                .append(", ")
                .append(graduationYear);

        return sb.toString();
    }
}
