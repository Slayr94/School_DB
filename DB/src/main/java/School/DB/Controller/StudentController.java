package School.DB.Controller;

import School.DB.Entity.Student;
import School.DB.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/addStudent")
    public Student addDetails(@RequestBody Student student) {
        return studentService.saveDetails(student);
    }
    @GetMapping("/student")
    public List<Student> getDetails(){
        return studentService.getDetails();
    }
    @DeleteMapping("/removeStudent")
    public void deleteStudent(int id){
        studentService.deleteStudent(id);
    }
}
