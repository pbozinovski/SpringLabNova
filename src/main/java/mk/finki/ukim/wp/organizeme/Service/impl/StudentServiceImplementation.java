package mk.finki.ukim.wp.organizeme.Service.impl;


import mk.finki.ukim.wp.organizeme.Model.Student;
import mk.finki.ukim.wp.organizeme.Repository.StudentsRepository;
import mk.finki.ukim.wp.organizeme.Service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImplementation implements StudentService
{
    private final StudentsRepository  repository;

    public StudentServiceImplementation(StudentsRepository repository) {
        this.repository = repository;
    }

    @Override
    public Student findOne(Integer id) {
        return null;
    }
}
