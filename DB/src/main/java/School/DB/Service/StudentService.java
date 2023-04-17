package School.DB.Service;

import School.DB.Entity.Student;
import School.DB.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    public Student saveDetails(Student student) {

        return studentRepo.save(student);
    }

    public List<Student> getDetails() {
        return studentRepo.findAll();
    }

    public void deleteStudent(int id) {
         studentRepo.deleteById(id);
    }
}