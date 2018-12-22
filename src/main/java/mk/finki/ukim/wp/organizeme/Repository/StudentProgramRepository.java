package mk.finki.ukim.wp.organizeme.Repository;

import mk.finki.ukim.wp.organizeme.Model.StudyProgram;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentProgramRepository extends JpaRepository<StudyProgram, Integer> {
}
