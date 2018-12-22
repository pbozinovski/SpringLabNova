package mk.finki.ukim.wp.organizeme.Repository;

import mk.finki.ukim.wp.organizeme.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentsRepository extends JpaRepository<Student, Integer> {

}
