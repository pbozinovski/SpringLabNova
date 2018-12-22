package mk.finki.ukim.wp.organizeme.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class StudyProgram {
    @Id
    //@GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "studyProgram")
    public List<Student> students;


    public StudyProgram(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public StudyProgram() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
