package School.DB.Controller;

import School.DB.Entity.Teacher;
import School.DB.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @PostMapping("/addTeacher")
    public Teacher addTeacher(@RequestBody Teacher teacher){
        return teacherService.addTeacher(teacher);
    }
    @GetMapping("/teacher")
    public List<Teacher> getTeachers(){
        return teacherService.getTeacher();
    }
    @DeleteMapping("/removeTeacher")
    public void deleteTeacher(int id){
        teacherService.deleteTeacher(id);
    }
}
