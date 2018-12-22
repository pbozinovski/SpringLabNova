package mk.finki.ukim.wp.organizeme.Web.rest;

import mk.finki.ukim.wp.organizeme.Model.Student;
import mk.finki.ukim.wp.organizeme.Model.StudyProgram;
import mk.finki.ukim.wp.organizeme.Repository.StudentProgramRepository;
import mk.finki.ukim.wp.organizeme.Repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@CrossOrigin({"*", "localhost:3000"})
@RestController
@RequestMapping(value = "/rest/students", produces = MediaType.APPLICATION_JSON_VALUE)
public class StudentResource {

    @Autowired
    StudentsRepository studentsRepository;
    @Autowired
    StudentProgramRepository studentsProgramRepository;

    @GetMapping("/all")
    public List<Student> getAll(){

        StudyProgram studyProgram = new StudyProgram(1L, "ASI");
        StudyProgram studyProgram2 = new StudyProgram(2L, "PET");
        StudyProgram studyProgram3 = new StudyProgram(3L, "KNI");
        StudyProgram studyProgram4 = new StudyProgram(4L, "PIT");
        studentsProgramRepository.save(studyProgram);
        studentsProgramRepository.save(studyProgram2);
        studentsProgramRepository.save(studyProgram3);
        studentsProgramRepository.save(studyProgram4);
//        Student student = new Student("12312", "Marijo", "Kostancev", studyProgram);
//        Student student2 = new Student("143102", "Petar", "Bozinovski", studyProgram2);
//        studentsRepository.save(student);
//        studentsRepository.save(student2);
        return studentsRepository.findAll();
    };

    @GetMapping("/allPrograms")
    public List<StudyProgram> getAllPrograms(){return studentsProgramRepository.findAll();}


    @GetMapping("/one/{id}")
    public Optional<Student> getOne(@PathVariable Integer id) {
        return studentsRepository.findById(id);
    }


    @PostMapping("/addprogram")
    public List<StudyProgram> addStudyProgram(@RequestBody final StudyProgram studyProgram){
        //studentsProgramRepository.save(null);
        studentsProgramRepository.save(studyProgram);
        return studentsProgramRepository.findAll();
    }

    //NE RADI!!!
    @PostMapping("/add")
    public List<Student> addStudent(@RequestBody final Student student){
        //studentsProgramRepository.save(null);
        addStudyProgram(student.getStudyProgram());
        studentsRepository.save(student);
        return studentsRepository.findAll();
    }

    @PatchMapping("/update")
    public Student updateStudent(@RequestBody final Student student){
        studentsRepository.deleteById(student.getId());


        return studentsRepository.save(student);
    }


    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Integer id){
        studentsRepository.deleteById(id);
    }

    @DeleteMapping("/allPrograms")
    public void deleteAllPrograms(){
        studentsProgramRepository.deleteAll();
    }

    @DeleteMapping("/all")
    public void deleteAllStudents(){
        studentsRepository.deleteAll();
        deleteAllPrograms();
    }



}
