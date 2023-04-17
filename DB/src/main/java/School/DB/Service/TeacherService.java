package School.DB.Service;

import School.DB.Entity.Teacher;
import School.DB.Repository.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepo teacherRepo;

    public Teacher addTeacher (Teacher teacher) {
        return teacherRepo.save(teacher);
    }

    public List<Teacher> getTeacher(){
        return teacherRepo.findAll();
    }
    public void deleteTeacher(int id) {

        teacherRepo.deleteById(id);
    }
}
