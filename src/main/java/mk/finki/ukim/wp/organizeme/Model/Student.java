package mk.finki.ukim.wp.organizeme.Model;

import javax.persistence.*;

@Entity
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String ind;
    private String name;
    private String lastName;
    @ManyToOne
    private StudyProgram studyProgram;

    public Student() {
    }

    public Student(String ind, String name, String lastName, StudyProgram studyProgram) {
        this.ind = ind;
        this.name = name;
        this.lastName = lastName;
        this.studyProgram = studyProgram;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getInd() {
        return ind;
    }

    public void setInd(String ind) {
        this.ind = ind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public StudyProgram getStudyProgram() {
        return studyProgram;
    }

    public void setStudyProgram(StudyProgram studyProgram) {
        this.studyProgram = studyProgram;
    }
}
