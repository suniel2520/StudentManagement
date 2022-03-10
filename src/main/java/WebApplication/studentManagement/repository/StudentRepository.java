package WebApplication.studentManagement.repository;

import WebApplication.studentManagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
